package com.qs.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qs.common.service.BaseService;
import com.qs.manage.mapper.UserStatusMapper;
import com.qs.manage.pojo.BigUser;
import com.qs.manage.pojo.UserStatus;
@Service
public class UserStatusService extends BaseService<UserStatus>{
	@Autowired
	private UserStatusMapper userStatusMapper;

	public void saveRegister(BigUser bigUser, Long userId) {
		UserStatus userStatus = new UserStatus();
		userStatus.setUserId(userId);
		userStatus.setOccupation(bigUser.getOccupation());
		userStatus.setFirm(bigUser.getFirm());
		userStatus.setFirm(bigUser.getSmoke());
		userStatus.setFirm(bigUser.getDrink());
		userStatus.setFirm(bigUser.getHascar());
		userStatus.setFirm(bigUser.getCooking());
		userStatus.setFirm(bigUser.getHousework());
		
		
		userStatusMapper.insertSelective(userStatus);
	}
	
	
	
	
	
}
