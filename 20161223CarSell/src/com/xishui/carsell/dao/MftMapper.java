package com.xishui.carsell.dao;

import org.springframework.stereotype.Repository;

import com.xishui.carsell.entity.Mft;
@Repository
public interface MftMapper {
    int deleteByPrimaryKey(Integer mftid);

    int insert(Mft record);

    int insertSelective(Mft record);

    Mft selectByPrimaryKey(Integer mftid);

    int updateByPrimaryKeySelective(Mft record);

    int updateByPrimaryKey(Mft record);
}