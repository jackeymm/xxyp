package com.xxyp.controller;

import com.xxyp.common.BaseController;
import com.xxyp.input.CreateDatingShotInput;
import com.xxyp.model.DatingShot;
import com.xxyp.model.Works;
import com.xxyp.model.WorksPhoto;
import com.xxyp.service.IDatingShotService;
import com.xxyp.service.IWorksPhotoService;
import com.xxyp.service.IWorksService;
import com.xxyp.utils.GsonUtil;
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
 * Created by jackeymm on 2017/3/12.
 */
@Controller
public class DatingShotController extends BaseController{

    private static final Logger logger = LoggerFactory.getLogger(DatingShotController.class);


    @Autowired
    private IDatingShotService datingShotService;



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
        logger.info("### createDatingShot param : "+GsonUtil.toJson(datingShot));
        int result = datingShotService.insert(datingShot);
        logger.info("### createDatingShot result : "+result);

        List<DatingShot> list = datingShotService.selectByExample(datingShot);
        logger.info("### createDatingShot list : "+GsonUtil.toJson(list));

        Long datingShotId = list.get(list.size()-1).getDatingShotId();
        logger.info("### createDatingShot worksId : "+datingShotId);

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

    public void updateDatingShot(@RequestBody DatingShot datingShot) {
        logger.info("### updateDatingShot param : "+GsonUtil.toJson(datingShot));
        datingShot.setStatus(1);
        datingShot.setReleaseTime(System.currentTimeMillis());
        int result = datingShotService.updateByPrimaryKey(datingShot);
        logger.info("### updateDatingShot result : "+result);
        outputData();
    }

    @RequestMapping(value = "getDatingShot", method = RequestMethod.GET)
    @ApiOperation(
            value = "获取约拍接口",
            notes = "获取约拍信息.</br>"+
                    "Method: GET</br>" +
                    "Error Code: </br>"
                    ,
            response = List.class,
            consumes = "application/json"
    )
    public void getDatingShot(@ModelAttribute DatingShot datingShot) {
        List<DatingShot> resultList = datingShotService.selectByExample(datingShot);
        Map returnMap = new HashMap();
        returnMap.put("works",resultList);
        outputData(returnMap);
    }



}
