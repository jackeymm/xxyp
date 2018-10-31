package com.xxyp.redis;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RedisConfig implements Serializable{
	/**
	 *  
	 */
	private static final long serialVersionUID = 1L;
	private List<RedisHashNode> hashNodeList=new ArrayList<>();
	private List<RedisRangeNode> rangeNodeList=new ArrayList<>();
	public List<RedisHashNode> getHashNodeList() {
		return hashNodeList;
	}
	public void setHashNodeList(List<RedisHashNode> hashNodeList) {
		this.hashNodeList = hashNodeList;
	}
	public List<RedisRangeNode> getRangeNodeList() {
		return rangeNodeList;
	}
	public void setRangeNodeList(List<RedisRangeNode> rangeNodeList) {
		this.rangeNodeList = rangeNodeList;
	}
	@Override
	public String toString() {
		return "RedisConfig [hashNodeList=" + hashNodeList + ", rangeNodeList="
				+ rangeNodeList + "]";
	}

}
