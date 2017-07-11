package com.qs.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qs.common.vo.SysResult;
import com.qs.web.pojo.User;
import com.qs.web.pojo.UserInfo;
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
	@RequestMapping("/doRegister")
	@ResponseBody
	public SysResult saveRegister(User user){
		String username = userService.saveRegister(user);
		return SysResult.oK(username);
	}
	
	//转向登陆
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	
	public SysResult doLogin(String phone,String password,HttpServletRequest request, HttpServletResponse response){
		try {
			String ticket = userService.saveLogin(phone,password);
			return SysResult.oK();
		} catch (Exception e) {
			return SysResult.build(201, "登录失败");
		}
	}
	
	//查看个人中心
	@RequestMapping("/info")
	public String selectInfo(){
		
		return "index";
	}
	
	//修改个人资料
	@RequestMapping("/update")
	public SysResult updateRegist(UserInfo info){
		try {
			userService.updateUserInfo(info);
			return SysResult.oK();
		} catch (Exception e) {
			return SysResult.build(201, "更新失败!");
		}
		
	}
	
	
	
	
	
	
}
