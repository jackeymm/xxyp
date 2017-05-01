package com.xxyp.service;

import com.xxyp.model.Order;
import com.xxyp.model.OrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by jackeymm on 2017/3/29.
 */
public interface IOrderService {

    int countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int deleteByPrimaryKey(Long orderId);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(Long orderId);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}
