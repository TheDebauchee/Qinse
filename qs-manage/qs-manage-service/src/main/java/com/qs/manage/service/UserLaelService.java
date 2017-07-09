package com.qs.manage.service;

import org.springframework.stereotype.Service;

import com.qs.manage.mapper.UserLabelMapper;
import com.qs.manage.pojo.UserLabel;

@Service
public class UserLaelService {
	private UserLabelMapper userMapper;
	public UserLabel findUserLabelById(Long id) {
		UserLabel userLabel = userMapper.findUserMapperById(id);
		return userLabel;
	}
	
}
