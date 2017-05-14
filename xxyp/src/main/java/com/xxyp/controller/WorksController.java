package com.xxyp.controller;

import com.xxyp.common.BaseController;
import com.xxyp.model.Works;
import com.xxyp.model.WorksPhoto;
import com.xxyp.service.IWorksPhotoService;
import com.xxyp.service.IWorksService;
import com.xxyp.utils.GsonUtil;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
public class WorksController extends BaseController{

    private static final Logger logger = LoggerFactory.getLogger(WorksController.class);


    @Autowired
    private IWorksService worksService;

    @Autowired
    private IWorksPhotoService worksPhotoService;


    @RequestMapping(value = "createWorks", method = RequestMethod.POST)
    @ApiOperation(
            value = "创建作品接口",
            notes = "创建作品信息.</br>"+
                    "Method: POST</br>" +
                    "Error Code: </br>"
            ,
            response = List.class,
            consumes = "application/json"
    )

    public void createWorks(@RequestBody Works works) {
        works.setStatus(1);
        works.setWorksId(null);
        works.setReleaseTime(System.currentTimeMillis());
        logger.info("### addWorks param : "+GsonUtil.toJson(works));
        int result = worksService.insert(works);
        logger.info("### addWorks result : "+result);

        List<Works> list = worksService.selectByExample(works);
        logger.info("### addWorks list : "+GsonUtil.toJson(list));

        Long worksId = list.get(list.size()-1).getWorksId();
        logger.info("### addWorks worksId : "+worksId);

        for (WorksPhoto worksPhoto : works.getList()){
            worksPhoto.setWorksId(worksId);
            worksPhoto.setStatus(1);
            worksPhoto.setWorksPhotoId(null);
            int worksPhotoResult = worksPhotoService.insert(worksPhoto);
            logger.info("### addWorks : addWorksPhoto : "+worksPhotoResult);
        }
        Map resultMap = new HashMap();
        resultMap.put("worksId",worksId);
        outputData(resultMap);
    }

    @RequestMapping(value = "updateWorks", method = RequestMethod.POST)
    @ApiOperation(
            value = "修改作品接口",
            notes = "修改作品信息.</br>"+
                    "Method: POST</br>" +
                    "Error Code: </br>"
            ,
            response = List.class,
            consumes = "application/json"
    )

    public void updateWorks(@RequestBody Works works) {
        logger.info("### updateWorks param : "+GsonUtil.toJson(works));
        works.setStatus(1);
        works.setReleaseTime(System.currentTimeMillis());
        int result = worksService.updateByPrimaryKey(works);
        logger.info("### updateWorks result : "+result);

        for (WorksPhoto worksPhoto : works.getList()){
            int worksPhotoResult = worksPhotoService.updateByPrimaryKey(worksPhoto);
            logger.info("### updateWorks : updateWorksPhoto : "+worksPhotoResult);
        }
        outputData();
    }

    @RequestMapping(value = "getWorks", method = RequestMethod.GET)
    @ApiOperation(
            value = "获取作品接口",
            notes = "获取作品信息.</br>"+
                    "Method: GET</br>" +
                    "Error Code: </br>"
                    ,
            response = List.class,
            consumes = "application/json"
    )
    public void getWorks(@ModelAttribute Works works) {
        List<Works> resultList = worksService.selectByExample(works);
        for (int i = 0; i < resultList.size(); i++){
            Works works1 = resultList.get(i);
            WorksPhoto worksPhoto = new WorksPhoto();
            worksPhoto.setWorksId(works1.getWorksId());
            List<WorksPhoto> worksPhotoList = worksPhotoService.selectByExample(worksPhoto);
            works1.setList(worksPhotoList);
            resultList.set(i,works1);
        }
        Map returnMap = new HashMap();
        returnMap.put("works",resultList);
        outputData(returnMap);
    }



}
