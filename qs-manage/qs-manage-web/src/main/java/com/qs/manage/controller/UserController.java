package com.qs.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qs.manage.pojo.User;
import com.qs.manage.service.UserService;


@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	//增加一个用户
	@RequestMapping("")
	public void saveUser(User user){
		userService.saveSelective(user);
	}
	
	//删除一个用户
	@RequestMapping("")
	public void deleteUser(String[] userIds){
		userService.deleteByIds(userIds);
	}
	
	//修改一个用户
	@RequestMapping("")
	public void updateUser(User user){
		userService.updateSelective(user);
		
	}
	
	//根据用户id查询一个用户
	@RequestMapping("")
	public User findOne(String userId){
		
		User user = userService.queryById(userId);
		return user;
	}
	
	//查询全部用户
	@RequestMapping("")
	public List<User> findAllUsers(){
		
		List<User> users = userService.queryAll();
		return users;
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
	
	
}
