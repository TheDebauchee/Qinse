package com.qs.sso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	//登录
	@RequestMapping("/login")
	@ResponseBody
	public SysResult login(String u,String p){
		try {
			String ticket = userService.savelogin(u, p);
			return SysResult.oK(ticket);
		} catch (Exception e) {
			return SysResult.build(201, "用户登录失败!");
		}
	}
	
	
	
//	redis以后向redis获取缓存信息
//	@RequestMapping("/query/{ticket}")
//	@ResponseBody
//	public SysResult queryByTicket(@PathVariable String ticket){
//		try {
//			String userJson = redisService.get(ticket);
//			return SysResult.oK(userJson); 
//		} catch (Exception e) {
//			return SysResult.build(201,"查询用户信息失败!"); 
//		}
//	}
	
	
	

}
