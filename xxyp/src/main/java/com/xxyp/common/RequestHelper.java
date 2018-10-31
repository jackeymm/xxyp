package com.xxyp.common;

import com.xxyp.utils.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * 请求辅助类
 * @author jackeymm
 *
 */

public class RequestHelper {

	private static Logger log = Logger.getLogger(RequestHelper.class);

	/**
	 * 获取头信息
	 *
	 * @param request
	 * @return
	 */
	public static Map<String, String> getRequestHeaderInfo(HttpServletRequest request) {
		Map<String, String> headerInfoMap = new HashMap<String, String>();
		Enumeration<String> headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String key = headerNames.nextElement();
			String value = request.getHeader(key);
			headerInfoMap.put(key, value);
		}
		return headerInfoMap;
	}


	/**
	 * 解析出请求头信息
	 *
	 * @param requestHeaderMap
	 * @return
	 */
	public static RequestHeaderInfo resolveRequestHeader(Map<String, String> requestHeaderMap) {
		if (requestHeaderMap == null || requestHeaderMap.size() <= 0) {
			return null;
		}
		log.info("request header map:" + requestHeaderMap.toString());

		RequestHeaderInfo reqHeaderInfo = new RequestHeaderInfo();

		//解析userId
		String strUserId = null;
		if (requestHeaderMap.containsKey(RequestHeader.X_XXYP_USER_ID.toLowerCase())) {
			strUserId = requestHeaderMap.get(RequestHeader.X_XXYP_USER_ID.toLowerCase());
		}
		reqHeaderInfo.setUserId(strUserId == null || !NumberUtils.isNumber(strUserId.trim()) ? 0L : Long.parseLong(strUserId.trim()));

		//解析token
		String userToken = null;
		if (requestHeaderMap.containsKey(RequestHeader.X_TXXYP_USER_TOKEN.toLowerCase())) {
			userToken = requestHeaderMap.get(RequestHeader.X_TXXYP_USER_TOKEN.toLowerCase());
		}
		reqHeaderInfo.setUserToken(userToken == null ? null : userToken.trim());

		//解析请求头
		String userAgent = null;
		if (requestHeaderMap.containsKey(RequestHeader.X_USER_AGENT.toLowerCase())) {
			userAgent = requestHeaderMap.get(RequestHeader.X_USER_AGENT.toLowerCase());
		}
		userAgent = StringUtils.null2Str(userAgent);
		reqHeaderInfo.setUserAgent(userAgent);

		return reqHeaderInfo;
	}

}