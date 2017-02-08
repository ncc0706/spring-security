package com.xlinyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/a")
	public String a(){
		return "test/a";
	}
	
	@RequestMapping("/b")
	public String b(){
		return "test/b";
	}
}
