package com.xxyp.common;

/**
 * 内容类型
 * @author jackeymm
 *
 */

public enum ContentType {

	DEFAULT("application/json; charset=UTF-8"),
	JSON("application/json"),
	PLAINTEXT("text/plain"),
    XMLAPPLICATION("application/xml");
	
	private String value;
	
	ContentType(String value){
		this.value = value;
	}
	
	
	public String getValue(){
		return value;
	}
}
