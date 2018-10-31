package com.xxyp.controller;

import com.xxyp.common.BaseController;
import com.xxyp.input.*;
import com.xxyp.model.DatingShot;
import com.xxyp.model.DatingShotPhoto;
import com.xxyp.model.UserInfo;
import com.xxyp.service.IDatingShotPhotoService;
import com.xxyp.service.IDatingShotService;
import com.xxyp.service.IUserInfoService;
import com.xxyp.utils.GsonUtil;
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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jackeymm on 2017/3/12.
 */
@Controller
public class DatingShotController extends BaseController{

    private static final Logger logger = LoggerFactory.getLogger(DatingShotController.class);


    @Autowired
    private IDatingShotService datingShotService;

    @Autowired
    private IDatingShotPhotoService datingShotPhotoService;

    @Autowired
    private IUserInfoService userInfoService;


    @RequestMapping(value = "createDatingShot", method = RequestMethod.POST)
    @ApiOperation(
            value = "创建约拍接口",
            notes = "创建约拍信息.</br>"+
                    "Method: POST</br>" +
                    "Error Code: </br>"
            ,
            response = List.class,
            consumes = "application/json"
    )

    public void createDatingShot(@RequestBody CreateDatingShotInput createDatingShotInput) {
        DatingShot datingShot = new DatingShot();
        BeanUtils.copyProperties(createDatingShotInput, datingShot);
        datingShot.setStatus(1);
        datingShot.setDatingShotId(null);
        datingShot.setReleaseTime(System.currentTimeMillis());
        datingShot.setDescription("");
        datingShot.setDatingUserId(0L);
        logger.info("### createDatingShot param : "+GsonUtil.toJson(datingShot));
        int result = datingShotService.insert(datingShot);
        logger.info("### createDatingShot result : "+result);

        List<DatingShot> list = datingShotService.selectByExample(datingShot);
        logger.info("### createDatingShot list : "+GsonUtil.toJson(list));

        Long datingShotId = list.get(list.size()-1).getDatingShotId();
        logger.info("### createDatingShot datingShotId : "+datingShotId);
        for(CreateDatingShotPhotoInput input : createDatingShotInput.getDatingShotImages()){
            DatingShotPhoto datingShotPhoto = new DatingShotPhoto();
            datingShotPhoto.setDatingShotPhoto(input.getDatingShotPhoto());
            datingShotPhoto.setDatingShotImageOrder(input.getDatingShotImageOrder());
            datingShotPhoto.setDatingShotId(datingShotId);
            datingShotPhoto.setStatus(1);
            int datingShotPhotoResult = datingShotPhotoService.insert(datingShotPhoto);
            logger.info("### add DatingShot : add DatingShotPhoto"+datingShotPhoto);
        }

        Map resultMap = new HashMap();
        resultMap.put("datingShotId",datingShotId);
        outputData(resultMap);
    }

    @RequestMapping(value = "updateDatingShot", method = RequestMethod.POST)
    @ApiOperation(
            value = "修改约拍接口",
            notes = "修改约拍信息.</br>"+
                    "Method: POST</br>" +
                    "Error Code: </br>"
            ,
            response = List.class,
            consumes = "application/json"
    )

    public void updateDatingShot(@RequestBody UpdateDatingShotInput input) {
        DatingShot datingShot = new DatingShot();
        BeanUtils.copyProperties(input, datingShot);
        logger.info("### updateDatingShot param : "+GsonUtil.toJson(datingShot));
        if(StringUtils.isEmpty(datingShot.getStatus())){
            datingShot.setStatus(1);
        }
        datingShot.setUserId(null);
        datingShot.setReleaseTime(System.currentTimeMillis());
        int result = datingShotService.updateByPrimaryKey(datingShot);
        logger.info("### updateDatingShot result : "+result);

        for (UpdateDatingShotPhotoInput datingShotPhotoInput : input.getDatingShotImages()){
            DatingShotPhoto datingShotPhoto  = new DatingShotPhoto();
            BeanUtils.copyProperties(datingShotPhotoInput, datingShotPhoto);
            int datingShotPhotoResult = datingShotPhotoService.updateByPrimaryKey(datingShotPhoto);
            logger.info("### updateWorks : updateWorksPhoto : "+datingShotPhotoResult);
        }
        outputData();
    }

    @RequestMapping(value = "getDatingShot", method = RequestMethod.GET)
    @ApiOperation(
            value = "获取约拍接口",
            notes = "获取约拍信息.</br>"+
                    "Method: GET</br>" +
                    "Error Code: </br>"
                    ,
            response = DatingShot.class,
            responseContainer = "List",
            consumes = "application/json"
    )
    public void getDatingShot(@ModelAttribute GetDatingShotInput input) {
        DatingShot datingShot = new DatingShot();
        BeanUtils.copyProperties(input, datingShot);
        datingShot.setStatus(1);
        List<DatingShot> resultList = datingShotService.selectByExample(datingShot);
        logger.info("getDatingShot : resultList : "+GsonUtil.toJson(resultList));
        for (int i = 0; i < resultList.size(); i++){
            DatingShot datingShot1 = resultList.get(i);
            DatingShotPhoto datingShotPhoto = new DatingShotPhoto();
            datingShotPhoto.setDatingShotId(datingShot1.getDatingShotId());
            datingShotPhoto.setStatus(1);
            List<DatingShotPhoto> datingShotPhotoList = datingShotPhotoService.selectByExample(datingShotPhoto);
            UserInfo userInfo = new UserInfo();
            userInfo.setUserId(datingShot1.getUserId());
            List<UserInfo> userInfos = userInfoService.selectByExample(userInfo);
            if(userInfos.size() > 0){
                datingShot1.setUserName(userInfos.get(0).getUserName());
                datingShot1.setUserImage(userInfos.get(0).getUserImage());
            }
            datingShot1.setDatingShotImages(datingShotPhotoList);
            resultList.set(i,datingShot1);
        }
        Map returnMap = new HashMap();
        returnMap.put("datingShot",resultList);
        outputData(returnMap);
    }



}
