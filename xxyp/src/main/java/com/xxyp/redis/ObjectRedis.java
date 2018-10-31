package com.xxyp.redis;

import com.xxyp.utils.SerializeUtils;
import redis.clients.jedis.BinaryClient.LIST_POSITION;

/**
 * 扩展用对象方式读写
 * @author jackeymm
 *
 */

public class ObjectRedis extends BinaryRedisImpl{

	public ObjectRedis(IShardingStrategyFactory shardingStrategyFactory) {
		super(shardingStrategyFactory);
	}

	public Long append(String key, Object value) {
		byte[] bkey = key.getBytes();
		byte[] bo = SerializeUtils.serialize(value);
		return append(bkey, bo);
	}

	public Long decr(String key) {
		byte[] bkey = key.getBytes();
		return decr(bkey);
	}

	public Long decrBy(String key, long integer) {
		byte[] bkey = key.getBytes();
		return decrBy(bkey, integer);
	}

	public Boolean exists(String key) {
		byte[] bkey = key.getBytes();
		return exists(bkey);
	}

	public Long expire(String key, int seconds) {
		byte[] bkey = key.getBytes();
		return expire(bkey, seconds);
	}

	public Long expireAt(String key, long seconds) {
		byte[] bkey = key.getBytes();
		return expireAt(bkey, seconds);
	}

	public Object getObjectByKey(String key) {
		byte[] bkey = key.getBytes();
		return SerializeUtils.unserialize(get(bkey));
	}

	public Object getSet(String key, Object value) {
		byte[] bkey = key.getBytes();
		byte[] bo = SerializeUtils.serialize(value);
		return getSet(bkey, bo);
	}

	public Long hdel(String key, Object field) {
		byte[] bkey = key.getBytes();
		byte[] bf = SerializeUtils.serialize(field);
		return hdel(bkey, bf);
	}

	public Boolean hexists(String key, Object field) {
		byte[] bkey = key.getBytes();
		byte[] bf = SerializeUtils.serialize(field);
		return hexists(bkey, bf);
	}

	public Object hget(String key, Object field) {
		byte[] bkey = key.getBytes();
		byte[] bf = SerializeUtils.serialize(field);
		return hget(bkey, bf);
	}

	public Long hincrBy(String key, Object field, long value) {
		byte[] bkey = key.getBytes();
		byte[] bf = SerializeUtils.serialize(field);
		return hincrBy(bkey, bf, value);
	}

	public Long hlen(String key) {
		byte[] bkey = key.getBytes();
		return hlen(bkey);
	}

	public Long hset(String key, Object field, Object value) {
		byte[] bkey = key.getBytes();
		byte[] bf = SerializeUtils.serialize(field);
		byte[] bo = SerializeUtils.serialize(value);
		return hset(bkey, bf, bo);
	}

	public Long hsetnx(String key, Object field, Object value) {
		byte[] bkey = key.getBytes();
		byte[] bf = SerializeUtils.serialize(field);
		byte[] bo = SerializeUtils.serialize(value);
		return hsetnx(bkey, bf, bo);
	}

	public Long incr(String key) {
		byte[] bkey = key.getBytes();
		return incr(bkey);
	}

	public Long incrBy(String key, long integer) {
		byte[] bkey = key.getBytes();
		return incrBy(bkey, integer);
	}

	public Object lindex(String key, int index) {
		byte[] bkey = key.getBytes();
		return SerializeUtils.unserialize(lindex(bkey,index));
	}

	public Long linsert(String key, LIST_POSITION where, Object pivot,
						Object value) {
		byte[] bkey = key.getBytes();
		byte[] bpivot = SerializeUtils.serialize(pivot);
		byte[] bo = SerializeUtils.serialize(value);
		return linsert(bkey, where, bpivot, bo);
	}

	public Long llen(String key) {
		byte[] bkey = key.getBytes();
		return llen(bkey);
	}

	public Object lpop(String key) {
		byte[] bkey = key.getBytes();
		return SerializeUtils.unserialize(lpop(bkey));
	}

	public Long lpush(String key, Object string) {
		byte[] bkey = key.getBytes();
		byte[] bs = SerializeUtils.serialize(string);
		return lpush(bkey, bs);
	}
	
