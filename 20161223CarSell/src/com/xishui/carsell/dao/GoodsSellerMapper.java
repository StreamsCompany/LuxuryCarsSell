package com.xishui.carsell.dao;

import org.springframework.stereotype.Repository;

import com.xishui.carsell.entity.GoodsSeller;
@Repository
public interface GoodsSellerMapper {
    int deleteByPrimaryKey(Integer goodssellerid);

    int insert(GoodsSeller record);

    int insertSelective(GoodsSeller record);

    GoodsSeller selectByPrimaryKey(Integer goodssellerid);

    int updateByPrimaryKeySelective(GoodsSeller record);

    int updateByPrimaryKey(GoodsSeller record);
}