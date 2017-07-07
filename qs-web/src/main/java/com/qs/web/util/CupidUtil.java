package com.qs.web.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

import com.qs.web.pojo.Sim;

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
		Double mmm = 5/(5+Math.sqrt(e1));
		return mmm;
	}
	/**
	 * 遍历所有符合条件的人，匹配相似度进行推荐
	 * @param simer 符合条件的用户队列
	 * @param userLabel 某人的求偶标签
	 */
	
	public List<Sim> recomBySim(List<User> simer,Map<String,Double> courtLabel){
		//新建Sim集合存每个匹配的人与某人的相似度
		List<Sim> sims  = new ArrayList<Sim>();
		//遍历匹配队列的用户
		for(User user : simer){
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
	/**
	 * 根据与某人标签匹配，的人的关注的人的标签，匹配某人的择偶标签，选出匹配度最高的四个标签添加到原有的
	 * 择偶标签上，重新匹配获取前五个
	 * @param user 某人
	 * @param simer 跟某人匹配的男性
	 * @param simer1 符合推荐条件的人群
	 */
	public List<Sim> recomLabel(User user,List<User> simers,List<User> simers1){
		//获得用户属性标签
		Map<String,Double> userLabel = user.getLable();
		//此处label为用户的求偶标签
		Map<String,Double> courtLabel = user.getCourtLabel();
		
		List<User> simUsers = new ArrayList<User>();
		
		for(User u :simers){
			//计算相似度，与某人的匹配度要大于50
			Double cons = contest(userLabel, u.getLable());
			if(cons>=0.5){
				simUsers.add(u);
			}
			
		}
		List<Sim> atteSims = new ArrayList<Sim>();
		//遍历相似的人
		for(int i=0;i<simUsers.size();i++){
			Double cons = contest(userLabel,simUsers.get(i).getLable());
			List<String> atteId = userService.getAtteLabelId(simUsers.get(i).getId());
			for(int j=0;j<atteId.size();j++){
				//获得关注的人的属性标签
				String id = atteId.get(j);
				Map<String,Double> atteLabel = userService.getAtteLabel(id);
				//获得跟某人相似的人的关注，并求出相似的人与某人的相似度。在查看是否有一个标签是相似的人喜欢而
				//某人没有添加的，用标签权值与相似度相乘，得出一个值并添加进集合最后对集合进行排序，拿到最大的那个
				//与某人的标签合并匹配出新的推荐条件，遍历出最大相似度的人进行推荐。
				//相似度
				
				for(Entry<String, Double> e: atteLabel.entrySet()){
					if(!courtLabel.containsKey(e.getKey())){
						Sim sim = new Sim(e.getKey(),cons*e.getValue());
						atteSims.add(sim);
					}
				}
			}
		}
		
		Collections.sort(atteSims);
		if(atteSims.size()>=5){
			List<Sim> newAtteSims = atteSims.subList(0, 4);
			courtLabel.put(newAtteSims.get(0).getSimId(), newAtteSims.get(0).getSimm());
			courtLabel.put(newAtteSims.get(1).getSimId(), newAtteSims.get(1).getSimm());
			courtLabel.put(newAtteSims.get(2).getSimId(), newAtteSims.get(2).getSimm());
			courtLabel.put(newAtteSims.get(3).getSimId(), newAtteSims.get(3).getSimm());
			courtLabel.put(newAtteSims.get(4).getSimId(), newAtteSims.get(4).getSimm());
		}else{
			for(int i=0;i<atteSims.size();i++){
				courtLabel.put(atteSims.get(i).getSimId(), atteSims.get(i).getSimm());
			}
		}
		//遍历待匹配人群重新生成相似度，推荐人数
		List<Sim> recomSim = recomBySim(simers1, courtLabel);
		if(recomSim.size()>=4){
			return recomSim.subList(0, 4);
		}
		return recomSim;
	}
	/**
	 * 向用户推荐对象：封装两种推荐方式
	 * 
	 * @param simer 待匹配人群
	 * @param user	某人
	 */
	public List<Sim> recomUser(List<User> simer,User user){
		Map<String,Double> userLabel =user.getLable(); 
		List<Sim> simer1 = recomBySim(simer, userLabel);
		List<Sim> simer2 = recomLabel(user, simer,simer);
		List<Sim> simers = new ArrayList();
		simers.addAll(simer1);
		simers.addAll(simer2);
		Collections.sort(simers);
		return simers;
	}
	@Test
	public void run(){
		User user1 = new User();
		user1.setId("12345");
		Map<String,Double> courtlable = new HashMap<String,Double>();
		courtlable.put("小鸟依人", 4.0);
		courtlable.put("漂亮", 4.0);
		courtlable.put("体贴细心", 4.0);
		courtlable.put("性感", 4.0);
		courtlable.put("善良", 4.0);
		Map<String,Double> lable = new HashMap<String,Double>();
		lable.put("身材魁梧", 4.0);
		lable.put("有责任心", 4.0);
		lable.put("有房有车", 4.0);
		lable.put("幽默搞笑", 4.0);
		lable.put("IT精英", 4.0);
		user1.setLable(lable);
		user1.setCourtLabel(courtlable);
		user1.setName("李小白");
		
		User user2= new User();
		user2.setId("12346");
		Map<String,Double> courtlable1 = new HashMap<String,Double>();
		courtlable1.put("小鸟依人", 4.0);
		courtlable1.put("漂亮", 3.0);
		courtlable1.put("体贴细心", 4.0);
		courtlable1.put("性感", 4.0);
		courtlable1.put("聪慧", 4.0);
		Map<String,Double> lable1 = new HashMap<String,Double>();
		lable1.put("身材魁梧", 4.0);
		lable1.put("有责任心", 4.0);
		lable1.put("有房有车", 4.0);
		lable1.put("幽默搞笑", 4.0);
		lable1.put("IT精英", 3.0);
		user2.setLable(lable1);
		user2.setCourtLabel(courtlable);
		user2.setName("李大白");
		
		User user3 = new User();
		user3.setId("12347");
		Map<String,Double> courtlable2 = new HashMap<String,Double>();
		courtlable2.put("小鸟依人", 4.0);
		courtlable2.put("漂亮", 4.0);
		courtlable2.put("体贴细心", 4.0);
		courtlable2.put("性感", 4.0);
		courtlable2.put("善良", 4.0);
		user3.setLable(courtlable2);
		user3.setName("花花");
		
		User user4 = new User();
		user4.setId("12348");
		Map<String,Double> courtlable3 = new HashMap<String,Double>();
		courtlable3.put("小鸟依人", 3.0);
		courtlable3.put("漂亮", 4.0);
		courtlable3.put("体贴细心", 4.0);
		courtlable3.put("性感", 2.0);
		courtlable3.put("善良", 4.0);
		user4.setLable(courtlable3);
		user4.setName("小花");
		
		User user5 = new User();
		user5.setId("12350");
		Map<String,Double> courtlable4 = new HashMap<String,Double>();
		courtlable4.put("小鸟依人", 3.0);
		courtlable4.put("漂亮", 2.0);
		courtlable4.put("体贴细心", 2.0);
		courtlable4.put("性感", 2.0);
		courtlable4.put("善良", 2.0);
		user5.setLable(courtlable4);
		user5.setName("大花");
		
		User user6= new User();
		user6.setId("12349");
		Map<String,Double> courtlable5 = new HashMap<String,Double>();
		courtlable5.put("小鸟依人", 3.0);
		courtlable5.put("漂亮", 2.0);
		courtlable5.put("体贴细心", 2.0);
		courtlable5.put("性感", 2.0);
		courtlable5.put("聪慧", 2.0);
		user6.setLable(courtlable5);
		user6.setName("大喵");
		
		List<User> simers = new ArrayList<User>();
		simers.add(user2);
		List<User> simers1 = new ArrayList<User>();
		simers1.add(user3);
		simers1.add(user4);
		simers1.add(user5);
		simers1.add(user6);
		
		List<Sim> recomLabel = recomLabel(user1, simers, simers1);
		for(int i=0;i<recomLabel.size();i++){
			System.out.println(recomLabel.get(i));
		}
		/*List<Sim> recomBySim = recomBySim(simers, courtlable);
		
		for(int i=0;i<recomBySim.size();i++){
			System.out.println(recomBySim.get(i));
		}*/
		
		
	}
	
}
