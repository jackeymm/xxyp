package com.xxyp.common;

import java.io.Serializable;

/**
 * 请求头信息
 * @author jackeymm
 *
 */

public class RequestHeaderInfo implements Serializable{

	private static final long serialVersionUID = -8821520941061957531L;

	//用户Id
    private Long userId;
    
    //登录或注册后的认证令牌
  	private String userToken;
  	
  	//请求头信息
  	private String userAgent;
  	
  	//请求头代理信息
//  	private UserAgentInfo userAgentInfo;
  	
  	//接受类型
  	//private String acceptEncoding;
  	

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserToken() {
		return userToken;
	}

	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public String toString(){
		return String.format("RequestHeaderInfo[userId=%s,userToken=%s,userAgent=%s", userId,userToken,userAgent);
	}
	
}
