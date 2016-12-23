package com.xishui.carsell.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xishui.carsell.entity.CarColor;
import com.xishui.carsell.service.ColorService;

@Controller
@RequestMapping("/")
public class CarColorController {

	@Autowired
	private ColorService colorService;
	@RequestMapping(value="/color")
	public ModelAndView selectColorById(){
		ModelAndView mav = new ModelAndView("index.jsp");
		CarColor carColor = colorService.selectCarColorById(2);
		System.out.println(carColor.getColorname());
		mav.addObject("carColor",carColor);
		return mav;		
	} 
}
