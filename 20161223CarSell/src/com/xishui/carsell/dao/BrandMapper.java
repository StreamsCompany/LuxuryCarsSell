package com.xishui.carsell.dao;

import org.springframework.stereotype.Repository;

import com.xishui.carsell.entity.Brand;
@Repository
public interface BrandMapper {
    int deleteByPrimaryKey(Integer brandid);

    int insert(Brand record);

    int insertSelective(Brand record);

    Brand selectByPrimaryKey(Integer brandid);

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);
}