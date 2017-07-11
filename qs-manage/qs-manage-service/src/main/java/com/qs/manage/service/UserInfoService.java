package com.qs.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qs.common.service.BaseService;
import com.qs.manage.mapper.UserInfoMapper;
import com.qs.manage.pojo.UserInfo;
@Service
public class UserInfoService extends BaseService<UserInfo>{
	@Autowired
	private UserInfoMapper userInfoMapper;
	public void updateUserInfo(UserInfo info) {
		userInfoMapper.updateByPrimaryKeySelective(info);
	}
}
