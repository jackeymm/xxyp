package com.xxyp.redis;

import redis.clients.jedis.BinaryClient.LIST_POSITION;
import redis.clients.jedis.*;
import redis.clients.util.SafeEncoder;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 二进制读取
 * @author jackeymm
 *
 */

public class BinaryRedisImpl implements BinaryJedisCommands {
	
	private IShardingStrategyFactory shardingStrategyFactory;
	
	private Map<RedisNode, Jedis> resources = new ConcurrentHashMap(new LinkedHashMap<RedisNode, Jedis>());
 
	public IShardingStrategyFactory getShardingStrategyFactory() {
		return shardingStrategyFactory;
	}

	public void setShardingStrategyFactory(
			IShardingStrategyFactory shardingStrategyFactory) {
		this.shardingStrategyFactory = shardingStrategyFactory;
	}
	
	public BinaryRedisImpl(IShardingStrategyFactory shardingStrategyFactory){
		this.shardingStrategyFactory = shardingStrategyFactory;
	}
	
	protected Jedis getJedis(byte[] key) {
		return getJedis(SafeEncoder.encode(key));
	}
	
	protected Jedis getJedis(String key){
		if(key == null || "".equals(key)){
			return null;
		}
		Jedis jedis = null;
		IShardingStrategy shardingStrategy = shardingStrategyFactory.getShardingStrategy();
		RedisNode redisNode = shardingStrategy.getRedisNode(key);
		jedis = resources.get(redisNode);
		if(jedis != null){
			//System.out.println("++++++++++++从Cache中获取Jedis对象++++++++++++++++++++++++++");
			return jedis;
		}
		//System.out.println("+++++++++++++初始化Jedis对象++++++++++++++++++");
		JedisShardInfo shardInfo = new JedisShardInfo(redisNode.getHost(), redisNode.getPort(), redisNode.getTimeout(), "ready");
		jedis = new Jedis(shardInfo);
		resources.put(redisNode, jedis);
		return jedis;
	}
	
	protected Collection<Jedis> getAllJedises() {
		return resources.values();
	}
	
	public void disconnect() {
		for (Jedis jedis : resources.values()) {
			jedis.quit();
			jedis.disconnect();
		}
	}

	@Override
	public Long append(byte[] key, byte[] value) {
		Jedis j = getJedis(key);
		return j.append(key, value);
	}

	@Override
	public Long decr(byte[] key) {
		Jedis j = getJedis(key);
		return j.decr(key);
	}

	@Override
	public Long decrBy(byte[] key, long integer) {
		Jedis j = getJedis(key);
		return j.decrBy(key, integer);
	}

	@Override
	public Boolean exists(byte[] key) {
		Jedis j = getJedis(key);
		return j.exists(key);
	}

	@Override
	public Long expire(byte[] key, int seconds) {
		Jedis j = getJedis(key);
		return j.expire(key, seconds);
	}

	@Override
	public Long expireAt(byte[] key, long seconds) {
		Jedis j = getJedis(key);
		return j.expireAt(key, seconds);
	}

	@Override
	public byte[] get(byte[] key) {
		Jedis j = getJedis(key);
		return j.get(key);
	}

	@Override
	public byte[] getSet(byte[] key, byte[] value) {
		Jedis j = getJedis(key);
		return j.getSet(key, value);
	}

	public Long hdel(byte[] key, byte[] field) {
		Jedis j = getJedis(key);
		return j.hdel(key, field);
	}

	@Override
	public Boolean hexists(byte[] key, byte[] field) {
		Jedis j = getJedis(key);
		return j.hexists(key, field);
	}

	@Override
	public byte[] hget(byte[] key, byte[] field) {
		Jedis j = getJedis(key);
		return j.hget(key, field);
	}

	@Override
	public Map<byte[], byte[]> hgetAll(byte[] key) {
		Jedis j = getJedis(key);
		return j.hgetAll(key);
	}

	@Override
	public Long hincrBy(byte[] key, byte[] field, long value) {
		Jedis j = getJedis(key);
		return j.hincrBy(key, field, value);
	}

