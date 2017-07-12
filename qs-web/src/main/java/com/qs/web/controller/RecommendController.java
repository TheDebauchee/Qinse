package com.qs.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qs.web.pojo.SelectedMember;
import com.qs.web.pojo.SelectedMemberInfo;
import com.qs.web.service.RecommendService;

@Controller
public class RecommendController {

	@Autowired
	private RecommendService recommendService;
	@RequestMapping("/index")
	public String recommend(Model model){
		List<SelectedMemberInfo> users = recommendService.findSelectedMember();
		model.addAttribute("users",users);
		return "index";
	}
}
