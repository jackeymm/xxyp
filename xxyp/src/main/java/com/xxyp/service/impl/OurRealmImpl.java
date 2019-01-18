package com.xxyp.service.impl;

import com.xxyp.model.UserInfo;
import com.xxyp.service.IUserInfoService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OurRealmImpl extends AuthorizingRealm {

        private static final Logger LOGGER = LoggerFactory.getLogger(OurRealmImpl.class);

//        @Autowired
        private IUserInfoService userInfoService;

        @Override
        protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
            return null;
        }

        @Override
        protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
            //获取登录信息
            UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;

            String username = token.getUsername();
            String userSourceId = String.copyValueOf(token.getPassword());

            if (null == userSourceId) return null;

            UserInfo userInfo = new UserInfo();
            userInfo.setUserName(username);
            userInfo.setUserSourceId(userSourceId);
            List<UserInfo> userResult = userInfoService.selectByExample(userInfo);
            if (!CollectionUtils.isEmpty(userResult)) {
                return new SimpleAuthenticationInfo(username, userResult.get(0).getUserSourceId(), getName());
            }
            return null;
        }

    public void setUserInfoService(IUserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }
}
