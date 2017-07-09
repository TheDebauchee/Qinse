package com.qs.manage.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qs.common.vo.SysResult;
import com.qs.manage.pojo.User;
import com.qs.manage.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/register")	//注册
	@ResponseBody
	public SysResult register(User user){
		try {
			userService.saveRegister(user);
			return SysResult.oK();
		} catch (Exception e) {
			return SysResult.build(201, "注册失败");
		}
	}
	
	
	

	
	
}
