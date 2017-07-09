package com.qs.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qs.manage.pojo.UserLabel;
import com.qs.manage.service.UserLaelService;

@Controller
@RequestMapping("/userLabel")
public class UserLabelController {
	@Autowired
	private UserLaelService labelService;
	@RequestMapping("/findUserById/{id}")
	@ResponseBody
	public UserLabel findUserLabelById(@PathVariable Long id){
		
		UserLabel userLabel= labelService.findUserLabelById(id);
		
		return userLabel;
		
	}
}
