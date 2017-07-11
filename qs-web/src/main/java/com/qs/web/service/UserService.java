package com.qs.web.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qs.common.service.HttpClientService;
import com.qs.web.pojo.Spouse;
import com.qs.web.pojo.User;
import com.qs.web.pojo.UserDetail;
import com.qs.web.pojo.UserInfo;
import com.qs.web.pojo.UserLike;
import com.qs.web.pojo.UserPhoto;
import com.qs.web.pojo.UserStatus;
import com.qs.web.pojo.Uservalues;
@Service
public class UserService {
	@Autowired
	private HttpClientService httpClientService;
	private static final ObjectMapper MAPPER = new ObjectMapper();
	
	public String saveRegister(User user){
		String username = null;
		String url = "http://sso.qs.com/user/register";
		Map<String,String> params = new HashMap<String,String>();
		Long userId = user.getUserId();
		params.put("username", user.getUsername());
		params.put("password", user.getPassword());
		params.put("phone", user.getPhone());
		UserInfo info = new UserInfo();
		info.setUserId(userId);
		params.put("gender", info.getGender());
		params.put("age", info.getAge()+"");
		params.put("maritalStatus", info.getMaritalStatus());
		params.put("workplace", info.getWorkplace());
		params.put("height", info.getHeight()+"");
		params.put("education", info.getEducation());
		params.put("salary", info.getSalary()+"");
		params.put("hashouse", info.getHashouse());
		params.put("haskid", info.getHaskid());
		Spouse spouse = new Spouse();
		spouse.setUserId(userId);
		params.put("sGender", spouse.getsGender());
		params.put("sMinAge", spouse.getsMinAge());
		params.put("sMaxAge", spouse.getsMaxAge());
		params.put("sMaritalStatus", spouse.getsMaritalStatus());
		params.put("sWorkplace", spouse.getsWorkplace());
		params.put("sHomeLoc", spouse.getsHomeLoc());
		params.put("sEducation", spouse.getsEducation());
		params.put("sMinHeight", spouse.getsMinHeight());
		params.put("sMaxHeight", spouse.getsMaxHeight());
		params.put("sMinSalary", spouse.getsMinSalary());
		params.put("sHaschild", spouse.getsHaschild());
		params.put("sHashouse", spouse.getsHashouse());
		params.put("sDrink", spouse.getsDrink());
		params.put("sSmoke", spouse.getsSmoke());
		
		UserDetail detail = new UserDetail();
		detail.setUserId(userId);
		params.put("homeLoc", detail.getHomeLoc());
		params.put("weight", detail.getWeight());
		params.put("shape", detail.getShape());
		params.put("zodiac", detail.getZodiac());
		params.put("sign", detail.getSign());
		params.put("race", detail.getRace());
		params.put("religion", detail.getReligion());
		params.put("gradFrom", detail.getGradFrom());
		params.put("major", detail.getMajor());
		params.put("selfDesc", detail.getSelfDesc());

		
		UserLike userLike = new UserLike();
		userLike.setUserId(userId);
		params.put("like", userLike.getLike());
		
		UserPhoto userphoto	= new  UserPhoto();
		userphoto.setUserId(userId);
		params.put("pic1", userphoto.getPic1());
		params.put("pic2", userphoto.getPic2());
		params.put("pic3", userphoto.getPic3());
		
		UserStatus userStatus = new UserStatus();
		userStatus.setUserId(userId);
		params.put("occupation", userStatus.getOccupation());
		params.put("firm", userStatus.getFirm());
		params.put("smoke", userStatus.getSmoke());
		params.put("drink", userStatus.getDrink());
		params.put("hascar", userStatus.getHascar());
		params.put("cooking", userStatus.getCooking());
		params.put("housework", userStatus.getHousework());
		
		Uservalues userValues = new Uservalues();
		userValues.setUserId(userId);
		params.put("maritalStatus", userValues.getMaritalStatus());
		params.put("whenToMarry", userValues.getWhenToMarry());
		params.put("wantKid", userValues.getWantKid());
		params.put("wantParent", userValues.getWantParent());
		params.put("wantSeperation", userValues.getWantSeperation());
		params.put("desiredDate", userValues.getDesiredDate());
		
		
		try {
			String jsonData = httpClientService.doPost(url, params);
			username = MAPPER.readTree(jsonData).get("data").asText();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return username;
	}
	
	//登录
	public String saveLogin(String phone, String password) {
		String ticket = null;
		String url = "http://sso.qs.com/user/login";
		Map<String,String> params = new HashMap<String,String>();
		params.put("u", phone);
		params.put("p", password);
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
	

	
	
}
