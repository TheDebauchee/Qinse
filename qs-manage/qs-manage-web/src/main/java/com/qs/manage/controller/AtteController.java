package com.qs.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.qs.common.vo.SysResult;
import com.qs.manage.pojo.AtteUser;
import com.qs.manage.service.AtteService;

@Controller
public class AtteController {
	@Autowired
	private AtteService atteService;
	
	@RequestMapping("/atteUser/{userId}/{atteId}")
	private void atteUser(@PathVariable Long userId,@PathVariable Long atteId){
		atteService.saveAtteUser(userId,atteId);
	}
	
	@RequestMapping("/findAtteUser/{userId}")
	private SysResult findAtteUser(@PathVariable Long userId){
		List<AtteUser> atteUsers = atteService.findAtteUser(userId);
		return SysResult.oK(atteUsers);
	}
}
