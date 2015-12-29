package com.liyi.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	@RequestMapping("/test.do")
	public String test(){
		return "test";
	}
}
