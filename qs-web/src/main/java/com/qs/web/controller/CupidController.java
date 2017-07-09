package com.qs.web.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qs.web.pojo.Sim;
import com.qs.web.pojo.Spouse;
import com.qs.web.pojo.UserContion;
import com.qs.web.pojo.UserInfo;
import com.qs.web.pojo.UserLabel;
import com.qs.web.service.CupidService;
import com.qs.web.service.UserInfoService;
import com.qs.web.service.UserLabelService;
import com.qs.web.util.*;

@Controller
public class CupidController {
	@Autowired
	private CupidService cupidService;
	@Autowired
	private UserLabelService userLabelService;
	@Autowired
	private UserInfoService userInfoService;
	@RequestMapping("/cubid")
	@ResponseBody
	public List<Sim> Cupid(Long userId){
		//获取用户bai
		UserLabel user = userLabelService.findUserById(userId);
		//获取用户的求偶标签
		Map<String,Double> courtLabel = user.getCourtLabel();
		//获取详情对象
		UserInfo userInfo = userInfoService.findUserInfoById(userId);
		//根据ID查找用户求偶条件
		Spouse userSpouse = cupidService.findUserCondById(userId);
		//根据求偶条件筛选用户
		List<UserLabel> simers = cupidService.findUserByCond(userSpouse);
		//调用工具类，进行匹配
		CupidUtil cup = new CupidUtil();
		List<Sim> sim = cup.recomBySim(simers, courtLabel);
		
		return sim;
	}
}
