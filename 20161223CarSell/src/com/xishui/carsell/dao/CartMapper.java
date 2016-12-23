package com.xishui.carsell.dao;

import org.springframework.stereotype.Repository;

import com.xishui.carsell.entity.Cart;
@Repository
public interface CartMapper {
    int deleteByPrimaryKey(Integer cartid);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer cartid);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);
}