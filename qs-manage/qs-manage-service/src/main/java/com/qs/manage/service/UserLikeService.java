package com.qs.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qs.common.service.BaseService;
import com.qs.manage.mapper.UserLikeMapper;
import com.qs.manage.pojo.BigUser;
import com.qs.manage.pojo.UserLike;

@Service
public class UserLikeService extends BaseService<UserLike> {
	@Autowired
	private UserLikeMapper userLikeMapper;

	public void saveRegister(BigUser bigUser, Long userId) {
		UserLike userLike = new UserLike();
		userLike.setUserId(userId);
		userLike.setHobbies(bigUser.getHobbies());
		userLikeMapper.insertSelective(userLike);
		
		
	}
	
	
}
