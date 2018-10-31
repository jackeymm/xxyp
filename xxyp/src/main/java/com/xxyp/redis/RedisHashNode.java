package com.xxyp.redis;

import java.io.Serializable;


public class RedisHashNode extends RedisNode implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer weight=1;
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "RedisHashNode [weight=" + weight + ", getHost()=" + getHost()
				+ ", getPort()=" + getPort() + ", getTimeout()=" + getTimeout()
				+ "]";
	}
}
