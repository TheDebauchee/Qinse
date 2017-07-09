package com.qs.manage.controller;

<<<<<<< HEAD
=======
import java.io.IOException;
import java.util.List;
>>>>>>> ab2aa842685dcfe090376ff8bff19a6bd8e6da98

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

<<<<<<< HEAD
import com.qs.common.vo.SysResult;
import com.qs.manage.pojo.User;
import com.qs.manage.service.UserService;

=======
import com.qs.manage.pojo.User;
import com.qs.manage.service.UserService;

import qs.manage.pojo.SelectedMember;

>>>>>>> ab2aa842685dcfe090376ff8bff19a6bd8e6da98
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
	
	
	
<<<<<<< HEAD

	
=======
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
	@RequestMapping("findSelectedMember")
	@ResponseBody	//返回json
	public List<SelectedMember> findSelectedMember(){
		return userService.findSelectedMember();
	}
>>>>>>> ab2aa842685dcfe090376ff8bff19a6bd8e6da98
	
}










