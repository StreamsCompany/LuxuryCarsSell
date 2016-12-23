package com.xishui.carsell.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xishui.carsell.dao.CarColorMapper;
import com.xishui.carsell.entity.CarColor;

@Service
public class ColorService {
	@Autowired
	private CarColorMapper carColorMapper;
	//通过汽车颜色的编号获得汽车颜色的方法
	public CarColor selectCarColorById(int coloid){
		
		return carColorMapper.selectByPrimaryKey(coloid);
	}
}
