package com.xxyp.controller;

import com.xxyp.common.BaseController;
import com.xxyp.model.UserInfo;
import com.xxyp.model.Works;
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
public class HotWorksController extends BaseController{

    private static final Logger logger = LoggerFactory.getLogger(HotWorksController.class);


    @Autowired
    private IWorksService worksService;

    @RequestMapping(value = "getHotWorks", method = RequestMethod.GET)
    @ApiOperation(
            value = "获取热门作品接口",
            notes = "获取热门作品信息.</br>"+
                    "Method: GET</br>" +
                    "Error Code: </br>"
                    ,
            response = Map.class,
            consumes = "application/json"
    )
    public void getHotWorks() {
        Works works = new Works();
        List<Works> resultList = worksService.selectByExample(works);
        outputData(resultList);
    }


}
