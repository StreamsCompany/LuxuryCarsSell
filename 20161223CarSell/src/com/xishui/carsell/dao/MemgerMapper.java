package com.xishui.carsell.dao;

import org.springframework.stereotype.Repository;

import com.xishui.carsell.entity.Memger;
@Repository
public interface MemgerMapper {
    int deleteByPrimaryKey(Integer managerid);

    int insert(Memger record);

    int insertSelective(Memger record);

    Memger selectByPrimaryKey(Integer managerid);

    int updateByPrimaryKeySelective(Memger record);

    int updateByPrimaryKey(Memger record);
}