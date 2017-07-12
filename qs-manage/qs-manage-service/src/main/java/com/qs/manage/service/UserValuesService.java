package com.qs.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qs.common.service.BaseService;
import com.qs.manage.mapper.UserValuesMapper;
import com.qs.manage.pojo.BigUser;
import com.qs.manage.pojo.UserValues;

@Service
public class UserValuesService extends BaseService<UserValues> {
	
	@Autowired
	private UserValuesMapper userValuesMapper;

	public void saveRegister(BigUser bigUser, Long userId) {
		UserValues userValues = new UserValues();
		userValues.setUserId(userId);
		
		
		userValues.setMaritalStatus(bigUser.getMaritalStatus());
		userValues.setWhenToMarry(bigUser.getWhenToMarry());
		userValues.setWantKid(bigUser.getWantKid());
		userValues.setWantParent(bigUser.getWantParent());
		userValues.setWantSeperation(bigUser.getWantSeperation());
		userValues.setDesiredDate(bigUser.getDesiredDate());
		
		
		userValuesMapper.insertSelective(userValues);
	}
	
	
	
	
	
}
