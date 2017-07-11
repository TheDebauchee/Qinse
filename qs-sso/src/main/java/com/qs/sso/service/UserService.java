package com.qs.sso.service;

import java.util.Date;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qs.common.service.BaseService;
import com.qs.sso.mapper.UserMapper;
import com.qs.sso.pojo.User;

@Service
public class UserService extends BaseService<User>{
	
	@Autowired
	private UserMapper userMapper;
	

	
	public String savelogin(String phone,String password){
		String ticket = "";
		User params = new User();
		params.setPhone(phone);
		User curUser = super.queryByWhere(params);
		if(null!=curUser){
			String newPwd = DigestUtils.md5Hex(password);
			if(newPwd.equals(curUser.getPassword())){
				ticket =DigestUtils.md5Hex(System.currentTimeMillis() + curUser.getPhone()+curUser.getUserId());
//				redisService.set(ticket, MAPPER.writeValueAsString(curUser),86400*7);	//jvm编译时就算出来了
			}
		}
		return ticket;
	}
	
	
	
}
