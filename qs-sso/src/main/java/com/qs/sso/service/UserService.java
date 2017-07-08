package com.qs.sso.service;

import java.util.Date;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qs.sso.mapper.UserMapper;
import com.qs.sso.pojo.User;

@Service
public class UserService {
	
	
	@Autowired
	private UserMapper userMapper;
	
	
	

	public String saveRegister(User user) {
		user.setCreated(new Date());
		user.setUpdated(user.getCreated());
		user.setPassword(DigestUtils.md5Hex(user.getPassword()));
		userMapper.insertSelective(user);
		return user.getUsername();
	}
	
	
	
	
}
