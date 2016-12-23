package com.xishui.carsell.dao;

import org.springframework.stereotype.Repository;

import com.xishui.carsell.entity.Review;
@Repository
public interface ReviewMapper {
    int deleteByPrimaryKey(Integer reviewid);

    int insert(Review record);

    int insertSelective(Review record);

    Review selectByPrimaryKey(Integer reviewid);

    int updateByPrimaryKeySelective(Review record);

    int updateByPrimaryKey(Review record);
}