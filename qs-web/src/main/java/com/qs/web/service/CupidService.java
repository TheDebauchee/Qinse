package com.qs.web.service;

import java.util.List;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qs.common.service.HttpClientService;
import com.qs.web.pojo.Spouse;
=======
import com.qs.web.util.User;
>>>>>>> 06d5c4b908b91f7c710c3b324b4901ace4bf71d7
import com.qs.web.pojo.UserContion;
import com.qs.web.pojo.UserInfo;

public class CupidService {
	/**
	 * 根据id查找用户(标签对象)对象
	 * @param userId
	 * @return
	 */
	public User findUserById(String userId) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 查找用户的求偶条件
	 * @param userId
	 * @return
	 */
<<<<<<< HEAD
	public Spouse findUserCondById(Long userId) {
		String url = "http://manage.qs.com/user/findUserCondById/"+userId;
		try {
			String jsonData = httpService.doGet(url);
			Spouse userCon = MAPPER.readValue(jsonData, Spouse.class);
			return userCon;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
=======
	public UserContion findUserCondById(String userId) {
		// TODO Auto-generated method stub
		return null;
>>>>>>> 06d5c4b908b91f7c710c3b324b4901ace4bf71d7
	}
	/**
	 * 查找符合求偶条件的用户
	 * @param userSpouse
	 * @return
	 */
<<<<<<< HEAD
	public List<UserLabel> findUserByCond(Spouse userSpouse) {
		String url = "http://manage.qs.com/userLabel/findUserByCond";
		try {
			String jsonData = httpService.doPostJson(url, MAPPER.writeValueAsString(userSpouse));
			JsonNode jsNode = MAPPER.readTree(jsonData).get("data");
			Object obj = null;
	        if (jsNode.isArray() && jsNode.size() > 0) {
	            obj = MAPPER.readValue(jsNode.traverse(),
	                    MAPPER.getTypeFactory().constructCollectionType(List.class, UserLabel.class));
	        }
	        return (List<UserLabel>) obj;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
=======
	public List<User> findUserByCond(UserContion userCon) {
		// TODO Auto-generated method stub
		return null;
>>>>>>> 06d5c4b908b91f7c710c3b324b4901ace4bf71d7
	}
	/**
	 * 查找相似的人
	 * @param userInfo
	 * @return
<<<<<<< HEAD
	 *//*
	public List<UserLabel> findSimUserByCond(UserInfo userInfo) {
		Integer maxAge = userInfo.getAge()+1;
		Integer minAge = userInfo.getAge()-1;
		String url = "http://manage.qs.com/userLabel/findSimUserByInfo/"+
		userInfo.getGender()+"/"+maxAge+"/"+minAge;
		try {
			String jsonData = httpService.doGet(url);
			
			JsonNode jsNode = MAPPER.readTree(jsonData).get("data");
			Object obj = null;
	        if (jsNode.isArray() && jsNode.size() > 0) {
	            obj = MAPPER.readValue(jsNode.traverse(),
	                    MAPPER.getTypeFactory().constructCollectionType(List.class, UserLabel.class));
	        }
			return (List<UserLabel>) obj;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}*/
=======
	 */
	public List<User> findSimUserByCond(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return null;
	}
>>>>>>> 06d5c4b908b91f7c710c3b324b4901ace4bf71d7

}
