package com.qs.sso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qs.common.vo.SysResult;
import com.qs.sso.pojo.User;
import com.qs.sso.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
//	http://sso.qs.com/user/register
	@RequestMapping("/register")	//注册
	@ResponseBody
	public SysResult register(User user){
		try {
			String username = userService.saveRegister(user);
			return SysResult.oK(username);
		} catch (Exception e) {
			return SysResult.build(201, "注册失败",user.getUsername());
		}
	}
	
	

}
