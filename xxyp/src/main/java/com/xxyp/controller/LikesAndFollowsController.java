package com.xxyp.controller;

import com.xxyp.common.BaseController;
import com.xxyp.model.Works;
import com.xxyp.model.WorksPhoto;
import com.xxyp.service.IWorksService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
public class LikesAndFollowsController extends BaseController{

    private static final Logger logger = LoggerFactory.getLogger(LikesAndFollowsController.class);


//    @Autowired
//    private IWorksService worksService;

    @RequestMapping(value = "getFansAndFollowCounts", method = RequestMethod.GET)
    @ApiOperation(
            value = "获取关注/粉丝人数接口",
            notes = "获取关注/粉丝人数.</br>"+
                    "Method: GET</br>" +
                    "Error Code: </br>"
                    ,
            response = Map.class,
            consumes = "application/json"
    )
    public void getFansAndFollowCounts() {
        Map map = new HashMap();
        map.put("fansCount","15");
        map.put("followCount","25");

        outputData(map);
    }



}
