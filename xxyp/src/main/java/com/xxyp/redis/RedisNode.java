package com.xxyp.redis;

import java.io.Serializable;

public class RedisNode implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String host="127.0.0.1";
	private int port=6379;
	private Integer timeout=200000;
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public Integer getTimeout() {
		return timeout;
	}
	public void setTimeout(Integer timeout) {
		this.timeout = timeout;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
}
