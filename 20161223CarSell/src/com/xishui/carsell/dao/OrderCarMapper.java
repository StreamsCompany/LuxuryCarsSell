package com.xishui.carsell.dao;

import org.springframework.stereotype.Repository;

import com.xishui.carsell.entity.OrderCar;
@Repository
public interface OrderCarMapper {
    int deleteByPrimaryKey(Integer orderid);

    int insert(OrderCar record);

    int insertSelective(OrderCar record);

    OrderCar selectByPrimaryKey(Integer orderid);

    int updateByPrimaryKeySelective(OrderCar record);

    int updateByPrimaryKey(OrderCar record);
}