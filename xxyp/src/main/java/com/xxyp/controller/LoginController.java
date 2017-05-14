package com.xxyp.controller;

import com.xxyp.common.BaseController;
import com.xxyp.common.BaseException;
import com.xxyp.input.LoginUserInfoInput;
import com.xxyp.model.UserInfo;
import com.xxyp.service.IUserInfoService;
import com.xxyp.utils.GsonUtil;
import io.swagger.annotations.ApiOperation;
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
                    "Error Code: </br>"
                    ,
            response = Map.class,
            consumes = "application/json"
    )
    public void login(@ModelAttribute LoginUserInfoInput loginUserInfoInput) {
        logger.info("用户登录信息入参====》"+ GsonUtil.toJson(loginUserInfoInput));
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(loginUserInfoInput, userInfo);
        List<UserInfo> resultUserInfo = userInfoService.selectByExample(userInfo);
        Map resultMap = new HashMap();
        if(resultUserInfo.size() > 1) {
            resultMap.put("status", "success");
            resultMap.put("token", "tokenTemp");
            resultMap.put("userInfo", resultUserInfo.get(resultUserInfo.size() - 1));
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
    public void selectUserInfo(@ModelAttribute UserInfo userInfo) {
        logger.info("用户登出入参====》"+ GsonUtil.toJson(userInfo));
        outputData();
    }

}
