package com.qs.web.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qs.common.service.HttpClientService;
import com.qs.web.pojo.User;

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
	
	
	
	
}
