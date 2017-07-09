package com.qs.web.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import com.qs.web.pojo.Sim;
import com.qs.web.pojo.UserLabel;

public class CupidUtil {
	public Double contest(Map<String,Double> userLabel ,Map<String,Double> simerLabel){
		//TODO 未来写两个map一个是标杆一个是参数
		Double e1 = 0.0;
		for(Entry<String,Double> e : userLabel.entrySet()){
			String i = e.getKey();
			if(simerLabel.get(i)!=null){
				Double value = simerLabel.get(i);
				Double mm =  value - e.getValue();
				Double mi = Math.pow(mm, 2);
				e1=e1+mi;
			}else{
				Double mi = Math.pow(userLabel.get(i), 2);
				e1=e1+mi;
			}
		}
		Double mmm = (5/(5+Math.sqrt(e1)))/2+0.5;
		return mmm;
	}
	/**
	 * 遍历所有符合条件的人，匹配相似度进行推荐
	 * @param simer 符合条件的用户队列
	 * @param userLabel 某人的求偶标签
	 */
	
	public List<Sim> recomBySim(List<UserLabel> simer,Map<String,Double> courtLabel){
		//新建Sim集合存每个匹配的人与某人的相似度
		List<Sim> sims  = new ArrayList<Sim>();
		//遍历匹配队列的用户
		for(UserLabel user : simer){
			//获得匹配队列里用户的标签
			Map<String, Double> simerLabel = user.getLable();
			//求与某人的求偶标签的相似度
			Double labelSim = contest(courtLabel, simerLabel);
			//将结果封装进Sim对象
			Sim sim = new Sim(user.getId(),labelSim);
			sims.add(sim);
		}
		//降序排列 
		Collections.sort(sims);
		//取出前十个
		if(sims.size()>=10){
			List<Sim> newSims = sims.subList(0, 9);
			return newSims;
		}
		return sims;
	
	}
	
}
