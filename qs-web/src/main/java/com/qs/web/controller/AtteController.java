package com.qs.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qs.web.pojo.AtteUser;
import com.qs.web.service.AtteService;

@Controller
public class AtteController {
	@Autowired
	private	AtteService atteService;
	@RequestMapping("/saveAtte")
	public void atteUser(Long userId,Long atteId){
		
		atteService.saveAtteUser(userId,atteId);
		
	}
	@RequestMapping("/findAtte")
	public String findAtte(Long userId,Model model){
		List<AtteUser> atteUsers = atteService.findAtteUser(userId);
		model.addAttribute("atteUsers",atteUsers);
		
		return "";
		
	}
}
