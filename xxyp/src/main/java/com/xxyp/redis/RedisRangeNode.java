package com.xxyp.redis;

import java.io.Serializable;

public class RedisRangeNode extends RedisNode implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * >=
	 */
	private String gteq;

	/**
	 * <
	 */
	private String lt;
	@Override
	public String toString() {
		return "RedisRangNode [getHost()=" + getHost() + ", getPort()="
				+ getPort() + ", getTimeout()=" + getTimeout() + "]";
	}
	public String getGteq() {
		return gteq;
	}
	public void setGteq(String gteq) {
		this.gteq = gteq;
	}
	public String getLt() {
		return lt;
	}
	public void setLt(String lt) {
		this.lt = lt;
	}
}
