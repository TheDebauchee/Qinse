package com.qs.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qs.common.service.BaseService;
import com.qs.manage.mapper.UserPhotoMapper;
import com.qs.manage.pojo.BigUser;
import com.qs.manage.pojo.UserPhoto;

@Service
public class UserPhotoService extends BaseService<UserPhoto>{
	@Autowired
	private UserPhotoMapper userPhotoMapper;

	public void saveRegister(BigUser bigUser, Long userId) {
		UserPhoto userPhoto = new UserPhoto();
		userPhoto.setUserId(userId);
		userPhoto.setPic(bigUser.getPic1());
		userPhotoMapper.insertSelective(userPhoto);
	}
	
	
	
	
	
	
	
}
