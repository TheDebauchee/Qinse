package com.qs.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qs.common.service.HttpClientService;
import com.qs.web.pojo.Spouse;
import com.qs.web.util.User;
import com.qs.web.pojo.UserLabel;
@Service
public class CupidService {
	@Autowired
	private HttpClientService httpService;
	private ObjectMapper MAPPER = new ObjectMapper();
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
	}
	
	/**
	 * 查找符合求偶条件的用户
	 * @param userSpouse
	 * @return
	 */
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
	}
}
