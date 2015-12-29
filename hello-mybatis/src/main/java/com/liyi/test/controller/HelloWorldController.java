package com.liyi.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liyi.test.dao.UserMapper;
import com.liyi.test.domain.User;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@Autowired 
	private UserMapper userMapper;
	@RequestMapping("/test.do")
	public String test(){
		User user = userMapper.selectByPrimaryKey(1);
		System.out.println(user.getName());
		return "test";
	}
}
