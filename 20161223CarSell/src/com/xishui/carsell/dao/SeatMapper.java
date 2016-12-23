package com.xishui.carsell.dao;

import org.springframework.stereotype.Repository;

import com.xishui.carsell.entity.Seat;
@Repository
public interface SeatMapper {
    int deleteByPrimaryKey(Integer seatid);

    int insert(Seat record);

    int insertSelective(Seat record);

    Seat selectByPrimaryKey(Integer seatid);

    int updateByPrimaryKeySelective(Seat record);

    int updateByPrimaryKey(Seat record);
}