package com.qs.web.service;

import com.qs.web.pojo.UserInfo;
<<<<<<< HEAD
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
		
=======

public class userInfoService {

	public static UserInfo findUserInfoById(String userId) {
		// TODO Auto-generated method stub
		return null;
>>>>>>> 06d5c4b908b91f7c710c3b324b4901ace4bf71d7
	}

}
