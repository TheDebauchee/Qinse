package com.qs.web.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qs.common.service.HttpClientService;
import com.qs.web.pojo.BigUser;
import com.qs.web.pojo.UserInfo;
@Service
public class UserService {
	@Autowired
	private HttpClientService httpClientService;
	private static final ObjectMapper MAPPER = new ObjectMapper();
	
	public String saveRegister(BigUser bigUser){
		String phone = null;
		String url = "http://manage.qs.com/user/register";
		Map<String,String> params = new HashMap<String,String>();
//		Long userId = bigUser.getUserId();
		params.put("phone", bigUser.getPhone());
		params.put("password", bigUser.getPassword());
		params.put("gender", bigUser.getGender());
		params.put("age", bigUser.getAge()+"");
		params.put("relname", bigUser.getRelname());
		params.put("nickname", bigUser.getNickname());
		params.put("maritalStatus", bigUser.getMaritalStatus());
		params.put("workplace", bigUser.getWorkplace());
		params.put("height", bigUser.getHeight()+"");
		params.put("education", bigUser.getEducation());
		params.put("salary", bigUser.getSalary()+"");
		params.put("hashouse", bigUser.getHashouse());
		params.put("haskid", bigUser.getHaskid());
		params.put("sGender", bigUser.getsGender());
		params.put("sMinAge", bigUser.getsMinAge());
		params.put("sMaxAge", bigUser.getsMaxAge());
		params.put("sMaritalStatus", bigUser.getsMaritalStatus());
		params.put("sWorkplace", bigUser.getsWorkplace());
		params.put("sHomeLoc", bigUser.getsHomeLoc());
		params.put("sEducation", bigUser.getsEducation());
		params.put("sMinHeight", bigUser.getsMinHeight());
		params.put("sMaxHeight", bigUser.getsMaxHeight());
		params.put("sMinSalary", bigUser.getsMinSalary());
		params.put("sHaschild", bigUser.getsHaschild());
		params.put("sHashouse", bigUser.getsHashouse());
		params.put("sDrink", bigUser.getsDrink());
		params.put("sSmoke", bigUser.getsSmoke());
		
		
		params.put("homeLoc", bigUser.getHomeLoc());
		params.put("weight", bigUser.getWeight());
		params.put("shape", bigUser.getShape());
		params.put("zodiac", bigUser.getZodiac());
		params.put("sign", bigUser.getSign());
		params.put("race", bigUser.getRace());
		params.put("religion", bigUser.getReligion());
		params.put("gradFrom", bigUser.getGradFrom());
		params.put("major", bigUser.getMajor());
		params.put("selfDesc", bigUser.getSelfDesc());

		
		params.put("like", bigUser.getHobbies());
		
		params.put("pic1", bigUser.getPic1());
		params.put("pic2", bigUser.getPic2());
		params.put("pic3", bigUser.getPic3());
		
		params.put("occupation", bigUser.getOccupation());
		params.put("firm", bigUser.getFirm());
		params.put("smoke", bigUser.getSmoke());
		params.put("drink", bigUser.getDrink());
		params.put("hascar", bigUser.getHascar());
		params.put("cooking", bigUser.getCooking());
		params.put("housework", bigUser.getHousework());
		
		params.put("whenToMarry", bigUser.getWhenToMarry());
		params.put("wantKid", bigUser.getWantKid());
		params.put("wantParent", bigUser.getWantParent());
		params.put("wantSeperation", bigUser.getWantSeperation());
		params.put("desiredDate", bigUser.getDesiredDate());
		
		
		try {
			String jsonData = httpClientService.doPost(url, params,"UTF-8");
			phone = MAPPER.readTree(jsonData).get("data").asText();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return phone;
	}
	
	//登录
	public String saveLogin(String phone, String password) {
		String ticket = null;
		String url = "http://manage.qs.com/user/login";
		Map<String,String> params = new HashMap<String,String>();
		params.put("phone", phone);
		params.put("password", password);
		try {
			String jsonData = httpClientService.doPost(url, params);
			ticket = MAPPER.readTree(jsonData).get("data").asText();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return ticket;
	}

	public void sayHi(Long myId, Long userId) {
		try {
			String url="http://manage.qs.com/web/sayHi/"+myId+"/"+userId;
			httpClientService.doGet(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getMessage(Long myId) {
		try {
			String url="http://manage.qs.com/web/getMessage/"+myId;
			String nickName=httpClientService.doGet(url);
			return nickName;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//更新user基本信息
	public void updateUserInfo(UserInfo info) {
		String url = "http://manage.qs.com/user/update";
		Map<String,String> params = new HashMap<String,String>();
		params.put("gender", info.getGender());
		params.put("relname", info.getRelname());
		params.put("nickname", info.getNickname());
		params.put("age", info.getAge()+"");
		params.put("maritalStatus", info.getMaritalStatus());
		params.put("workplace", info.getWorkplace());
		params.put("height", info.getHeight()+"");
		params.put("education", info.getEducation());
		params.put("salary", info.getSalary()+"");
		params.put("hashouse", info.getHashouse());
		params.put("haskid", info.getHaskid());
		try {
			httpClientService.doPost(url, params);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
}
