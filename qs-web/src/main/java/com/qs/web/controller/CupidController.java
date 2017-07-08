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
	public List<Sim> Cupid(String userId){
		//获取用户bai
		UserLabel user = userLabelService.findUserById(userId);
		//获取用户的求偶标签
		Map<String,Double> courtLabel = user.getCourtLabel();
		//获取详情对象
		UserInfo userInfo = userInfoService.findUserInfoById(userId);
		//根据ID查找用户求偶条件
		UserContion userSimCon = cupidService.findUserCondById(userId);
		//根据求偶条件筛选用户
		List<UserLabel> simers = cupidService.findUserByCond(userSimCon);
		//筛选跟自身相似的用户
		List<UserLabel> simers1 = cupidService.findSimUserByCond(userInfo);
		//调用工具类，进行匹配
		CupidUtil cup = new CupidUtil();
		List<Sim> sim1 = cup.recomBySim(simers, courtLabel);
		
		List<Sim> sim2 = cup.recomLabel(user, simers, simers1);
		//两个都不为空时，进行合并
		if(sim1!=null&sim2!=null){
			List<Sim> sims = new ArrayList<Sim>();
			sims.addAll(sim1);
			sims.addAll(sim2);
			Collections.sort(sims);
			//去重
			List<String> biaoji = new ArrayList();
			List<Sim> newSims = new ArrayList<Sim>();
			for(Sim sim : sims){
				String fla = sim.getSimId();
				if(!biaoji.contains(biaoji)){
					biaoji.add(fla);
					newSims.add(sim);
				}
			}
			return newSims;
			
		}
		
		return null;
	}
}
