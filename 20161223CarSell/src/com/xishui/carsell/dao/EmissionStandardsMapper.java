package com.xishui.carsell.dao;

import org.springframework.stereotype.Repository;

import com.xishui.carsell.entity.EmissionStandards;
@Repository
public interface EmissionStandardsMapper {
    int deleteByPrimaryKey(Integer outid);

    int insert(EmissionStandards record);

    int insertSelective(EmissionStandards record);

    EmissionStandards selectByPrimaryKey(Integer outid);

    int updateByPrimaryKeySelective(EmissionStandards record);

    int updateByPrimaryKey(EmissionStandards record);
}