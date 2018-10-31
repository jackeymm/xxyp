package com.xxyp.controller;

import com.google.common.collect.Lists;
import com.xxyp.common.BaseController;
import com.xxyp.input.CreateFansInput;
import com.xxyp.input.GetFansInput;
import com.xxyp.input.UpdateFansInput;
import com.xxyp.model.Fans;
import com.xxyp.model.UserInfo;
import com.xxyp.output.FansOutPut;
import com.xxyp.service.IFansService;
import com.xxyp.service.IUserInfoService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jackeymm on 2017-08-29
 */
@Controller
public class FansController extends BaseController{

    private static final Logger logger = LoggerFactory.getLogger(FansController.class);


    @Autowired
    private IFansService fansService;

    @Autowired
    private IUserInfoService userInfoService;

    @RequestMapping(value = "createFans", method = RequestMethod.POST)
    @ApiOperation(
            value = "创建粉丝接口",
            notes = "创建粉丝.</br>"+
                    "Method: POST</br>" +
                    "Error Code: </br>"
                    ,
            response = Map.class,
            consumes = "application/json"
    )
    public void createFans(@RequestBody CreateFansInput createFansInput) {
        Fans fans = new Fans();
        BeanUtils.copyProperties(createFansInput, fans);
        fans.setStatus(1);
        int result = fansService.insert(fans);
        logger.info("createFans result : "+result);
        outputData();
    }

    @RequestMapping(value = "updateFans", method = RequestMethod.POST)
    @ApiOperation(
            value = "修改粉丝接口",
            notes = "修改粉丝.</br>"+
                    "Method: POST</br>" +
                    "Error Code: </br>"
            ,
            response = Map.class,
            consumes = "application/json"
    )
    public void updateFans(@RequestBody UpdateFansInput updateFansInput) {
        Fans fans = new Fans();
        if(null == updateFansInput.getFansId() || updateFansInput.getFansId() <= 0){
            logger.info("input is null");
            outputData();
        }
        fans.setFansId(updateFansInput.getFansId());
        fans.setStatus(0);
        int result = fansService.updateByPrimaryKey(fans);
        logger.info("updateFans result : "+result);
        outputData();
    }

    @RequestMapping(value = "getFans", method = RequestMethod.POST)
    @ApiOperation(
            value = "查询粉丝接口",
            notes = "查询粉丝.</br>"+
                    "Method: POST</br>" +
                    "Error Code: </br>"
            ,
            response = FansOutPut.class,

            consumes = "application/json"
    )
    public void getFans(@ModelAttribute GetFansInput createFansInput) {
        Fans fans = new Fans();
        BeanUtils.copyProperties(createFansInput, fans);
        fans.setStatus(1);
        List<Fans> result = fansService.selectByExample(fans);
        List<FansOutPut> resultList = Lists.newArrayList();

        for(int i =0; i < result.size(); i++){
            Fans fansTemp = result.get(i);
            FansOutPut fansOutPut = new FansOutPut();
            UserInfo fromUserInfo = userInfoService.selectByPrimaryKey(fansTemp.getFromUserId());
            fansOutPut.setFromUser(fromUserInfo);

            UserInfo toUserInfo = userInfoService.selectByPrimaryKey(fansTemp.getToUserId());
            fansOutPut.setToUser(toUserInfo);

            fansOutPut.setFansId(fansTemp.getFansId());
            fansOutPut.setRelationStatus(fansTemp.getRelationStatus());
            fansOutPut.setStatus(fansTemp.getStatus());

            resultList.add(fansOutPut);
        }
        logger.info("getFans result : "+result);
        logger.info("getFans resultList : "+resultList);
        Map resultMap = new HashMap();
        resultMap.put("fans",resultList);
        outputData(resultMap);
    }



}
