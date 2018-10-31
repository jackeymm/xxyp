package com.xxyp.common;

import java.io.Serializable;

/**
 * user agent信息
 * @author jackeymm
 *
 */

public class UserAgentInfo implements Serializable{
	
	private static final long serialVersionUID = -2404294256789071095L;
	//app版本
	private String appVersion;
	//设备标示
	private String deviceId;
	//app类型：ios/android
	private String platform;
	//app类型版本
	private String platformVersion;

	public String getAppVersion() {
		return appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getPlatformVersion() {
		return platformVersion;
	}
	public void setPlatformVersion(String platformVersion) {
		this.platformVersion = platformVersion;
	}

	public String toString(){
		return String.format("UserAgentInfo=[appVersion=%s，deviceId＝%s,platform=%s,platformVersion=%s,toonType=%s]", appVersion,deviceId,platform,platformVersion);
	}
}
