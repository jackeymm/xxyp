package com.xxyp.common;

import com.xxyp.model.TokenEntity;
import com.xxyp.utils.ShiroUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


/****
 * API基础拦截器
 * @author jackeymm
 *
 */

public class UserBaseRequestInterceptor extends HandlerInterceptorAdapter {
	private static Logger logger = LoggerFactory.getLogger(UserBaseRequestInterceptor.class);
	//ignore verify list
	private List<String> ignoreVerifyList = null;
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		logger.info("### UserBaseRequestInterceptor preHandle");
		response.setCharacterEncoding(CommonDefine.CHARSET);
		response.setContentType(ContentType.DEFAULT.getValue());
		try {
			String reqUrl = request.getRequestURL().toString();
			//解决虚拟路径与配置忽略请求方法名相同的问题
			String reqStr = reqUrl.substring(reqUrl.lastIndexOf("/"));
			//去处【/】,只保留接口名
			reqStr = reqStr.substring(1, reqStr.length());

			for (String path : ignoreVerifyList) {
				if (reqStr.equals(path)) {
					break;
				}
			}

			//验证请求头
			RequestHeaderInfo requestHeaderInfo = RequestHelper.resolveRequestHeader(RequestHelper.getRequestHeaderInfo(request));

			FacadeResult headerErrorWithoutToken = verifyRequestHader(requestHeaderInfo);
			logger.info("### UserBaseRequestInterceptor preHandle after verifyRequestHader");
			if(null != headerErrorWithoutToken){
				response.getWriter().append(headerErrorWithoutToken.toString());
				return false;
			}
			return super.preHandle(request, response, handler);

		} catch (Exception e) {
			logger.error("springmvc拦截器发生错误! ", e);
		}
		return false;
	}

	/**
	 * 验证请求头信息
	 * @param rhi
	 * @return
	 */
	private FacadeResult verifyRequestHader(RequestHeaderInfo rhi){
		logger.info("### UserBaseRequestInterceptor preHandle  verifyRequestHader");
		FacadeResult result = null;
		String nothing = "";
		if(rhi == null){
			result = new FacadeResult(CodeMsg.HEADER_INFO_ERROR.getCode(),
					CodeMsg.HEADER_INFO_ERROR.getMsg(), nothing);
			return result;
		}

		//userID
		Long userId = rhi.getUserId();
		if(userId == null || userId <= 0){
			result = new FacadeResult(CodeMsg.USERID_ERROR.getCode(),
					CodeMsg.USERID_ERROR.getMsg(), nothing);
			return result;
		}

		//token
		String token = rhi.getUserToken();
		if(token == null || "".equals(token.trim())){
			result = new FacadeResult(CodeMsg.TOKEN_ERROR.getCode(),
					CodeMsg.TOKEN_ERROR.getMsg(), nothing);
			return result;
		}else{
			// 验证是否异常
			boolean tokenVerfiyException = false;

			// 验证参数
			ShiroUtil shiroUtil = new ShiroUtil();
			TokenEntity tokenEntity = shiroUtil.authorization(token);
			if (null == tokenEntity || "".equals(tokenEntity.getToken().trim())) {
				result = new FacadeResult(
						CodeMsg.TOKEN_AUTH_SERVER_ERROR
								.getCode(),
						CodeMsg.TOKEN_AUTH_SERVER_ERROR.getMsg(),
						nothing);
				return result;
			} else {
				if (!tokenEntity.getIsSuccess().equals("SUCC")) {
					result = new FacadeResult(
							CodeMsg.TOKEN_AUTH_FAILURE.getCode(),
							CodeMsg.TOKEN_AUTH_FAILURE.getMsg(),
							nothing);
					return result;
				}

				String authUserId = String.valueOf(tokenEntity.getUserId());

				if (authUserId != null && !authUserId.trim().equals(
						String.valueOf(userId))) {
					result = new FacadeResult(
							CodeMsg.USERID_NOTMATCH_TOKEN_ERROR.getCode(),
							CodeMsg.USERID_NOTMATCH_TOKEN_ERROR.getMsg(),
							nothing);
					return result;
				}
			}

			// 验证异常问题处理
			if (tokenVerfiyException) {
				result = new FacadeResult(
						CodeMsg.TOKEN_AUTH_SERVER_ERROR.getCode(),
						CodeMsg.TOKEN_AUTH_SERVER_ERROR.getMsg(),
						nothing);
				return result;
			}
		}

		return result;
	}

	public List<String> getIgnoreVerifyList() {
		return ignoreVerifyList;
	}

	public void setIgnoreVerifyList(List<String> ignoreVerifyList) {
		this.ignoreVerifyList = ignoreVerifyList;
	}
}
