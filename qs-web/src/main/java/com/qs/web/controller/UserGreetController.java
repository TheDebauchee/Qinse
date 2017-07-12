package com.qs.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qs.web.service.UserService;

/*@Controller
public class UserGreetController {
	@Autowired
	private UserService userService;
	@RequestMapping("")
	public void sayHi(Long myId,Long userId){
		userService.sayHi(myId,userId);
	}
	@RequestMapping("")
	public String getMessage(Long myId,Model model){
		String nickName=userService.getMessage(myId);
		model.addAttribute("nickName",nickName);
		String hi="你好，很高兴认识你。 看了你的资料和照片很想跟你做个朋友";
		model.addAttribute("hi",hi);
		return "index";
	}
}*/
