package com.qs.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qs.manage.mapper.AtteMapper;
import com.qs.manage.pojo.AtteUser;
@Service
public class AtteService {
	@Autowired
	private AtteMapper atteMapper;
	public void saveAtteUser(Long userId, Long atteId) {
		// TODO Auto-generated method stub
		AtteUser atteUser = new AtteUser();
		atteUser.setUserId(userId);
		atteUser.setAtteId(atteId);
		atteMapper.insertSelective(atteUser);
	}
	public List<AtteUser> findAtteUser(Long userId) {
		AtteUser atteUser = new AtteUser();
		atteUser.setUserId(userId);
		List<AtteUser> atteUsers = atteMapper.select(atteUser);
		return atteUsers;
	}

}