	@Override
	public Set<byte[]> hkeys(byte[] key) {
		Jedis j = getJedis(key);
		return j.hkeys(key);
	}

	@Override
	public Long hlen(byte[] key) {
		Jedis j = getJedis(key);
		return j.hlen(key);
	}

	@Override
	public List<byte[]> hmget(byte[] key, byte[]... fields) {
		Jedis j = getJedis(key);
		return j.hmget(key, fields);
	}

	@Override
	public String hmset(byte[] key, Map<byte[], byte[]> hash) {
		Jedis j = getJedis(key);
		return j.hmset(key, hash);
	}

	@Override
	public Long hset(byte[] key, byte[] field, byte[] value) {
		Jedis j = getJedis(key);
		return j.hset(key, field, value);
	}

	@Override
	public Long hsetnx(byte[] key, byte[] field, byte[] value) {
		Jedis j = getJedis(key);
		return j.hsetnx(key, field, value);
	}

	@Override
	public Collection<byte[]> hvals(byte[] key) {
		Jedis j = getJedis(key);
		return j.hvals(key);
	}

	@Override
	public Long incr(byte[] key) {
		Jedis j = getJedis(key);
		return j.incr(key);
	}

	@Override
	public Long incrBy(byte[] key, long integer) {
		Jedis j = getJedis(key);
		return j.incrBy(key, integer);
	}

	public byte[] lindex(byte[] key, int index) {
		Jedis j = getJedis(key);
		return j.lindex(key, index);
	}

	@Override
	public Long linsert(byte[] key, LIST_POSITION where, byte[] pivot,
						byte[] value) {
		Jedis j = getJedis(key);
		return j.linsert(key, where, pivot, value);
	}

	@Override
	public Long llen(byte[] key) {
		Jedis j = getJedis(key);
		return j.llen(key);
	}

	@Override
	public byte[] lpop(byte[] key) {
		Jedis j = getJedis(key);
		return j.lpop(key);
	}

	public Long lpush(byte[] key, byte[] string) {
		Jedis j = getJedis(key);
		return j.lpush(key, string);
	}

	public List<byte[]> lrange(byte[] key, int start, int end) {
		Jedis j = getJedis(key);
		return j.lrange(key, start, end);
	}

	public Long lrem(byte[] key, int count, byte[] value) {
		Jedis j = getJedis(key);
		return j.lrem(key, count, value);
	}

	public String lset(byte[] key, int index, byte[] value) {
		Jedis j = getJedis(key);
		return j.lset(key, index, value);
	}

	public String ltrim(byte[] key, int start, int end) {
		Jedis j = getJedis(key);
		return j.ltrim(key, start, end);
	}

	@Override
	public byte[] rpop(byte[] key) {
		Jedis j = getJedis(key);
		return j.rpop(key);
	}

	public Long rpush(byte[] key, byte[] string) {
		Jedis j = getJedis(key);
		return j.rpush(key, string);
	}

	public Long sadd(byte[] key, byte[] member) {
		Jedis j = getJedis(key);
		return j.sadd(key, member);
	}

	@Override
	public Long scard(byte[] key) {
		Jedis j = getJedis(key);
		return j.scard(key);
	}

	@Override
	public String set(byte[] key, byte[] value) {
		Jedis j = getJedis(key);
		return j.set(key, value);
	}

	@Override
	public String setex(byte[] key, int seconds, byte[] value) {
		Jedis j = getJedis(key);
		return j.setex(key, seconds, value);
	}

	@Override
	public Long setnx(byte[] key, byte[] value) {
		Jedis j = getJedis(key);
		return j.setnx(key, value);
	}

	@Override
	public Boolean sismember(byte[] key, byte[] member) {
		Jedis j = getJedis(key);
		return j.sismember(key, member);
	}

	@Override
	public Set<byte[]> smembers(byte[] key) {
		Jedis j = getJedis(key);
		return j.smembers(key);
	}

