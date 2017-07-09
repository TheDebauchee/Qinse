package com.qs.web.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qs.web.pojo.Sim;
import com.qs.web.pojo.Spouse;
import com.qs.web.pojo.UserContion;
import com.qs.web.pojo.UserInfo;
import com.qs.web.service.CupidService;
import com.qs.web.service.userInfoService;
import com.qs.web.util.*;

@Controller
public class CupidController {
	
	private CupidService cupidService;
	@RequestMapping("/cubid")
	@ResponseBody
<<<<<<< HEAD
	public List<Sim> Cupid(Long userId){
		//获取用户bai
		UserLabel user = userLabelService.findUserById(userId);
=======
	public List<Sim> Cupid(String userId){
		//获取用户
		User user = userService.findUserById(userId);
>>>>>>> 06d5c4b908b91f7c710c3b324b4901ace4bf71d7
		//获取用户的求偶标签
		Map<String,Double> courtLabel = user.getCourtLabel();
		//获取详情对象
		UserInfo userInfo = userInfoService.findUserInfoById(userId);
		//根据ID查找用户求偶条件
		Spouse userSpouse = cupidService.findUserCondById(userId);
		//根据求偶条件筛选用户
<<<<<<< HEAD
		List<UserLabel> simers = cupidService.findUserByCond(userSpouse);
		//调用工具类，进行匹配
		CupidUtil cup = new CupidUtil();
		List<Sim> sim = cup.recomBySim(simers, courtLabel);
		
		return sim;
=======
		List<User> simers = cupidService.findUserByCond(userSimCon);
		//筛选跟自身相似的用户
		List<User> simers1 = cupidService.findSimUserByCond(userInfo);
		//调用工具类，进行匹配
		CupidUtil cup = new CupidUtil();
		List<Sim> sim1 = cup.recomBySim(simers, courtLabel);
		
		List<Sim> sim2 = cup.recomLabel(user, simers, simers1);
		
		if(sim1!=null&sim2!=null){
			List<Sim> sims = new ArrayList<Sim>();
			sims.addAll(sim1);
			sims.addAll(sim2);
			Collections.sort(sims);
			return sims;
		}
		return null;
>>>>>>> 06d5c4b908b91f7c710c3b324b4901ace4bf71d7
	}
}
