package com.xishui.carsell.dao;

import org.springframework.stereotype.Repository;

import com.xishui.carsell.entity.GoodsType;
@Repository
public interface GoodsTypeMapper {
    int deleteByPrimaryKey(Integer goodstypeid);

    int insert(GoodsType record);

    int insertSelective(GoodsType record);

    GoodsType selectByPrimaryKey(Integer goodstypeid);

    int updateByPrimaryKeySelective(GoodsType record);

    int updateByPrimaryKey(GoodsType record);
}