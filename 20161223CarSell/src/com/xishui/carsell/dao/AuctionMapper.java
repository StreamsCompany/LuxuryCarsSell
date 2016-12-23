package com.xishui.carsell.dao;

import org.springframework.stereotype.Repository;

import com.xishui.carsell.entity.Auction;
@Repository
public interface AuctionMapper {
    int deleteByPrimaryKey(Integer auctionid);

    int insert(Auction record);

    int insertSelective(Auction record);

    Auction selectByPrimaryKey(Integer auctionid);

    int updateByPrimaryKeySelective(Auction record);

    int updateByPrimaryKey(Auction record);
}