	@Override
	public List<byte[]> sort(byte[] key) {
		Jedis j = getJedis(key);
		return j.sort(key);
	}

	@Override
	public List<byte[]> sort(byte[] key, SortingParams sortingParameters) {
		Jedis j = getJedis(key);
		return j.sort(key, sortingParameters);
	}

	@Override
	public byte[] spop(byte[] key) {
		Jedis j = getJedis(key);
		return j.spop(key);
	}

	@Override
	public byte[] srandmember(byte[] key) {
		Jedis j = getJedis(key);
		return j.srandmember(key);
	}

	public Long srem(byte[] key, byte[] member) {
		Jedis j = getJedis(key);
		return j.srem(key, member);
	}

	@Override
	public byte[] substr(byte[] key, int start, int end) {
		Jedis j = getJedis(key);
		return j.substr(key, start, end);
	}

	@Override
	public Long ttl(byte[] key) {
		Jedis j = getJedis(key);
		return j.ttl(key);
	}

	@Override
	public String type(byte[] key) {
		Jedis j = getJedis(key);
		return j.type(key);
	}

	@Override
	public Long zadd(byte[] key, double score, byte[] member) {
		Jedis j = getJedis(key);
		return j.zadd(key, score, member);
	}

	@Override
	public Long zcard(byte[] key) {
		Jedis j = getJedis(key);
		return j.zcard(key);
	}

	@Override
	public Long zcount(byte[] key, double min, double max) {
		Jedis j = getJedis(key);
		return j.zcount(key, min, max);
	}

	@Override
	public Double zincrby(byte[] key, double score, byte[] member) {
		Jedis j = getJedis(key);
		return j.zincrby(key, score, member);
	}

	public Set<byte[]> zrange(byte[] key, int start, int end) {
		Jedis j = getJedis(key);
		return j.zrange(key, start, end);
	}

	@Override
	public Set<byte[]> zrangeByScore(byte[] key, double min, double max) {
		Jedis j = getJedis(key);
		return j.zrangeByScore(key, min, max);
	}

	@Override
	public Set<byte[]> zrangeByScore(byte[] key, double min, double max,
			int offset, int count) {
		Jedis j = getJedis(key);
		return j.zrangeByScore(key, min, max, offset, count);
	}

	@Override
	public Set<Tuple> zrangeByScoreWithScores(byte[] key, double min,
											  double max) {
		Jedis j = getJedis(key);
		return j.zrangeByScoreWithScores(key, min, max);
	}

	@Override
	public Set<Tuple> zrangeByScoreWithScores(byte[] key, double min,
											  double max, int offset, int count) {
		Jedis j = getJedis(key);
		return j.zrangeByScoreWithScores(key, min, max, offset, count);
	}

	public Set<Tuple> zrangeWithScores(byte[] key, int start, int end) {
		Jedis j = getJedis(key);
		return j.zrangeWithScores(key, start, end);
	}

	@Override
	public Long zrank(byte[] key, byte[] member) {
		Jedis j = getJedis(key);
		return j.zrank(key, member);
	}

	public Long zrem(byte[] key, byte[] member) {
		Jedis j = getJedis(key);
		return j.zrem(key, member);
	}

	public Long zremrangeByRank(byte[] key, int start, int end) {
		Jedis j = getJedis(key);
		return j.zremrangeByRank(key, start, end);
	}

	@Override
	public Long zremrangeByScore(byte[] key, double start, double end) {
		Jedis j = getJedis(key);
		return j.zremrangeByScore(key, start, end);
	}

	public Set<byte[]> zrevrange(byte[] key, int start, int end) {
		Jedis j = getJedis(key);
		return j.zrevrange(key, start, end);
	}

	@Override
	public Set<byte[]> zrevrangeByScore(byte[] key, double max, double min) {
		Jedis j = getJedis(key);
		return j.zrevrangeByScore(key, max, min);
	}

	@Override
	public Set<byte[]> zrevrangeByScore(byte[] key, double max, double min,
			int offset, int count) {
		Jedis j = getJedis(key);
		return j.zrevrangeByScore(key, max, min, offset, count);
	}

