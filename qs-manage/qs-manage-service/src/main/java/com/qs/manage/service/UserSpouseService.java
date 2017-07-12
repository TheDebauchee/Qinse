package com.qs.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qs.common.service.BaseService;
import com.qs.manage.mapper.UserSpouseMapper;
import com.qs.manage.pojo.BigUser;
import com.qs.manage.pojo.Spouse;

@Service
public class UserSpouseService extends BaseService<Spouse>{
	@Autowired
	private UserSpouseMapper userSpouseMapper;

	public void saveRegister(BigUser bigUser, Long userId) {
		Spouse spouse = new Spouse();
		spouse.setUserId(userId);
		spouse.setsGender(bigUser.getsGender());
		spouse.setsMinAge(bigUser.getsMinAge());
		spouse.setsMaxAge(bigUser.getsMaxAge());
		spouse.setsMaritalStatus(bigUser.getsMaritalStatus());
		spouse.setsWorkplace(bigUser.getsWorkplace());
		spouse.setsHomeLoc(bigUser.getsHomeLoc());
		spouse.setsEducation(bigUser.getsEducation());
		spouse.setsMinHeight(bigUser.getsMinHeight());
		spouse.setsMaxHeight(bigUser.getsMaxHeight());
		spouse.setsMinSalary(bigUser.getsMinSalary());
		spouse.setsMaxSalary(bigUser.getsMaxSalary());
		spouse.setsHaschild(bigUser.getsHaschild());
		spouse.setsHashouse(bigUser.getsHashouse());
		
		userSpouseMapper.insertSelective(spouse);
	}
	
	
}
