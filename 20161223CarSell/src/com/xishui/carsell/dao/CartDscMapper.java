package com.xishui.carsell.dao;

import org.springframework.stereotype.Repository;

import com.xishui.carsell.entity.CartDsc;
@Repository
public interface CartDscMapper {
    int deleteByPrimaryKey(Integer cartdscid);

    int insert(CartDsc record);

    int insertSelective(CartDsc record);

    CartDsc selectByPrimaryKey(Integer cartdscid);

    int updateByPrimaryKeySelective(CartDsc record);

    int updateByPrimaryKey(CartDsc record);
}