	@Override
	public Set<Tuple> zrevrangeByScoreWithScores(byte[] key, double max,
												 double min) {
		Jedis j = getJedis(key);
		return j.zrevrangeByScoreWithScores(key, max, min);
	}

	@Override
	public Set<Tuple> zrevrangeByScoreWithScores(byte[] key, double max,
												 double min, int offset, int count) {
		Jedis j = getJedis(key);
		return j.zrevrangeByScoreWithScores(key, max, min, offset, count);
	}

	public Set<Tuple> zrevrangeWithScores(byte[] key, int start, int end) {
		Jedis j = getJedis(key);
		return j.zrevrangeWithScores(key, start, end);
	}

	@Override
	public Long zrevrank(byte[] key, byte[] member) {
		Jedis j = getJedis(key);
		return j.zrevrank(key, member);
	}

	@Override
	public Double zscore(byte[] key, byte[] member) {
		Jedis j = getJedis(key);
		return j.zscore(key, member);
	}

	@Override
	public Long bitcount(byte[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long bitcount(byte[] arg0, long arg1, long arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<byte[]> blpop(byte[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<byte[]> brpop(byte[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long del(byte[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] echo(byte[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean getbit(byte[] arg0, long arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] getrange(byte[] arg0, long arg1, long arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long hdel(byte[] arg0, byte[]... arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] lindex(byte[] arg0, long arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long lpush(byte[] arg0, byte[]... arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long lpushx(byte[] arg0, byte[]... arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<byte[]> lrange(byte[] arg0, long arg1, long arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long lrem(byte[] arg0, long arg1, byte[] arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String lset(byte[] arg0, long arg1, byte[] arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String ltrim(byte[] arg0, long arg1, long arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long move(byte[] arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long persist(byte[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long rpush(byte[] arg0, byte[]... arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long rpushx(byte[] arg0, byte[]... arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long sadd(byte[] arg0, byte[]... arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean setbit(byte[] arg0, long arg1, boolean arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean setbit(byte[] arg0, long arg1, byte[] arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long setrange(byte[] arg0, long arg1, byte[] arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long srem(byte[] arg0, byte[]... arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long strlen(byte[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long zadd(byte[] arg0, Map<byte[], Double> arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long zcount(byte[] arg0, byte[] arg1, byte[] arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<byte[]> zrange(byte[] arg0, long arg1, long arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<byte[]> zrangeByScore(byte[] arg0, byte[] arg1, byte[] arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<byte[]> zrangeByScore(byte[] arg0, byte[] arg1, byte[] arg2,
			int arg3, int arg4) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Tuple> zrangeByScoreWithScores(byte[] arg0, byte[] arg1,
											  byte[] arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Tuple> zrangeByScoreWithScores(byte[] arg0, byte[] arg1,
											  byte[] arg2, int arg3, int arg4) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Tuple> zrangeWithScores(byte[] arg0, long arg1, long arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long zrem(byte[] arg0, byte[]... arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long zremrangeByRank(byte[] arg0, long arg1, long arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long zremrangeByScore(byte[] arg0, byte[] arg1, byte[] arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<byte[]> zrevrange(byte[] arg0, long arg1, long arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<byte[]> zrevrangeByScore(byte[] arg0, byte[] arg1, byte[] arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<byte[]> zrevrangeByScore(byte[] arg0, byte[] arg1, byte[] arg2,
			int arg3, int arg4) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Tuple> zrevrangeByScoreWithScores(byte[] arg0, byte[] arg1,
												 byte[] arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Tuple> zrevrangeByScoreWithScores(byte[] arg0, byte[] arg1,
												 byte[] arg2, int arg3, int arg4) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Tuple> zrevrangeWithScores(byte[] arg0, long arg1, long arg2) {
		// TODO Auto-generated method stub
		return null;
	}

}
