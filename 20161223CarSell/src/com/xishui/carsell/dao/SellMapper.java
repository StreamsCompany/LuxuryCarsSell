package com.xishui.carsell.dao;

import org.springframework.stereotype.Repository;

import com.xishui.carsell.entity.Sell;
@Repository
public interface SellMapper {
    int deleteByPrimaryKey(Integer sellid);

    int insert(Sell record);

    int insertSelective(Sell record);

    Sell selectByPrimaryKey(Integer sellid);

    int updateByPrimaryKeySelective(Sell record);

    int updateByPrimaryKey(Sell record);
}