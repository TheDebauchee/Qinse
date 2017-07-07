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
		User user = cupidService.findUserById(userId);
		
		
	}
}
