package com.xxyp.redis;

import org.apache.commons.pool2.BasePooledObjectFactory;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.impl.DefaultPooledObject;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.Jedis;
import redis.clients.util.Pool;

public class RedisClientPool extends Pool<RedisClient> {

	public RedisClientPool(final GenericObjectPoolConfig poolConfig, IShardingStrategyFactory shardingStrategyFactory) {
		super(poolConfig, new RedisPoolFactory(shardingStrategyFactory));
	}

	static class RedisPoolFactory extends BasePooledObjectFactory<RedisClient> {

		private IShardingStrategyFactory shardingStrategyFactory;
		
		public RedisPoolFactory(IShardingStrategyFactory shardingStrategyFactory){
			this.shardingStrategyFactory = shardingStrategyFactory;
		}

		@Override
		public RedisClient create() throws Exception {
			RedisClient redisClient = new RedisClient(shardingStrategyFactory);
			return redisClient;
		}

		@Override
		public PooledObject<RedisClient> wrap(RedisClient o) {
			return new DefaultPooledObject<RedisClient>(o);
		}

		@Override
		public boolean validateObject(PooledObject<RedisClient> p) {
			try {
				RedisClient iredis = p.getObject();
				for (Jedis jedis : iredis.getAllJedises()) {
					if (!jedis.ping().equals("PONG")) {
						return false;
					}
				}
				return true;
			} catch (Exception ex) {
				return false;
			}
		}

		@Override
		public void activateObject(PooledObject<RedisClient> p) throws Exception {
			super.activateObject(p);
		}

		@Override
		public void passivateObject(PooledObject<RedisClient> p) throws Exception {
			super.passivateObject(p);
		}

		@Override
		public void destroyObject(PooledObject<RedisClient> p) throws Exception {
			if ((p != null)) {
				RedisClient client = p.getObject();
				for (Jedis jedis : client.getAllJedises()) {
					try {
						try {
							jedis.quit();
						} catch (Exception e) {
						}
						jedis.disconnect();
					} catch (Exception e) {
					}
				}
			}
		}
	}

}
