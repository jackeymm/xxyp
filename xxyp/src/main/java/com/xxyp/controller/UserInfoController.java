package com.xxyp.controller;

import com.xxyp.common.BaseController;
import com.xxyp.common.BaseException;
import com.xxyp.input.CreateUserInfoInput;
import com.xxyp.input.GetUserInfoInput;
import com.xxyp.model.TokenEntity;
import com.xxyp.model.UserInfo;
import com.xxyp.output.UserInfoOutput;
import com.xxyp.service.IUserInfoService;
import com.xxyp.utils.GsonUtil;
import com.xxyp.utils.ShiroUtil;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
                    "<font color=\"red\">1001</font>: 用户名称为空，添加失败</br>"+
                    "<font color=\"red\">1002</font>: 用户来源为空，添加失败</br>"+
                    "<font color=\"red\">1003</font>: 用户来源ID为空，添加失败</br>"+
                    "<font color=\"red\">1004</font>: 用户头像为空，添加失败</br>"+
                    "<font color=\"red\">1005</font>: 用户uId重复，添加失败</br>"
                    ,
            response = UserInfo.class,
            consumes = "application/json"
    )
    public void createUserInfo(@RequestBody CreateUserInfoInput createUserInfoInput) {
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(createUserInfoInput, userInfo);
        userInfo.setStatus(1);
        userInfo.setUserId(null);
        logger.info("增加用户信息入参====》"+ GsonUtil.toJson(userInfo));
        int result = userInfoService.insert(userInfo);
        ShiroUtil shiroUtil = new ShiroUtil();
        TokenEntity tokenEntity = shiroUtil.loginUser(userInfo);

        List<UserInfo> list = userInfoService.selectByExample(userInfo);
        logger.info("result : "+result);
        logger.info("userInfo : "+GsonUtil.toJson(list));
        Map resultMap = new HashMap();
        resultMap.put("userId", list.get(list.size()-1).getUserId());
        resultMap.put("token", tokenEntity.getToken());

        outputData(resultMap);
    }


    @RequestMapping(value = "selectUserInfo", method = RequestMethod.GET)
    @ApiOperation(
            value = "查询用户信息接口",
            notes = "查询用户信息.</br>"+
                    "Method: POST</br>" +
                    "Error Code: </br>"
            ,
            response = UserInfoOutput.class,
            consumes = "application/json"
    )
    public void selectUserInfo(@ModelAttribute GetUserInfoInput getUserInfoInput) {
        logger.info("查询用户信息入参====》"+ GsonUtil.toJson(getUserInfoInput));
        Map resultmap = new HashMap();
        String userIds = getUserInfoInput.getUserIds();
        String[] strUserIds = null;
        List<UserInfo> list = new ArrayList<UserInfo>();
        if(!StringUtils.isEmpty(userIds) && userIds.contains(",")){
            strUserIds = userIds.split(",");
            for(String userId : strUserIds){
                UserInfo userInfo = new UserInfo();
                userInfo.setUserId(Long.parseLong(userId));
                List<UserInfo> templist = userInfoService.selectByExample(userInfo);
                list.addAll(templist);
            }
        }else{
            UserInfo userInfo = new UserInfo();
            copyProperties(userInfo, getUserInfoInput);
            list = userInfoService.selectByExample(userInfo);
        }
        resultmap.put("users",list);
        outputData(resultmap);
    }

    @RequestMapping(value = "updateUserInfo", method = RequestMethod.POST)
    @ApiOperation(
            value = "修改用户信息接口",
            notes = "修改用户信息.</br>"+
                    "Method: POST</br>" +
                    "Error Code: </br>" +
                    "<font color=\"red\">100020</font>: 用户uId重复，添加失败</br>"
            ,
            response = UserInfo.class,
            consumes = "application/json"
    )
    public void updateCommonInfo(@RequestBody UserInfo userInfo) {
        logger.info("修改用户信息入参====》"+ GsonUtil.toJson(userInfo));
        int result = userInfoService.updateByPrimaryKey(userInfo);
        outputData(result);
    }

    private void validInsert(UserInfo userInfo) throws BaseException {
        if(StringUtils.isEmpty(userInfo.getUserName())){
           throw new BaseException(1001, "用户名称为空，添加失败");
        }
        if(StringUtils.isEmpty(userInfo.getUserSource())){
           throw new BaseException(1002, "用户来源为空，添加失败");
        }
        if(StringUtils.isEmpty(userInfo.getUserSourceId())){
           throw new BaseException(1003, "用户来源ID为空，添加失败");
        }
        if(StringUtils.isEmpty(userInfo.getUserImage())){
           throw new BaseException(1004, "用户头像为空，添加失败");
        }
    }

    private void copyProperties(UserInfo userInfo, GetUserInfoInput getUserInfoInput){
        if(!StringUtils.isEmpty(getUserInfoInput.getUserIds())){
            userInfo.setUserId(Long.parseLong(getUserInfoInput.getUserIds()));
        }
        userInfo.setUserName(getUserInfoInput.getUserName());
        userInfo.setEmail(getUserInfoInput.getEmail());
        userInfo.setMobile(getUserInfoInput.getMobile());
        userInfo.setUserSourceId(getUserInfoInput.getUserSourceId());
    }

}
