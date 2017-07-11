package com.qs.manage.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qs.common.vo.SysResult;
import com.qs.manage.pojo.User;
import com.qs.manage.pojo.UserInfo;
import com.qs.manage.service.UserInfoService;
import com.qs.manage.service.UserService;

import qs.manage.pojo.SelectedMember;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserInfoService userInfoService;
	
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
	

	
	//根据条件查找单个用户
	public User find(User user){
		User user1 = userService.queryByWhere(user);
		return user1;
	}
		
	//根据条件查找多个用户
	@RequestMapping("")
	public List<User> findUsersByWhere(User user){
		List<User> userList = userService.queryListByWhere(user);
		return userList;
		
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
	
<<<<<<< HEAD
	@RequestMapping("/getMessage/{myId}")
	public String getMessage(Long myId){
		Long userId=userService.getUserId(myId);
		return userService.getNickName(userId);
	}
} 
=======
	
	
	
	
}
>>>>>>> 385d261f0ccc945f192cc82b348eb0e0795bb89f










