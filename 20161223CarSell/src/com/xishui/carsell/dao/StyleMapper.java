package com.xishui.carsell.dao;

import org.springframework.stereotype.Repository;

import com.xishui.carsell.entity.Style;
@Repository
public interface StyleMapper {
    int deleteByPrimaryKey(Integer styleid);

    int insert(Style record);

    int insertSelective(Style record);

    Style selectByPrimaryKey(Integer styleid);

    int updateByPrimaryKeySelective(Style record);

    int updateByPrimaryKey(Style record);
}