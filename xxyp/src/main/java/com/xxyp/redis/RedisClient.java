package com.xxyp.redis;

import com.xxyp.utils.SerializeUtils;
import redis.clients.jedis.BinaryClient.LIST_POSITION;
import redis.clients.jedis.*;
import redis.clients.util.SafeEncoder;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*;

public class RedisClient extends ObjectRedis implements JedisCommands {
    private static ExecutorService executorService = new ThreadPoolExecutor(100, 200, 20, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), new NamedThreadFactory("jedisx"),
            new ThreadPoolExecutor.AbortPolicy());

    public RedisClient(IShardingStrategyFactory shardingStrategyFactory) {
        super(shardingStrategyFactory);
    }

    @Override
    public void disconnect() {
        super.disconnect();
    }

    @Override
    public String set(String key, String value) {
        Jedis j = getJedis(key);
        return j.set(key, value);
    }

    @Override
    public String get(String key) {
        Jedis j = getJedis(key);
        return j.get(key);
    }

    @Override
    public Boolean exists(String key) {
        Jedis j = getJedis(key);
        return j.exists(key);
    }

    @Override
    public String type(String key) {
        Jedis j = getJedis(key);
        return j.type(key);
    }

    @Override
    public Long expire(String key, int seconds) {
        Jedis j = getJedis(key);
        return j.expire(key, seconds);
    }

    @Override
    public Long expireAt(String key, long unixTime) {
        Jedis j = getJedis(key);
        return j.expireAt(key, unixTime);
    }

    @Override
    public Long ttl(String key) {
        Jedis j = getJedis(key);
        return j.ttl(key);
    }

    @Override
    public Boolean setbit(String key, long offset, boolean value) {
        Jedis j = getJedis(key);
        return j.setbit(key, offset, value);
    }

    @Override
    public Boolean getbit(String key, long offset) {
        Jedis j = getJedis(key);
        return j.getbit(key, offset);
    }

    @Override
    public Long setrange(String key, long offset, String value) {
        Jedis j = getJedis(key);
        return j.setrange(key, offset, value);
    }

    @Override
    public String getrange(String key, long startOffset, long endOffset) {
        Jedis j = getJedis(key);
        return j.getrange(key, startOffset, endOffset);
    }

    @Override
    public String getSet(String key, String value) {
        Jedis j = getJedis(key);
        return j.getSet(key, value);
    }

    @Override
    public Long setnx(String key, String value) {
        Jedis j = getJedis(key);
        return j.setnx(key, value);
    }

    @Override
    public String setex(String key, int seconds, String value) {
        Jedis j = getJedis(key);
        return j.setex(key, seconds, value);
    }

    @Override
    public Long decrBy(String key, long integer) {
        Jedis j = getJedis(key);
        return j.decrBy(key, integer);
    }

    @Override
    public Long decr(String key) {
        Jedis j = getJedis(key);
        return j.decr(key);
    }

    @Override
    public Long incrBy(String key, long integer) {
        Jedis j = getJedis(key);
        return j.incrBy(key, integer);
    }

    @Override
    public Long incr(String key) {
        Jedis j = getJedis(key);
        return j.incr(key);
    }

    @Override
    public Long append(String key, String value) {
        Jedis j = getJedis(key);
        return j.append(key, value);
    }

    @Override
    public String substr(String key, int start, int end) {
        Jedis j = getJedis(key);
        return j.substr(key, start, end);
    }

    @Override
    public Long hset(String key, String field, String value) {
        Jedis j = getJedis(key);
        return j.hset(key, field, value);
    }

    @Override
    public String hget(String key, String field) {
        Jedis j = getJedis(key);
        return j.hget(key, field);
    }

    @Override
    public Long hsetnx(String key, String field, String value) {
        Jedis j = getJedis(key);
        return j.hsetnx(key, field, value);
    }

    @Override
    public String hmset(String key, Map<String, String> hash) {
        Jedis j = getJedis(key);
        return j.hmset(key, hash);
    }

    @Override
    public List<String> hmget(String key, String... fields) {
        Jedis j = getJedis(key);
        return j.hmget(key, fields);
    }

    @Override
    public Long hincrBy(String key, String field, long value) {
        Jedis j = getJedis(key);
        return j.hincrBy(key, field, value);
    }

    @Override
    public Boolean hexists(String key, String field) {
        Jedis j = getJedis(key);
        return j.hexists(key, field);
    }

    @Override
    public Long del(String key) {
        Jedis j = getJedis(key);
        return j.del(key);
    }

    public Long hdel(String key, String field) {
        Jedis j = getJedis(key);
        return j.hdel(key, field);
    }

    @Override
    public Long hlen(String key) {
        Jedis j = getJedis(key);
        return j.hlen(key);
    }

    @Override
    public Set<String> hkeys(String key) {
        Jedis j = getJedis(key);
        return j.hkeys(key);
    }

    @Override
    public List<String> hvals(String key) {
        Jedis j = getJedis(key);
        return j.hvals(key);
    }

    @Override
    public Map<String, String> hgetAll(String key) {
        Jedis j = getJedis(key);
        return j.hgetAll(key);
    }

    public Long rpush(String key, String string) {
        Jedis j = getJedis(key);
        return j.rpush(key, string);
    }

    public Long lpush(String key, String string) {
        Jedis j = getJedis(key);
        return j.lpush(key, string);
    }

    @Override
    public Long llen(String key) {
        Jedis j = getJedis(key);
        return j.llen(key);
    }

    @Override
    public List<String> lrange(String key, long start, long end) {
        Jedis j = getJedis(key);
        return j.lrange(key, start, end);
    }

    @Override
    public String ltrim(String key, long start, long end) {
        Jedis j = getJedis(key);
        return j.ltrim(key, start, end);
    }

    @Override
    public String lindex(String key, long index) {
        Jedis j = getJedis(key);
        return j.lindex(key, index);
    }

    @Override
    public String lset(String key, long index, String value) {
        Jedis j = getJedis(key);
        return j.lset(key, index, value);
    }

    @Override
    public Long lrem(String key, long count, String value) {
        Jedis j = getJedis(key);
        return j.lrem(key, count, value);
    }

    @Override
    public String lpop(String key) {
        Jedis j = getJedis(key);
        return j.lpop(key);
    }

    @Override
    public String rpop(String key) {
        Jedis j = getJedis(key);
        return j.rpop(key);
    }

    public Long sadd(String key, String member) {
        Jedis j = getJedis(key);
        return j.sadd(key, member);
    }

    @Override
    public Set<String> smembers(String key) {
        Jedis j = getJedis(key);
        return j.smembers(key);
    }

    public Long srem(String key, String member) {
        Jedis j = getJedis(key);
        return j.srem(key, member);
    }

    @Override
    public String spop(String key) {
        Jedis j = getJedis(key);
        return j.spop(key);
    }

    @Override
    public Long scard(String key) {
        Jedis j = getJedis(key);
        return j.scard(key);
    }

    @Override
    public Boolean sismember(String key, String member) {
        Jedis j = getJedis(key);
        return j.sismember(key, member);
    }

    @Override
    public String srandmember(String key) {
        Jedis j = getJedis(key);
        return j.srandmember(key);
    }

    @Override
    public Long zadd(String key, double score, String member) {
        Jedis j = getJedis(key);
        return j.zadd(key, score, member);
    }

    public Set<String> zrange(String key, int start, int end) {
        Jedis j = getJedis(key);
        return j.zrange(key, start, end);
    }

    public Long zrem(String key, String member) {
        Jedis j = getJedis(key);
        return j.zrem(key, member);
    }

    @Override
    public Double zincrby(String key, double score, String member) {
        Jedis j = getJedis(key);
        return j.zincrby(key, score, member);
    }

    @Override
    public Long zrank(String key, String member) {
        Jedis j = getJedis(key);
        return j.zrank(key, member);
    }

    @Override
    public Long zrevrank(String key, String member) {
        Jedis j = getJedis(key);
        return j.zrevrank(key, member);
    }

    public Set<String> zrevrange(String key, int start, int end) {
        Jedis j = getJedis(key);
        return j.zrevrange(key, start, end);
    }

    public Set<Tuple> zrangeWithScores(String key, int start, int end) {
        Jedis j = getJedis(key);
        return j.zrangeWithScores(key, start, end);
    }

    public Set<Tuple> zrevrangeWithScores(String key, int start, int end) {
        Jedis j = getJedis(key);
        return j.zrevrangeWithScores(key, start, end);
    }

    @Override
    public Long zcard(String key) {
        Jedis j = getJedis(key);
        return j.zcard(key);
    }

    @Override
    public Double zscore(String key, String member) {
        Jedis j = getJedis(key);
        return j.zscore(key, member);
    }

    @Override
    public List<String> sort(String key) {
        Jedis j = getJedis(key);
        return j.sort(key);
    }

    @Override
    public List<String> sort(String key, SortingParams sortingParameters) {
        Jedis j = getJedis(key);
        return j.sort(key, sortingParameters);
    }

    @Override
    public Long zcount(String key, double min, double max) {
        Jedis j = getJedis(key);
        return j.zcount(key, min, max);
    }

    @Override
    public Set<String> zrangeByScore(String key, double min, double max) {
        Jedis j = getJedis(key);
        return j.zrangeByScore(key, min, max);
    }

    @Override
    public Set<String> zrevrangeByScore(String key, double max, double min) {
        Jedis j = getJedis(key);
        return j.zrevrangeByScore(key, max, min);
    }

    @Override
    public Set<String> zrangeByScore(String key, double min, double max, int offset, int count) {
        Jedis j = getJedis(key);
        return j.zrangeByScore(key, min, max, offset, count);
    }

    @Override
    public Set<String> zrevrangeByScore(String key, double max, double min, int offset, int count) {
        Jedis j = getJedis(key);
        return j.zrevrangeByScore(key, max, min, offset, count);
    }

    @Override
    public Set<Tuple> zrangeByScoreWithScores(String key, double min, double max) {
        Jedis j = getJedis(key);
        return j.zrangeByScoreWithScores(key, min, max);
    }

    @Override
    public Set<Tuple> zrevrangeByScoreWithScores(String key, double max, double min) {
        Jedis j = getJedis(key);
        return j.zrevrangeByScoreWithScores(key, max, min);
    }

    @Override
    public Set<Tuple> zrangeByScoreWithScores(String key, double min, double max, int offset, int count) {
        Jedis j = getJedis(key);
        return j.zrangeByScoreWithScores(key, min, max, offset, count);
    }

    @Override
    public Set<Tuple> zrevrangeByScoreWithScores(String key, double max, double min, int offset, int count) {
        Jedis j = getJedis(key);
        return j.zrevrangeByScoreWithScores(key, max, min, offset, count);
    }

    public Long zremrangeByRank(String key, int start, int end) {
        Jedis j = getJedis(key);
        return j.zremrangeByRank(key, start, end);
    }

    @Override
    public Long zremrangeByScore(String key, double start, double end) {
        Jedis j = getJedis(key);
        return j.zremrangeByScore(key, start, end);
    }

    @Override
    public Long linsert(String key, LIST_POSITION where, String pivot, String value) {
        Jedis j = getJedis(key);
        return j.linsert(key, where, pivot, value);
    }

    @Override
    public Long bitcount(String key) {
        Jedis j = getJedis(key);
        return j.bitcount(key);
    }

    @Override
    public Long bitcount(String key, long start, long end) {
        Jedis j = getJedis(key);
        return j.bitcount(key, start, end);
    }

    @Override
    public List<String> blpop(String key) {
        Jedis j = getJedis(key);
        return j.blpop(key);
    }

    @Override
    public List<String> brpop(String key) {
        Jedis j = getJedis(key);
        return j.brpop(key);
    }

    @Override
    public String echo(String key) {
        Jedis j = getJedis(key);
        return j.echo(key);
    }

    @Override
    public Long hdel(String key, String... fields) {
        Jedis j = getJedis(key);
        return j.hdel(key, fields);
    }

    @Override
    public ScanResult<Entry<String, String>> hscan(String key, int cursor) {
        Jedis j = getJedis(key);
        return j.hscan(key, cursor);
    }

    @Override
    public ScanResult<Entry<String, String>> hscan(String key, String cursor) {
        Jedis j = getJedis(key);
        return j.hscan(key, cursor);
    }

    @Override
    public Long lpush(String key, String... strings) {
        Jedis j = getJedis(key);
        return j.lpush(key, strings);
    }

    @Override
    public Long lpushx(String key, String... strings) {
        Jedis j = getJedis(key);
        return j.lpushx(key, strings);
    }

    @Override
    public Long move(String key, int dbIndex) {
        Jedis j = getJedis(key);
        return j.move(key, dbIndex);
    }

    @Override
    public Long persist(String key) {
        Jedis j = getJedis(key);
        return j.persist(key);
    }

    @Override
    public Long rpush(String key, String... strings) {
        Jedis j = getJedis(key);
        return j.rpush(key, strings);
    }

    @Override
    public Long rpushx(String key, String... strings) {
        Jedis j = getJedis(key);
        return j.rpush(key, strings);
    }

    @Override
    public Long sadd(String key, String... members) {
        Jedis j = getJedis(key);
        return j.sadd(key, members);
    }

    @Override
    public Boolean setbit(String key, long offset, String value) {
        Jedis j = getJedis(key);
        return j.setbit(key, offset, value);
    }

    @Override
    public Long srem(String key, String... members) {
        Jedis j = getJedis(key);
        return j.srem(key, members);
    }

    @Override
    public ScanResult<String> sscan(String key, int cursor) {
        Jedis j = getJedis(key);
        return j.sscan(key, cursor);
    }

    @Override
    public ScanResult<String> sscan(String key, String cursor) {
        Jedis j = getJedis(key);
        return j.sscan(key, cursor);
    }

    @Override
    public Long strlen(String key) {
        Jedis j = getJedis(key);
        return j.strlen(key);
    }

    @Override
    public Long zadd(String key, Map<String, Double> scoreMembers) {
        Jedis j = getJedis(key);
        return j.zadd(key, scoreMembers);
    }

    @Override
    public Long zcount(String key, String min, String max) {
        Jedis j = getJedis(key);
        return j.zcount(key, min, max);
    }

    @Override
    public Set<String> zrange(String key, long start, long end) {
        Jedis j = getJedis(key);
        return j.zrange(key, start, end);
    }

    @Override
    public Set<String> zrangeByScore(String key, String min, String max) {
        Jedis j = getJedis(key);
        return j.zrangeByScore(key, min, max);
    }

    @Override
    public Set<String> zrangeByScore(String key, String min, String max, int offset, int count) {
        Jedis j = getJedis(key);
        return j.zrangeByScore(key, min, max, offset, count);
    }

    @Override
    public Set<Tuple> zrangeByScoreWithScores(String key, String min, String max) {
        Jedis j = getJedis(key);
        return j.zrangeByScoreWithScores(key, min, max);
    }

    @Override
    public Set<Tuple> zrangeByScoreWithScores(String key, String min, String max, int offset, int count) {
        Jedis j = getJedis(key);
        return j.zrangeByScoreWithScores(key, min, max, offset, count);
    }

    @Override
    public Set<Tuple> zrangeWithScores(String key, long start, long end) {
        Jedis j = getJedis(key);
        return j.zrangeWithScores(key, start, end);
    }

    @Override
    public Long zrem(String key, String... members) {
        Jedis j = getJedis(key);
        return j.zrem(key, members);
    }

    @Override
    public Long zremrangeByRank(String key, long start, long end) {
        Jedis j = getJedis(key);
        return j.zremrangeByRank(key, start, end);
    }

    @Override
    public Long zremrangeByScore(String key, String start, String end) {
        Jedis j = getJedis(key);
        return j.zremrangeByScore(key, start, end);
    }

    @Override
    public Set<String> zrevrange(String key, long start, long end) {
        Jedis j = getJedis(key);
        return j.zrevrange(key, start, end);
    }

    @Override
    public Set<String> zrevrangeByScore(String key, String max, String min) {
        Jedis j = getJedis(key);
        return j.zrevrangeByScore(key, max, min);
    }

    @Override
    public Set<String> zrevrangeByScore(String key, String max, String min, int offset, int count) {
        Jedis j = getJedis(key);
        return j.zrevrangeByScore(key, max, min, offset, count);
    }

    @Override
    public Set<Tuple> zrevrangeByScoreWithScores(String key, String max, String min) {
        Jedis j = getJedis(key);
        return j.zrevrangeByScoreWithScores(key, max, min);
    }

    @Override
    public Set<Tuple> zrevrangeByScoreWithScores(String key, String max, String min, int offset, int count) {
        Jedis j = getJedis(key);
        return j.zrevrangeByScoreWithScores(key, max, min, offset, count);
    }

    @Override
    public Set<Tuple> zrevrangeWithScores(String key, long start, long end) {
        Jedis j = getJedis(key);
        return j.zrevrangeWithScores(key, start, end);
    }

    @Override
    public ScanResult<Tuple> zscan(String key, int cursor) {
        Jedis j = getJedis(key);
        return j.zscan(key, cursor);
    }

    @Override
    public ScanResult<Tuple> zscan(String key, String cursor) {
        Jedis j = getJedis(key);
        return j.zscan(key, cursor);
    }

    /**
     * 以下是为多个key 多个值批量get set服务 author 13379
     */
    /**
     * 缓存多个字符串。与getString(key)。multiGetString(List\<keys\>)配合使用。 若后续需要对此String进行append、incr、decr操作，则不能用setObject替换
     * <p/>
     * keyPrefix key的前缀 可为null 但不要太长 keyValue expireSecond 过期时间，单位为秒（0和负数表示不设置过期） "OK" or "failed"
     */
    public String multiSetString(final String keyPrefix, final Map<String, String> keyValue, int expireSecond) {
        Map<String, byte[]> keyValuebMap = new HashMap<String, byte[]>();
        String keyPr = (null == keyPrefix) ? "" : keyPrefix.trim();
        for (String key : keyValue.keySet()) {
            String value = keyValue.get(key);
            if (value != null) {
                keyValuebMap.put(keyPr + "_" + key, SafeEncoder.encode(value));
            }
        }
        return this.multiSet(keyValuebMap, expireSecond);
    }

    public String multiSetString(final String keyPrefix, final Map<String, String> keyValue) {
        Map<String, byte[]> keyValuebMap = new HashMap<String, byte[]>();
        String keyPr = (null == keyPrefix) ? "" : keyPrefix.trim();
        for (String key : keyValue.keySet()) {
            String value = keyValue.get(key);
            if (value != null) {
                keyValuebMap.put(keyPr + "_" + key, SafeEncoder.encode(value));
            }
        }
        return this.multiSet(keyValuebMap, 0);
    }

    /**
     * 缓存多个对象。与getObject(key)、multiGetObject(List\<keys\>)配合使用
     * <p/>
     * keyPrefix key的前缀 可为null 但不要太长 keyValue key与可序列化对象（实现Serializable接口）的映射Map expireSecond 过期时间，单位为秒（0和负数表示不设置过期） "OK" or "failed"
     */
    public String multiSetObject(final String keyPrefix, Map<String, Object> keyValue, int expireSecond) {
        Map<String, byte[]> keyValuebMap = new HashMap<String, byte[]>();
        String keyPr = (null == keyPrefix) ? "" : keyPrefix.trim();
        for (String key : keyValue.keySet()) {
            Object value = keyValue.get(key);
            if (value != null) {
                keyValuebMap.put(keyPr + "_" + key, SerializeUtils.serialize(value));
            }
        }
        return this.multiSet(keyValuebMap, expireSecond);
    }

    public String multiSetObject(final String keyPrefix, Map<String, Object> keyValue) {
        Map<String, byte[]> keyValuebMap = new HashMap<String, byte[]>();
        String keyPr = (null == keyPrefix) ? "" : keyPrefix.trim();
        for (String key : keyValue.keySet()) {
            Object value = keyValue.get(key);
            if (value != null) {
                keyValuebMap.put(keyPr + "_" + key, SerializeUtils.serialize(value));
            }
        }
        return this.multiSet(keyValuebMap, 0);
    }

    /**
     * 缓存多个数据块。与getByteArr(key)、multiGetByteArr(List\<keys\>)配合使用
     * <p/>
     * keyPrefix key的前缀 可为null 但不要太长 keyValue key与可序列化对象（实现Serializable接口）的映射Map expireSecond 过期时间，单位为秒（0和负数表示不设置过期） "OK" or "failed"
     */
    public String multiSetByteArr(final String keyPrefix, Map<String, byte[]> keyValue, int expireSecond) {
        Map<String, byte[]> keyValuebMap = new HashMap<String, byte[]>();
        String keyPr = (null == keyPrefix) ? "" : keyPrefix.trim();
        for (String key : keyValue.keySet()) {
            byte[] value = keyValue.get(key);
            if (value != null) {
                keyValuebMap.put(keyPr + "_" + key, value);
            }
        }
        return this.multiSet(keyValuebMap, expireSecond);
    }

    private byte[][] getBArrArr(List<String> thisKeys) {
        byte[][] bkeys = new byte[thisKeys.size()][];
        for (int i = thisKeys.size() - 1; i >= 0; i--) {
            bkeys[i] = SafeEncoder.encode(thisKeys.get(i));
        }
        return bkeys;
    }

    private byte[][] getKeyValueBArrArr(List<String> thisKeys, Map<String, byte[]> keyValueMap) {
        byte[][] bKeyValues = new byte[thisKeys.size() * 2][];
        for (int i = 0; i < thisKeys.size(); i++) {
            String key = thisKeys.get(i);
            bKeyValues[i + i] = SafeEncoder.encode(key);
            bKeyValues[i + i + 1] = keyValueMap.get(key);
        }
        return bKeyValues;
    }

    private String multiSet(Map<String, byte[]> keyValuebMap, int expireSecond) {
        String ret = null;
        Map<String, List<String>> nodeToKeys = this.divideKeys(keyValuebMap.keySet());
        for (String key : nodeToKeys.keySet()) {
            List<String> thisKeys = nodeToKeys.get(key);
            if (thisKeys != null && thisKeys.size() > 0) {
                ret = multiSet(key, expireSecond, this.getKeyValueBArrArr(thisKeys, keyValuebMap));
            }
        }
        return ret;
    }

    private String multiSet(String key, int expireSecond, final byte[]... keyValues) {
        Jedis jedis = null;
        jedis = getJedis(key);
        if (jedis != null) {
            String ret = null;
            ret = jedis.mset(keyValues);
            if (expireSecond > 0) {
                for (int i = 0; i < keyValues.length; i += 2) {
                    jedis.expire(keyValues[i], expireSecond);
                }
            }
            return ret;
        }
        return "failed";
    }

    /**
     * keys 划分出key
     */
    private Map<String, List<String>> divideKeys(Collection<String> keys) {
        Map<RedisNode, List<String>> map = new HashMap<RedisNode, List<String>>();
        Map<String, List<String>> result = new HashMap<String, List<String>>();
        for (String key : keys) {
        	RedisNode redisNode = this.getShardingStrategyFactory().getShardingStrategy().getRedisNode(key);
            List<String> keysList = map.get(redisNode);
            if (null == keysList) {
                keysList = new ArrayList<String>();
                map.put(redisNode, keysList);
            }
            keysList.add(key);
        }

        for (List<String> list : map.values()) {
            result.put(list.iterator().next(), list);
        }
        return result;
    }

    /**
     * 一次取出多个缓存的String对象
     * <p/>
     * keys
     */
    public Map<String, String> multiGetString(final String keyPrefix, List<String> keys) throws Exception {
        Map<String, String> ret = new HashMap<String, String>();
        Map<String, byte[]> temp = multiGetByteArr(keyPrefix, keys);
        for (String key : temp.keySet()) {
            byte[] value = temp.get(key);
            if (value != null) {
                ret.put(key, SafeEncoder.encode(value));
            } else {
                ret.put(key, null);
            }
        }
        return ret;
    }

    /**
     * 一次取出多个缓存的Object
     * <p/>
     * keys
     */
    public Map<String, Object> multiGetObject(final String keyPrefix, List<String> keys) throws InterruptedException {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, byte[]> temp = this.multiGetByteArr(keyPrefix, keys);
        for (String key : temp.keySet()) {
            byte[] value = temp.get(key);
            if (value != null) {
                ret.put(key, SerializeUtils.unserialize(value));
            } else {
                ret.put(key, null);
            }
        }
        return ret;
    }

    /**
     * 一次取出多个缓存的Object
     * <p/>
     * keys time 超时时间 单位毫秒 不建议设太大
     */
    public Map<String, Object> multiGetObject(final String keyPrefix, final List<String> keys, long time) throws InterruptedException, ExecutionException, TimeoutException {
        FutureTask<Map<String, Object>> future = new FutureTask<Map<String, Object>>(new Callable<Map<String, Object>>() {
            @Override
            public Map<String, Object> call() throws Exception {
                return multiGetObject(keyPrefix, keys);
            }
        });
        executorService.execute(future);
        return future.get(time, TimeUnit.MILLISECONDS);
    }

    /**
     * 一次取出多个缓存的数据块，多线程取
     * <p/>
     * keys
     */
    public Map<String, byte[]> multiGetByteArr(final String keyPrefix, List<String> keys) throws InterruptedException {
        final Map<String, byte[]> ret = new ConcurrentHashMap<String, byte[]>();
        List<String> listKeys = new ArrayList();
        for (String key : keys) {
            listKeys.add(keyPrefix + "_" + key);
        }
        final Map<String, List<String>> nodeToKeys = this.divideKeys(listKeys);
        // final CountDownLatch cdl = new CountDownLatch(nodeToKeys.keySet().size());

        for (final String key : nodeToKeys.keySet()) {
            List<String> thisKeys = nodeToKeys.get(key);
            if (thisKeys != null && thisKeys.size() > 0) {
                Map<String, byte[]> thisret = multiGet(key, getBArrArr(thisKeys));
                if (thisret != null) {
                    ret.putAll(thisret);
                }
            }
            /*
             * 暂时不用多线程取数据的方法 executorService.execute(new Runnable() {
             * 
             * @Override public void run() { try { List<String> thisKeys = nodeToKeys.get(key); if (thisKeys != null && thisKeys.size() > 0) { Map<String, byte[]> thisret =
             * multiGet(key, getBArrArr(thisKeys)); if (thisret != null) { ret.putAll(thisret); } } } finally { cdl.countDown(); } } });
             */

        }
        // cdl.await();

        return ret;
    }

    private Map<String, byte[]> multiGet(String key, byte[]... keys) {
        Map<String, byte[]> map = new HashMap<String, byte[]>();
        Jedis jedis = null;
        jedis = this.getJedis(key);

        if (jedis != null) {
            List<byte[]> ret = jedis.mget(keys);
            for (int i = ret.size() - 1; i >= 0; i--) {
                if (ret.get(i) != null) {
                    map.put(SafeEncoder.encode(keys[i]), ret.get(i));
                }
            }
            return map;
        }

        return map;
    }

}
