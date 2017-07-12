package com.qs.web.controller;


import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.qs.web.util.PostServer;

@Controller
public class NiShangController {
	@RequestMapping(value="/service/NiShang",produces = "application/json; charset=utf-8")
	@ResponseBody
	public String NiShangQA(String word){
		//封装请求参数
		
		JSONObject json = new JSONObject();
		json.put("key", "d574fe329f344b8e8f8c6d53547f4471");
		json.put("info", word);
		//json.put("loc", "中国北京市大兴区");
		//请求图灵api
		String result = PostServer.SendPost(json.toString(), "http://www.tuling123.com/openapi/api");
		
		
		return result;
	}
}
