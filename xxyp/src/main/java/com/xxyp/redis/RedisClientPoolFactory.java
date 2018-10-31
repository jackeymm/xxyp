package com.xxyp.redis;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.locks.ReentrantLock;


@Component
public class RedisClientPoolFactory {
//	@Resource
	IShardingStrategyFactory shardingStrategyFactory;

	public IShardingStrategyFactory getShardingStrategyFactory() {
		return shardingStrategyFactory;
	}

	public void setShardingStrategyFactory(IShardingStrategyFactory shardingStrategyFactory) {
		this.shardingStrategyFactory = shardingStrategyFactory;
	}

	private RedisClientPool clientPool = null;

	private ReentrantLock lock = new ReentrantLock();

	public RedisClient getRedisClient() {
		if (null == clientPool) {
			lock.lock();
			try {
				if (clientPool == null) {
					initClientPool();
				}
			} finally {
				lock.unlock();
			}
		}
		return clientPool.getResource();
	}

	public void returnRedisClient(RedisClient redisClient) {
		// lock.lock();
		// try{
		if (redisClient != null && clientPool != null) {
			clientPool.returnResource(redisClient);
		}
		// }finally{
		// lock.unlock();
		// }

	}

	private void initClientPool() {
		GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
		/*
		 * 
		 *  poolConfig.maxActive = 100;
		 *  poolConfig.testOnBorrow = true;
		 *	poolConfig.maxIdle = 20;
		 *	poolConfig.maxWait = 100000L;
		 *	poolConfig.testWhileIdle = true;
		 *	poolConfig.minEvictableIdleTimeMillis = 60000;
		 *	poolConfig.timeBetweenEvictionRunsMillis = 30000;
		 */
		poolConfig.setMaxTotal(200);
		poolConfig.setMaxIdle(50);
//		设置最小空闲数
		poolConfig.setMinIdle(8);
		poolConfig.setMaxWaitMillis(100000L);
		poolConfig.setTestOnBorrow(true);
		poolConfig.setTestOnReturn(true);
		poolConfig.setTestWhileIdle(true);
//		表示一个对象至少停留在idle状态的最短时间，然后才能被idle object evitor扫描并驱逐；这一项只有在timeBetweenEvictionRunsMillis大于0时才有意义
		poolConfig.setMinEvictableIdleTimeMillis(60000);
//		表示idle object evitor两次扫描之间要sleep的毫秒数
		poolConfig.setTimeBetweenEvictionRunsMillis(30000);
//		表示idle object evitor每次扫描的最多的对象数
		poolConfig.setNumTestsPerEvictionRun(10);
		clientPool = new RedisClientPool(poolConfig, shardingStrategyFactory);
	}

}
