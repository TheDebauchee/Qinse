package com.qs.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qs.common.service.BaseService;
import com.qs.manage.mapper.UserMapper;

import qs.manage.pojo.User;

@Service
public class UserService extends BaseService<User>{
	@Autowired
	private UserMapper userMapper;
}
