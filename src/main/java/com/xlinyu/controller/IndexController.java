package com.xlinyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping({"/", "/home"})
	public String index(ModelMap map){
		map.put("message", "Spring-Security.");
		return "index";
	}
	
}
