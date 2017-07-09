package com.qs.web.service;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qs.common.service.HttpClientService;
import com.qs.web.pojo.UserInfo;
@Service
public class UserInfoService {
	private HttpClientService httpService;
	private ObjectMapper MAPPER = new ObjectMapper();
	public  UserInfo findUserInfoById(Long userId) {
		String url = "http://manage.qs.com/userInfo"+userId;
		try {
			String jsonData = httpService.doGet(url);
			UserInfo userInfo = MAPPER.readValue(jsonData, UserInfo.class);
			return userInfo;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

}
