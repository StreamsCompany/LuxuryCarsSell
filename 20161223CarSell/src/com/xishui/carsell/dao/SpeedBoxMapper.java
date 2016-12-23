package com.xishui.carsell.dao;

import org.springframework.stereotype.Repository;

import com.xishui.carsell.entity.SpeedBox;
@Repository
public interface SpeedBoxMapper {
    int deleteByPrimaryKey(Integer speedboxid);

    int insert(SpeedBox record);

    int insertSelective(SpeedBox record);

    SpeedBox selectByPrimaryKey(Integer speedboxid);

    int updateByPrimaryKeySelective(SpeedBox record);

    int updateByPrimaryKey(SpeedBox record);
}