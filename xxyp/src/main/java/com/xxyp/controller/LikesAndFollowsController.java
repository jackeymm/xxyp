package com.xxyp.controller;

import com.xxyp.common.BaseController;
import com.xxyp.model.*;
import com.xxyp.service.IFansService;
import com.xxyp.service.ILikesService;
import com.xxyp.service.IWorksService;
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
 * Created by jackeymm on 2017/3/12.
 */
@Controller
public class LikesAndFollowsController extends BaseController{

    private static final Logger logger = LoggerFactory.getLogger(LikesAndFollowsController.class);


    @Autowired
    private ILikesService likesService;

    @Autowired
    private IFansService fansService;

    @RequestMapping(value = "getUserFansAndFollowCounts", method = RequestMethod.GET)
    @ApiOperation(
            value = "获取关注/粉丝人数接口",
            notes = "获取关注/粉丝人数.</br>"+
                    "Method: GET</br>" +
                    "Error Code: </br>"
                    ,
            response = Map.class,
            consumes = "application/json"
    )
    public void getUserFansAndFollowCounts(@ModelAttribute UserFans userFans) {
//        Likes
//        List<Likes> likesList = likesService.selectByExample(likes);
        Fans fans = new Fans();
        fans.setToUserId(userFans.getUserId());
        int fansCounts = fansService.selectFansCountByExample(fans);
        Fans follows = new Fans();
        follows.setFromUserId(userFans.getUserId());
        int followsCounts = fansService.selectFansCountByExample(follows);
        Map map = new HashMap();
        map.put("fansCount",fansCounts);
        map.put("followCount",followsCounts);

        outputData(map);
    }



}
