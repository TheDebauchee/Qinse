package com.qs.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qs.common.service.BaseService;
import com.qs.manage.mapper.UserInfoMapper;
import com.qs.manage.pojo.BigUser;
import com.qs.manage.pojo.UserInfo;
@Service
public class UserInfoService extends BaseService<UserInfo>{
	@Autowired
	private UserInfoMapper userInfoMapper;
	
	public void updateUserInfo(UserInfo info) {
		userInfoMapper.updateByPrimaryKeySelective(info);
	}


	public void saveRegister(BigUser bigUser, Long userId) {
		UserInfo info = new UserInfo();
		info.setUserId(userId);
		info.setAge(bigUser.getAge());
		info.setGender(bigUser.getGender());
		
		info.setRelname(bigUser.getRelname());
		info.setNickname(bigUser.getNickname());
		info.setMaritalStatus(bigUser.getMaritalStatus());
		info.setWorkplace(bigUser.getWorkplace());
		info.setHeight(bigUser.getHeight());
		info.setEducation(bigUser.getEducation());
		info.setSalary(bigUser.getSalary());
		info.setHashouse(bigUser.getHashouse());
		info.setHaskid(bigUser.getHaskid());
		
		userInfoMapper.insertSelective(info);
	}
}
