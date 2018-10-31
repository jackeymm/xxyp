package com.xxyp.controller;

import com.xxyp.common.BaseController;
import com.xxyp.input.LoginUserInfoInput;
import com.xxyp.model.TokenEntity;
import com.xxyp.model.UserInfo;
import com.xxyp.service.IUserInfoService;
import com.xxyp.utils.GsonUtil;
import com.xxyp.utils.ShiroUtil;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jackeymm on 2017/3/12.
 */
@Controller
public class LoginController extends BaseController{

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);


    @Autowired
    private IUserInfoService userInfoService;

    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ApiOperation(
            value = "用户登录接口",
            notes = "用户登录信息.</br>"+
                    "Method: POST</br>" +
                    "Error Code:10000-->用户不存在 </br>"+
                    "Error Code:10001-->用户认证信息不正确</br>"
                    ,
            response = Map.class,
            consumes = "application/json"
    )
    public void login(@ModelAttribute LoginUserInfoInput loginUserInfoInput) {
        logger.info("用户登录信息入参====》"+ GsonUtil.toJson(loginUserInfoInput));
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(loginUserInfoInput, userInfo);
        ShiroUtil shiroUtil = new ShiroUtil();
        TokenEntity tokenEntity = shiroUtil.loginUser(userInfo);
        if (!"SUCC".equals(tokenEntity.getIsSuccess())) {
            outputException(10001,"用户认证信息不正确");
            return;
        }
        List<UserInfo> resultUserInfo = userInfoService.selectByExample(userInfo);
        logger.info("resultUserInfo : "+ GsonUtil.toJson(resultUserInfo));
        Map resultMap = new HashMap();
        if(resultUserInfo.size() > 0) {
            resultMap.put("token", tokenEntity.getToken());
            resultMap.put("userInfo", resultUserInfo.get(resultUserInfo.size() - 1));
            logger.info("用户登录信息出参====》"+GsonUtil.toJson(resultMap));
            outputData(resultMap);
        }else{
            outputException(10000,"用户不存在");
        }
    }


    @RequestMapping(value = "logout", method = RequestMethod.POST)
    @ApiOperation(
            value = "用户登出接口",
            notes = "用户登出信息.</br>"+
                    "Method: POST</br>" +
                    "Error Code: </br>"
            ,
            response = void.class,
            consumes = "application/json"
    )
    public void logout(@ModelAttribute UserInfo userInfo) {
        logger.info("用户登出入参====》"+ GsonUtil.toJson(userInfo));
        Subject subject = SecurityUtils.getSubject();
        if (subject != null) {
            try{
                subject.logout();
            }catch(Exception ex){
            }
        }
        outputData();
    }



}



