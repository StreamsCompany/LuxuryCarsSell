package com.xishui.carsell.dao;

import org.springframework.stereotype.Repository;

import com.xishui.carsell.entity.CarColor;
@Repository
public interface CarColorMapper {
    int deleteByPrimaryKey(Integer coloid);

    int insert(CarColor record);

    int insertSelective(CarColor record);

    CarColor selectByPrimaryKey(Integer coloid);

    int updateByPrimaryKeySelective(CarColor record);

    int updateByPrimaryKey(CarColor record);
}