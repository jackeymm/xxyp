package com.xxyp.service.impl;

import com.xxyp.dao.OrderMapper;
import com.xxyp.model.Order;
import com.xxyp.model.OrderExample;
import com.xxyp.service.IOrderService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jackeymm on 2017/3/29.
 */
@Service
public class OrderServiceImpl implements IOrderService{
    @Autowired
    private OrderMapper orderMapper;

    public int countByExample(OrderExample example) {
        return orderMapper.countByExample(example);
    }

    public int deleteByExample(OrderExample example) {
        return orderMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Long orderId) {
        return orderMapper.deleteByPrimaryKey(orderId);
    }

    public int insert(Order record) {
        return orderMapper.insert(record);
    }

    public int insertSelective(Order record) {
        return orderMapper.insertSelective(record);
    }

    public List<Order> selectByExample(OrderExample example) {
        return orderMapper.selectByExample(example);
    }

    public Order selectByPrimaryKey(Long orderId) {
        return orderMapper.selectByPrimaryKey(orderId);
    }

    public int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example) {
        return orderMapper.updateByExampleSelective(record,example);
    }

    public int updateByExample(@Param("record") Order record, @Param("example") OrderExample example) {
        return orderMapper.updateByExample(record,example);
    }

    public int updateByPrimaryKeySelective(Order record) {
        return orderMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Order record) {
        return orderMapper.updateByPrimaryKey(record);
    }
}
