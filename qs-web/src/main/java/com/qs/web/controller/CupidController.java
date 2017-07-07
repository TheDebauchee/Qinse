package com.qs.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qs.web.pojo.User;
import com.qs.web.service.CupidService;

@Controller
public class CupidController {
	
	private CupidService cupidService;
	@RequestMapping("/cubid")
	public void Cupid(String userId){
		//根据ID查找用户求偶条件
		User user = cupidService.findUserCondById(userId);
		//根据求偶条件筛选用户
		
	}
}
