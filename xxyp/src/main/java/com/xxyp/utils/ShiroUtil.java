package com.xxyp.utils;

import com.xxyp.cache.CacheConstant;
import com.xxyp.cache.EntityCache;
import com.xxyp.cache.ICacheManager;
import com.xxyp.model.TokenEntity;
import com.xxyp.model.UserInfo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jackeymm on 2018/3/28.
 */
public class ShiroUtil {
    private static Logger logger = LoggerFactory.getLogger(ShiroUtil.class);

    @Autowired
    private ICacheManager cacheManager;


    public TokenEntity loginUser(UserInfo user) {
        if (isRelogin(user)){
            TokenEntity tokenEntity = new TokenEntity();
            tokenEntity.setIsSuccess("SUCC"); // 如果已经登陆，无需重新登录
            return tokenEntity;
        }

        return shiroLogin(user); // 调用shiro的登陆验证
    }
    private TokenEntity shiroLogin(UserInfo user) {
        // 组装token，包括客户公司名称、简称、客户编号、用户名称；密码
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(), user.getUserSourceId().toCharArray(), null);
        token.setRememberMe(true);
        TokenEntity tokenEntity = new TokenEntity();
        // shiro登陆验证
        tokenEntity.setIsSuccess("SUCC");
        try {
            SecurityUtils.getSubject().login(token);
            tokenEntity.setToken(SecurityUtils.getSubject().getSession().getId().toString());
            cacheManager.putCache(SecurityUtils.getSubject().getSession().getId().toString(), user.getUserId(), CacheConstant.cacheRefeshTime);
        } catch (UnknownAccountException ex) {
            tokenEntity.setIsSuccess("用户不存在或者密码错误！");
        } catch (IncorrectCredentialsException ex) {
            tokenEntity.setIsSuccess("用户不存在或者密码错误！");
        } catch (AuthenticationException ex) {
            tokenEntity.setIsSuccess(ex.getMessage());
        } catch (Exception ex) {
            ex.printStackTrace();
            tokenEntity.setIsSuccess("内部错误，请重试！");
        }

        return tokenEntity;
    }

    private boolean isRelogin(UserInfo user) {
        Subject us = SecurityUtils.getSubject();
        if (us.isAuthenticated()) {
            return true; // 参数未改变，无需重新登录，默认为已经登录成功
        }
        return false; // 需要重新登陆
    }

    public TokenEntity authorization(String token) {
        TokenEntity tokenEntity = new TokenEntity();
        try {
            if (!cacheManager.isTimeOut(token)) {
                EntityCache cacheEntity = cacheManager.getCacheByKey(token);
                cacheManager.refreshTimeOut(token, cacheEntity.getDatas());

                //设置认证成功信息
                tokenEntity.setToken(token);
                tokenEntity.setUserId((Long)cacheEntity.getDatas());
                tokenEntity.setIsSuccess("SUCC");
            } else {
                tokenEntity.setIsSuccess("Fail");
            }
        } catch (Exception e) {
            logger.error("/author 出现异常====>" + e);
            tokenEntity.setIsSuccess("Fail");
        }
        return tokenEntity;
    }

}
