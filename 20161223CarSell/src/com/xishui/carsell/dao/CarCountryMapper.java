package com.xishui.carsell.dao;

import org.springframework.stereotype.Repository;

import com.xishui.carsell.entity.CarCountry;
@Repository
public interface CarCountryMapper {
    int deleteByPrimaryKey(Integer counid);

    int insert(CarCountry record);

    int insertSelective(CarCountry record);

    CarCountry selectByPrimaryKey(Integer counid);

    int updateByPrimaryKeySelective(CarCountry record);

    int updateByPrimaryKey(CarCountry record);
}