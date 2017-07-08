package com.qs.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qs.web.pojo.User;
import com.qs.web.service.RecommendService;

@Controller
public class RecommendController {

	@Autowired
	private RecommendService recommendService;
	@RequestMapping("/recommend")
	public String recommend(Model model){
		List<User> users = recommendService.findSelectedMember();
		model.addAttribute("users",users);
		return "index";
	}
}
