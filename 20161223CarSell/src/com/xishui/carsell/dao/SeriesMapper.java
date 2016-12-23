package com.xishui.carsell.dao;

import org.springframework.stereotype.Repository;

import com.xishui.carsell.entity.Series;
@Repository
public interface SeriesMapper {
    int deleteByPrimaryKey(Integer seriesid);

    int insert(Series record);

    int insertSelective(Series record);

    Series selectByPrimaryKey(Integer seriesid);

    int updateByPrimaryKeySelective(Series record);

    int updateByPrimaryKey(Series record);
}