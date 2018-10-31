package com.xxyp.redis;


/**
 * redis 策略类
 * @author jackeymm
 *
 */

public interface IShardingStrategy {
	
	RedisNode getRedisNode(String key);
	
	RedisConfig getAllNodes();

}
