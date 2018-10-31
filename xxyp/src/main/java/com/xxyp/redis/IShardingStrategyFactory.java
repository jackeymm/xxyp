package com.xxyp.redis;

/**
 * 策略工厂
 * @author jackeymm
 *
 */

public interface IShardingStrategyFactory {
	
	IShardingStrategy getShardingStrategy();
	
}
