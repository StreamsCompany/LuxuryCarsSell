package com.xishui.carsell.dao;

import org.springframework.stereotype.Repository;

import com.xishui.carsell.entity.Number;
@Repository
public interface NumberMapper {
    int deleteByPrimaryKey(Integer numid);

    int insert(Number record);

    int insertSelective(Number record);

    Number selectByPrimaryKey(Integer numid);

    int updateByPrimaryKeySelective(Number record);

    int updateByPrimaryKey(Number record);
}