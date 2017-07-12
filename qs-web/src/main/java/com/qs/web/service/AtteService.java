package com.qs.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qs.common.service.HttpClientService;
import com.qs.web.pojo.AtteUser;
import com.qs.web.pojo.UserLabel;
@Service
public class AtteService {
	@Autowired
	private HttpClientService httpService;
	private ObjectMapper MAPPER = new ObjectMapper();
	public void saveAtteUser(Long userId, Long atteId) {
		// TODO Auto-generated method stub
		String url  = "http:/manage.qs.com/saveAtteUser/"+"/"+userId+"/"+atteId;
		try {
			httpService.doGet(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public List<AtteUser> findAtteUser(Long userId) {
		String url = "http:/manage.qs.com/findAtteUser/"+userId;
		try {
			String jsonData = httpService.doGet(url);
			JsonNode jsNode = MAPPER.readTree(jsonData).get("data");
			Object obj = null;
			if(jsNode.isArray()&jsNode.size()>0){
				obj = MAPPER.readValue(jsNode.traverse(),
	                    MAPPER.getTypeFactory().constructCollectionType(List.class, UserLabel.class));
			}
			return (List<AtteUser>) obj;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

}