	public Long lrem(String key, int count, Object value) {
		byte[] bkey = key.getBytes();
		byte[] bo = SerializeUtils.serialize(value);
		return lrem(bkey, count, bo);
	}

	public String lset(String key, int index, Object value) {
		byte[] bkey = key.getBytes();
		byte[] bo = SerializeUtils.serialize(value);
		return lset(bkey, index, bo);
	}

	public String ltrim(String key, int start, int end) {
		byte[] bkey = key.getBytes();
		return ltrim(bkey, start, end);
	}

	public Object rpop(String key) {
        byte[] bkey = key.getBytes();
		return SerializeUtils.unserialize(rpop(bkey));
	}

	public Long rpush(String key, Object string) {
		byte[] bkey = key.getBytes();
		byte[] bs = SerializeUtils.serialize(string);
		return rpush(bkey, bs);
	}

	public Long sadd(String key, Object member) {
        byte[] bkey = key.getBytes();
        byte[] bm = SerializeUtils.serialize(member);
		return sadd(bkey, bm);
	}

	public Long scard(String key) {
		byte[] bkey = key.getBytes();
		return scard(bkey);
	}

	public String set(String key, Object value) {
		byte[] bkey = key.getBytes();
		byte[] bo = SerializeUtils.serialize(value);
		return set(bkey, bo);
	}

	public String setex(String key, int seconds, Object value) {
		byte[] bkey = key.getBytes();
		byte[] bo = SerializeUtils.serialize(value);
		return setex(bkey, seconds, bo);
	}

	public Long setnx(String key, Object value) {
		byte[] bkey = key.getBytes();
		byte[] bo = SerializeUtils.serialize(value);
		return setnx(bkey, bo);
	}

	public Boolean sismember(String key, Object member) {
		byte[] bkey = key.getBytes();
		byte[] bm = SerializeUtils.serialize(member);
		return sismember(bkey, bm);
	}

	public Object spop(String key) {
		byte[] bkey = key.getBytes();
		return SerializeUtils.unserialize(spop(bkey));
	}

	public Long srem(String key, Object member) {
		byte[] bkey = key.getBytes();
		byte[] bm = SerializeUtils.serialize(member);
		return srem(bkey, bm);
	}

	public Object substr(String key, int start, int end) {
		byte[] bkey = key.getBytes();
		return SerializeUtils.unserialize(substr(bkey, start, end));
	}

	public Long ttl(String key) {
		byte[] bkey = key.getBytes();
		return ttl(bkey);
	}

	public String type(String key) {
		byte[] bkey = key.getBytes();
		return type(bkey);
	}

	public Long zadd(String key, double score, Object member) {
		byte[] bkey = key.getBytes();
		byte[] bm = SerializeUtils.serialize(member);
		return zadd(bkey, score, bm);
	}

	public Long zcard(String key) {
		byte[] bkey = key.getBytes();
		return zcard(bkey);
	}

	public Long zcount(String key, double min, double max) {
		byte[] bkey = key.getBytes();
		return zcount(bkey, min, max);
	}

	public Double zincrby(String key, double score, Object member) {
		byte[] bkey = key.getBytes();
		byte[] bm = SerializeUtils.serialize(member);
		return zincrby(bkey, score, bm);
	}

	/*@Override
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

	@Override
	public Set<Tuple> zrangeWithScores(byte[] key, int start, int end) {
		Jedis j = getJedis(key);
		return j.zrangeWithScores(key, start, end);
	}

	@Override
	public Long zrank(byte[] key, byte[] member) {
		Jedis j = getJedis(key);
		return j.zrank(key, member);
	}

	@Override
	public Long zrem(byte[] key, byte[] member) {
		Jedis j = getJedis(key);
		return j.zrem(key, member);
	}

	@Override
	public Long zremrangeByRank(byte[] key, int start, int end) {
		Jedis j = getJedis(key);
		return j.zremrangeByRank(key, start, end);
	}

	@Override
	public Long zremrangeByScore(byte[] key, double start, double end) {
		Jedis j = getJedis(key);
		return j.zremrangeByScore(key, start, end);
	}

	@Override
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

	@Override
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
	}*/

}
