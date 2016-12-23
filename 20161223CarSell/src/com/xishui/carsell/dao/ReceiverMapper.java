package com.xishui.carsell.dao;

import org.springframework.stereotype.Repository;

import com.xishui.carsell.entity.Receiver;
@Repository
public interface ReceiverMapper {
    int deleteByPrimaryKey(Integer receiverid);

    int insert(Receiver record);

    int insertSelective(Receiver record);

    Receiver selectByPrimaryKey(Integer receiverid);

    int updateByPrimaryKeySelective(Receiver record);

    int updateByPrimaryKey(Receiver record);
}