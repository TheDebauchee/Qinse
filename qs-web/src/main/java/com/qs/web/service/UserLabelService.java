package com.qs.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qs.common.service.HttpClientService;
import com.qs.web.pojo.UserLabel;

@Service
public class UserLabelService {
	@Autowired
	private HttpClientService httpService;
	private ObjectMapper MAPPER = new ObjectMapper();
	public  UserLabel findUserById(String userId) {
		String url = "http:/manage.jt.com/getLabel/"+userId;
		try {
			String jsonData = httpService.doGet(url);
			UserLabel userLabel = MAPPER.readValue(jsonData, UserLabel.class);
			return userLabel;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

}
