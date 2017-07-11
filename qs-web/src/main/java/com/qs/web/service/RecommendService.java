package com.qs.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qs.common.service.HttpClientService;
import com.qs.web.pojo.SelectedMember;
import com.qs.web.pojo.User;

@Service
public class RecommendService {

	@Autowired
	private HttpClientService httpClientService;
	private static final ObjectMapper MAPPER = new ObjectMapper();
	public List<SelectedMember> findSelectedMember(){
		try {
			String url = "http://manage.qs.com/web/findSelectedMember";
			String jsonData = httpClientService.doGet(url);
			JsonNode jsNode = MAPPER.readTree(jsonData).get("data");
			Object obj = null;
	        if (jsNode.isArray() && jsNode.size() > 0) {
	            obj = MAPPER.readValue(jsNode.traverse(),
	                    MAPPER.getTypeFactory().constructCollectionType(List.class, User.class));
	        }
	        return (List<SelectedMember>) obj;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
		
	}
}
