package com.xishui.carsell.dao;

import org.springframework.stereotype.Repository;

import com.xishui.carsell.entity.OrderDsc;
@Repository
public interface OrderDscMapper {
    int deleteByPrimaryKey(Integer orderdscid);

    int insert(OrderDsc record);

    int insertSelective(OrderDsc record);

    OrderDsc selectByPrimaryKey(Integer orderdscid);

    int updateByPrimaryKeySelective(OrderDsc record);

    int updateByPrimaryKey(OrderDsc record);
}