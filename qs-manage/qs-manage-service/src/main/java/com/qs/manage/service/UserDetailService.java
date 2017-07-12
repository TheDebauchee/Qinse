package com.qs.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qs.common.service.BaseService;
import com.qs.manage.mapper.UserDetailMapper;
import com.qs.manage.pojo.BigUser;
import com.qs.manage.pojo.UserDetail;

@Service
public class UserDetailService extends BaseService<UserDetail>{
	
	@Autowired
	private UserDetailMapper userDetailMapper;

	public void saveRegister(BigUser bigUser, Long userId) {
		UserDetail userDetail = new UserDetail();
		userDetail.setUserId(userId);
		userDetail.setHomeLoc(bigUser.getHomeLoc());
		userDetail.setWeight(bigUser.getWeight());
		userDetail.setShape(bigUser.getShape());
		userDetail.setZodiac(bigUser.getZodiac());
		userDetail.setSign(bigUser.getSign());
		userDetail.setRace(bigUser.getRace());
		userDetail.setReligion(bigUser.getReligion());
		userDetail.setGradFrom(bigUser.getGradFrom());
		userDetail.setMajor(bigUser.getMajor());
		userDetail.setSelfDesc(bigUser.getSelfDesc());
		
		userDetailMapper.insertSelective(userDetail);
	}
	
	
}
