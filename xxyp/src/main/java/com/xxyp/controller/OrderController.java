package com.xxyp.controller;

import com.xxyp.common.BaseController;
import com.xxyp.model.Order;
import com.xxyp.model.UserInfo;
import com.xxyp.service.IOrderService;
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
 * Created by jackeymm on 2017/3/29.
 */
@Controller
public class OrderController extends BaseController{

    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private IOrderService orderService;

    @RequestMapping(value = "createOrder", method = RequestMethod.POST)

    @ApiOperation(
            value = "增加订单/作品信息接口",
            notes = "增加订单/作品信息.</br>"+
                    "Method: POST</br>" +
                    "Error Code: </br>"
            ,
            response = Order.class,
            consumes = "application/json"
    )
    public void createOrder(@RequestBody Order order) {
        logger.info("增加用户信息入参====》"+ GsonUtil.toJson(order));
        int result = orderService.insert(order);
        outputData(result);
    }
}
