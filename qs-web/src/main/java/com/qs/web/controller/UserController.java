package com.qs.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qs.common.vo.SysResult;
import com.qs.web.pojo.User;
import com.qs.web.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//转向注册页面
	@RequestMapping("/register")
	public String register(){
		return "regeister";
	}
	
	//注册
	public SysResult saveRegister(User user){
		String username = userService.saveRegister(user);
		return SysResult.oK(username);
	}
	
	
	
	
	
	
}
