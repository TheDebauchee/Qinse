package com.qs.manage.service;

import java.util.Date;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qs.common.service.BaseService;
import com.qs.manage.mapper.UserMapper;
import com.qs.manage.pojo.User;


@Service
public class UserService extends BaseService<User>{
	@Autowired
	private UserMapper userMapper;
	//注册
	public void saveRegister(User user) {
		user.setCreated(new Date());
		user.setUpdated(user.getCreated());
		user.setPassword(DigestUtils.md5Hex(user.getPassword()));
		userMapper.insertSelective(user);
	}
	
	
}
