package com.qs.manage.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qs.common.vo.SysResult;
import com.qs.manage.pojo.BigUser;
import com.qs.manage.pojo.UserInfo;
import com.qs.manage.service.UserDetailService;
import com.qs.manage.service.UserInfoService;
import com.qs.manage.service.UserLikeService;
import com.qs.manage.service.UserPhotoService;
import com.qs.manage.service.UserService;
import com.qs.manage.service.UserSpouseService;
import com.qs.manage.service.UserStatusService;
import com.qs.manage.service.UserValuesService;

import qs.manage.pojo.SelectedMember;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private UserInfoService userInfoService;
	@Autowired
	private UserSpouseService userSpouseService;
	@Autowired
	private UserDetailService userDetailService;
	@Autowired
	private UserLikeService userLikeService;
	@Autowired
	private UserPhotoService userPhotoService;
	@Autowired
	private UserStatusService userStatusService;
	@Autowired
	private UserValuesService userValuesService;
	
	//查看手机号是否重复
	@RequestMapping("/check/{phone}")
	public SysResult queryPhone(@PathVariable String phone){
		try {
			Boolean b = userService.queryByPhone(phone);
			return SysResult.oK(b);
		} catch (Exception e) {
			return SysResult.build(201, "检测失败!");
		}
	}
	
	
	
	@RequestMapping("/register")	//注册
	@ResponseBody
	public SysResult register(BigUser bigUser){
		try {
			Long userId = userService.saveRegister(bigUser);
			
			userInfoService.saveRegister(bigUser,userId);
			userSpouseService.saveRegister(bigUser,userId);
			userDetailService.saveRegister(bigUser,userId);
			userLikeService.saveRegister(bigUser,userId);
			userPhotoService.saveRegister(bigUser,userId);
			userStatusService.saveRegister(bigUser,userId);
			userValuesService.saveRegister(bigUser,userId);
			return SysResult.oK(userId);
		} catch (Exception e) {
			return SysResult.build(201, "注册失败");
		}
	}
	
	//登录
	@RequestMapping("/login")
	@ResponseBody
	public SysResult login(String phone,String password){
		try {
			String ticket = userService.savelogin(phone, password);
			return SysResult.oK(ticket);
		} catch (Exception e) {
			return SysResult.build(201, "用户登录失败!");
		}
	}
	
	
	
	
	
	
	
	
	//更新UserInfo
	@RequestMapping("/update")
	@ResponseBody
	public SysResult updateUserInfo(UserInfo info){
		try {
			userInfoService.updateUserInfo(info);
			return SysResult.oK();
		} catch (Exception e) {
			return SysResult.build(201, "更新失败!");
		}
	}
	

	
	
		
	
	//使用KMeans算法查找优质会员并存放到数据库selectedmember表中
	@RequestMapping("")
	public void saveSelectedMember(){
		try {
			userService.saveSelectedMember();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@RequestMapping("/findSelectedMember")
	@ResponseBody	//返回json
	public List<SelectedMember> findSelectedMember(){
		return userService.findSelectedMember();
	}
	//打招呼
	@RequestMapping("/{myId}/{userId}")
	public void sayHi(Long myId,Long userId){
		userService.sayHi(myId,userId);
	}
	
	@RequestMapping("/getMessage/{myId}")
	public String getMessage(Long myId){
		Long userId=userService.getUserId(myId);
		return userService.getNickName(userId);
	}
} 
	
	
	
	










