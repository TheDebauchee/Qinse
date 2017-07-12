package com.qs.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qs.common.util.CookieUtils;
import com.qs.common.vo.SysResult;
import com.qs.web.pojo.BigUser;
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
		return "register";
	}
	
	//注册
	@RequestMapping("/doRegister")
	@ResponseBody
	public SysResult saveRegister(BigUser bigUser){
		String phone = userService.saveRegister(bigUser);
		
		return SysResult.oK(phone);
	}
	
	//转向登陆
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	
	@RequestMapping("/doLogin")
	@ResponseBody
	public SysResult doLogin(String phone,String password,HttpServletRequest request, HttpServletResponse response){
		try {
			String ticket = userService.saveLogin(phone,password);
			String cookieName = "QS_TICKET";
			CookieUtils.setCookie(request, response, cookieName, ticket);
			return SysResult.oK();
		} catch (Exception e) {
			return SysResult.build(201, "登录失败");
		}
	}
	
	//登出
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request, HttpServletResponse response){
		//删除cookie
		CookieUtils.deleteCookie(request, response, "QS_TICKET");
		return "index";
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
	@RequestMapping("/sayhi")
	public void sayHi(Long myId,Long userId){
		userService.sayHi(myId,userId);
	}
	@RequestMapping("/getmessage")
	public String getMessage(Long myId,Model model){
		String nickName=userService.getMessage(myId);
		model.addAttribute("nickName",nickName);
		int hi=1;
		model.addAttribute("hi",hi);
		return "index";
	}
	
	
	
	
	
}
