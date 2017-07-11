package com.qs.manage.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qs.common.service.BaseService;
import com.qs.manage.mapper.UserMapper;
import com.qs.manage.pojo.BigUser;
import com.qs.manage.pojo.User;

import qs.manage.pojo.SelectedMember;
import qs.manage.pojo.SelectedMemberInfo;
import com.qs.manage.pojo.UserInfo;

import qs.manage.pojo.SelectedMember;
import qs.manage.pojo.SelectedMemberInfo;
import qs.manage.pojo.UserGreet;

@Service
public class UserService extends BaseService<User>{
	@Autowired
	private UserMapper userMapper;
	//查询手机号是否重复
	public Boolean queryByPhone(String phone) {
		Integer i = userMapper.queryByPhone(phone);
		if(i==1){
			return true;
		}else{
			return false;
		}
	}

	//注册
	public Long saveRegister(BigUser bigUser) {
		User user = new User();
		user.setPhone(bigUser.getPhone());
		user.setPassword(DigestUtils.md5Hex(bigUser.getPassword()));
		userMapper.insertSelective(user);
		return user.getUserId();
	}
	
	//登录
	public String savelogin(String phone,String password){
		String ticket = "";
		User params = new User();
		params.setPhone(phone);
		User curUser = super.queryByWhere(params);
		if(null!=curUser){
			String newPwd = DigestUtils.md5Hex(password);
			if(newPwd.equals(curUser.getPassword())){
				ticket =DigestUtils.md5Hex(System.currentTimeMillis() + curUser.getPhone()+curUser.getUserId());
//					redisService.set(ticket, MAPPER.writeValueAsString(curUser),86400*7);	//jvm编译时就算出来了
			}
		}
		return ticket;
	}
		
//		redis以后向redis获取缓存信息
//		@RequestMapping("/query/{ticket}")
//		@ResponseBody
//		public SysResult queryByTicket(@PathVariable String ticket){
//			try {
//				String userJson = redisService.get(ticket);
//				return SysResult.oK(userJson); 
//			} catch (Exception e) {
//				return SysResult.build(201,"查询用户信息失败!"); 
//			}
//		}
		
	
	

	@Test
	public void saveSelectedMember() throws IOException {
		SelectedMember user1=new SelectedMember();
		SelectedMember user2=new SelectedMember();
		SelectedMember user3=new SelectedMember();
		SelectedMember user4=new SelectedMember();
		SelectedMember user5=new SelectedMember();
		SelectedMember user6=new SelectedMember();
		SelectedMember user7=new SelectedMember();
		SelectedMember user8=new SelectedMember();
		SelectedMember man=KMeansNew.run(4,"d://man.txt");
		SelectedMember woman=KMeansNew.run(4,"d://woman.txt");
		//System.out.println(woman);
		//System.out.println(man);
		List<ArrayList<Double>> womanList=woman.getCenters();
		List<ArrayList<Double>> manList=man.getCenters();
		user1.setMinAge(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(0).get(0))));
		user1.setMaxAge(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(0).get(1))));
		user1.setSalary(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(0).get(4))));
		user1.setMinHeight(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(0).get(2))));
		user1.setMaxHeight(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(0).get(3))));
		user2.setMinAge(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(1).get(0))));
		user2.setMaxAge(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(1).get(1))));
		user2.setSalary(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(1).get(4))));
		user2.setMinHeight(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(1).get(2))));
		user2.setMaxHeight(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(1).get(3))));
		user3.setMinAge(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(2).get(0))));
		user3.setMaxAge(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(2).get(1))));
		user3.setSalary(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(2).get(4))));
		user3.setMinHeight(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(2).get(2))));
		user3.setMaxHeight(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(2).get(3))));
		user4.setMinAge(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(3).get(0))));
		user4.setMaxAge(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(3).get(1))));
		user4.setSalary(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(3).get(4))));
		user4.setMinHeight(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(3).get(2))));
		user4.setMaxHeight(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(3).get(3))));
		System.out.println(user1);
		/*SelectedMemberInfo user11=userMapper.findWomanSelectedMember(user1);
		userMapper.saveSelectedMember(user11);
		SelectedMemberInfo user22=userMapper.findWomanSelectedMember(user2);
		userMapper.saveSelectedMember(user22);
		SelectedMemberInfo user33=userMapper.findWomanSelectedMember(user3);
		userMapper.saveSelectedMember(user33);
		SelectedMemberInfo user44=userMapper.findWomanSelectedMember(user4);
		userMapper.saveSelectedMember(user44);*/
		user5.setMinAge(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(4).get(0))));
		user5.setMaxAge(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(4).get(1))));
		user5.setSalary(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(4).get(4))));
		user5.setMinHeight(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(4).get(2))));
		user5.setMaxHeight(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(4).get(3))));
		user6.setMinAge(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(5).get(0))));
		user6.setMaxAge(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(5).get(1))));
		user6.setSalary(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(5).get(4))));
		user6.setMinHeight(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(5).get(2))));
		user6.setMaxHeight(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(5).get(3))));
		user7.setMinAge(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(6).get(0))));
		user7.setMaxAge(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(6).get(1))));
		user7.setSalary(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(6).get(4))));
		user7.setMinHeight(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(6).get(2))));
		user7.setMaxHeight(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(6).get(3))));
		user8.setMinAge(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(7).get(0))));
		user8.setMaxAge(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(7).get(1))));
		user8.setSalary(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(7).get(4))));
		user8.setMinHeight(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(7).get(2))));
		user8.setMaxHeight(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(7).get(3))));
		System.out.println(user5);
		SelectedMemberInfo user55=userMapper.findManSelectedMember(user5);
		userMapper.saveSelectedMember(user55);
		SelectedMemberInfo user66=userMapper.findManSelectedMember(user6);
		userMapper.saveSelectedMember(user66);
		SelectedMemberInfo user77=userMapper.findManSelectedMember(user7);
		userMapper.saveSelectedMember(user77);
		SelectedMemberInfo user88=userMapper.findManSelectedMember(user8);
		userMapper.saveSelectedMember(user88);
		
		
	}

	public List<SelectedMember> findSelectedMember() {
		return userMapper.findSelectedMember();
	}
	
	public void sayHi(Long myId, Long userId) {
		UserGreet ug=new UserGreet();
		String hi="你好，很高兴认识你。 看了你的资料和照片很想跟你做个朋友";
		ug.setMyId(myId);
		ug.setUserId(userId);
		ug.setHi(hi);
		userMapper.sayHi(ug);
	}

	public Long getUserId(Long myId) {
		return userMapper.getUserId(myId);
	}

	public String getNickName(Long userId) {
		return userMapper.getNickName(userId);
	}

	

	
}
