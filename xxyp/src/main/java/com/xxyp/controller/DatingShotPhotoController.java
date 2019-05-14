package com.xxyp.controller;

import com.xxyp.common.BaseController;
import com.xxyp.input.GetDatingShotPhotoInput;
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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jackeymm on 2019-01-30
 */
@Controller
public class DatingShotPhotoController extends BaseController {
    private static final Logger logger = LoggerFactory.getLogger(DatingShotPhotoController.class);

    @Autowired
    private IDatingShotPhotoService datingShotPhotoService;

    @Autowired
    private IDatingShotService datingShotService;

//    @Autowired
//    private IUserInfoService userInfoService;

    @RequestMapping(value = "getDatingShotPhotos", method = RequestMethod.GET)
    @ApiOperation(
            value = "获取作品列表接口",
            notes = "获取作品列表.</br>"+
                    "Method: GET</br>" +
                    "Error Code: </br>"
            ,
            response = DatingShot.class,
            responseContainer = "List",
            consumes = "application/json"
    )
    public void getDatingShotPhotos(@ModelAttribute GetDatingShotPhotoInput input) {
        DatingShot datingShot = new DatingShot();
        datingShot.setUserId(input.getUserId());
        datingShot.setStatus(1);
//        datingShot.setPageIndex(input.getPageIndex());
//        datingShot.setPageSize(input.getPageSize());
        List<DatingShot> datingShotsList = datingShotService.selectByExample(datingShot);
        List<DatingShotPhoto> resultList = new ArrayList<>();
        logger.info("getDatingShotPhoto--getDatingShot : resultList {}", GsonUtil.toJson(datingShotsList));
        for (int i = 0; i < datingShotsList.size(); i++){
            DatingShot datingShot1 = datingShotsList.get(i);
            DatingShotPhoto datingShotPhoto = new DatingShotPhoto();
            datingShotPhoto.setDatingShotId(datingShot1.getDatingShotId());
            datingShotPhoto.setStatus(1);
            List<DatingShotPhoto> datingShotPhotoList = datingShotPhotoService.selectByExample(datingShotPhoto);
            UserInfo userInfo = new UserInfo();
            userInfo.setUserId(datingShot1.getUserId());
//            List<UserInfo> userInfos = userInfoService.selectByExample(userInfo);
//            if(userInfos.size() > 0){
//                datingShot1.setUserName(userInfos.get(0).getUserName());
//                datingShot1.setUserImage(userInfos.get(0).getUserImage());
//            }
//            datingShot1.setDatingShotImages(datingShotPhotoList);
            resultList.addAll(datingShotPhotoList);
        }
        Map returnMap = new HashMap();
        Integer pageStarg = input.getPageIndex() * input.getPageSize();
        Integer pageEnd = input.getPageIndex() * input.getPageSize() + input.getPageSize();
        if(pageEnd > resultList.size()){
            pageEnd = resultList.size();
        }
        resultList = resultList.subList(pageStarg, pageEnd);
        returnMap.put("datingShotPhotos",resultList);
        returnMap.put("pageSize", input.getPageSize());
        returnMap.put("pageIndex", input.getPageIndex());

        outputData(returnMap);
    }

}
