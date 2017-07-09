package com.qs.web.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class userService {

	public static List<String> getAtteLabelId(String userId) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		return list;
	}

	public static Map<String, Double> getAtteLabel(String id) {
		if(id=="1"){
			Map<String,Double> courtlable3 = new HashMap<String,Double>();
			courtlable3.put("小鸟依人", 3.0);
			courtlable3.put("漂亮", 4.0);
			courtlable3.put("体贴细心", 4.0);
			courtlable3.put("性感", 2.0);
			courtlable3.put("善良", 4.0);
			return courtlable3;
		}else if(id=="2"){
			Map<String,Double> courtlable4 = new HashMap<String,Double>();
			courtlable4.put("小鸟依人", 3.0);
			courtlable4.put("漂亮", 2.0);
			courtlable4.put("体贴细心", 2.0);
			courtlable4.put("性感", 2.0);
			courtlable4.put("善良", 2.0);
			return courtlable4;
		}else{
			Map<String,Double> courtlable5 = new HashMap<String,Double>();
			courtlable5.put("小鸟依人", 3.0);
			courtlable5.put("漂亮", 2.0);
			courtlable5.put("体贴细心", 2.0);
			courtlable5.put("性感", 2.0);
			courtlable5.put("聪慧", 2.0);
			return courtlable5;
		}
		
	}

	public static Map<String, Double> findCourtLabel(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public static User findUserById(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
