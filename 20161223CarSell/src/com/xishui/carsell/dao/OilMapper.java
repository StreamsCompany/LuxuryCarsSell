package com.xishui.carsell.dao;

import org.springframework.stereotype.Repository;

import com.xishui.carsell.entity.Oil;
@Repository
public interface OilMapper {
    int deleteByPrimaryKey(Integer oilid);

    int insert(Oil record);

    int insertSelective(Oil record);

    Oil selectByPrimaryKey(Integer oilid);

    int updateByPrimaryKeySelective(Oil record);

    int updateByPrimaryKey(Oil record);
}