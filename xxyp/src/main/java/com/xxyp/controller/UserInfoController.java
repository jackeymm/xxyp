package com.xxyp.controller;

import com.xxyp.common.BaseController;
import com.xxyp.model.UserInfo;
import com.xxyp.service.IUserInfoService;
import com.xxyp.utils.GsonUtil;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jackeymm on 2017/3/12.
 */
@Controller
public class UserInfoController extends BaseController{

    private static final Logger logger = LoggerFactory.getLogger(UserInfoController.class);

    @Autowired
    private IUserInfoService userInfoService;

    @RequestMapping(value = "createUserInfo", method = RequestMethod.POST)

    @ApiOperation(
            value = "增加用户信息接口",
            notes = "增加用户信息.</br>"+
                    "Method: POST</br>" +
                    "Error Code: </br>" +
                    "<font color=\"red\">100020</font>: 用户uId重复，添加失败</br>"
                    ,
            response = UserInfo.class,
            consumes = "application/json"
    )
    public void createCommonInfo(@RequestBody UserInfo userInfo) {
        logger.info("增加用户信息入参====》"+ GsonUtil.toJson(userInfo));

        int result = userInfoService.insert(userInfo);
        outputData(result);
    }



}
