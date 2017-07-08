package com.qs.web.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qs.common.service.HttpClientService;
import com.qs.web.pojo.User;
import com.qs.web.pojo.UserLabel;

public class UserService {
	@Autowired
	private HttpClientService httpClientService;
	private static final ObjectMapper MAPPER = new ObjectMapper();
	
	public String saveRegister(User user){
		String url = "http://sso.qs.com/user/register";
		Map<String,String> params = new HashMap<String,String>();
//		params.put("username", );
		return null;
		
		
	}
	/**
	 * 根据用户ID到用户关注表中查询用户关注的人
	 * @param userId 用户id
	 * @return	所有关注的人的集合
	 */
	public List<String> findUserAtteIdByID(String userId){
		//调用后台接口，到数据库中根据用户Id查询关注的人。
		String url = "http://manage.qs.com/user/findUserAtteIdById"+userId;
		//初始化返回参数，避免出现空指针异常
		List<String> atteIds = new ArrayList();
		try {
			String jsonData = httpClientService.doGet(url);
			Object obj = null;
			JsonNode jsNode = MAPPER.readTree(jsonData).get("data");
			 if (jsNode.isArray() && jsNode.size() > 0) {
		            obj = MAPPER.readValue(jsNode.traverse(),
		                    MAPPER.getTypeFactory().constructCollectionType(List.class, UserLabel.class));
		        }
			 atteIds = (List<String>) obj;
			 return atteIds; 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
}
