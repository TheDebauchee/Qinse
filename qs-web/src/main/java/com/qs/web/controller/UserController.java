package com.qs.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	
	//转向注册页面
	@RequestMapping("register")
	public String register(){
		return "regeister";
	}
	
	
	
	
	
	
	
}
