package com.qs.manage.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qs.common.service.BaseService;
import com.qs.manage.mapper.UserMapper;

import qs.manage.pojo.SelectedMember;
import qs.manage.pojo.SelectedMemberInfo;
import com.qs.manage.pojo.User;

@Service
public class UserService extends BaseService<User>{
	@Autowired
	private UserMapper userMapper;

	public void saveSelectedMember() throws IOException {
		SelectedMember user1=new SelectedMember();
		SelectedMember user2=new SelectedMember();
		SelectedMember user3=new SelectedMember();
		SelectedMember user4=new SelectedMember();
		SelectedMember user5=new SelectedMember();
		SelectedMember user6=new SelectedMember();
		SelectedMember user7=new SelectedMember();
		SelectedMember user8=new SelectedMember();
		SelectedMember woman=KMeansNew.run(4,"d://woman.txt");
		SelectedMember man=KMeansNew.run(4,"d://man.txt");
		System.out.println(woman);
		System.out.println(man);
		List<ArrayList<Double>> womanList=woman.getCenters();
		List<ArrayList<Double>> manList=man.getCenters();
		user1.setMinAge(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(0).get(0))));
		user1.setMaxAge(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(0).get(1))));
		user1.setMinSalary(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(0).get(2))));
		user1.setMaxSalary(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(0).get(3))));
		user1.setMinHeight(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(0).get(4))));
		user1.setMaxHeight(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(0).get(5))));
		user2.setMinAge(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(1).get(0))));
		user2.setMaxAge(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(1).get(1))));
		user2.setMinSalary(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(1).get(2))));
		user2.setMaxSalary(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(1).get(3))));
		user2.setMinHeight(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(1).get(4))));
		user2.setMaxHeight(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(1).get(5))));
		user3.setMinAge(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(2).get(0))));
		user3.setMaxAge(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(2).get(1))));
		user3.setMinSalary(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(2).get(2))));
		user3.setMaxSalary(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(2).get(3))));
		user3.setMinHeight(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(2).get(4))));
		user3.setMaxHeight(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(2).get(5))));
		user4.setMinAge(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(3).get(0))));
		user4.setMaxAge(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(3).get(1))));
		user4.setMinSalary(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(3).get(2))));
		user4.setMaxSalary(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(3).get(3))));
		user4.setMinHeight(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(3).get(4))));
		user4.setMaxHeight(Integer.parseInt(new java.text.DecimalFormat("0").format(womanList.get(3).get(5))));
		SelectedMemberInfo user11=userMapper.findWomanSelectedMember(user1);
		userMapper.saveSelectedMember(user11);
		SelectedMemberInfo user22=userMapper.findWomanSelectedMember(user2);
		userMapper.saveSelectedMember(user22);
		SelectedMemberInfo user33=userMapper.findWomanSelectedMember(user3);
		userMapper.saveSelectedMember(user33);
		SelectedMemberInfo user44=userMapper.findWomanSelectedMember(user4);
		userMapper.saveSelectedMember(user44);
		user5.setMinAge(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(0).get(0))));
		user5.setMaxAge(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(0).get(1))));
		user5.setMinSalary(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(0).get(2))));
		user5.setMaxSalary(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(0).get(3))));
		user5.setMinHeight(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(0).get(4))));
		user5.setMaxHeight(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(0).get(5))));
		user6.setMinAge(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(1).get(0))));
		user6.setMaxAge(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(1).get(1))));
		user6.setMinSalary(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(1).get(2))));
		user6.setMaxSalary(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(1).get(3))));
		user6.setMinHeight(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(1).get(4))));
		user6.setMaxHeight(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(1).get(5))));
		user7.setMinAge(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(2).get(0))));
		user7.setMaxAge(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(2).get(1))));
		user7.setMinSalary(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(2).get(2))));
		user7.setMaxSalary(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(2).get(3))));
		user7.setMinHeight(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(2).get(4))));
		user7.setMaxHeight(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(2).get(5))));
		user8.setMinAge(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(3).get(0))));
		user8.setMaxAge(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(3).get(1))));
		user8.setMinSalary(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(3).get(2))));
		user8.setMaxSalary(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(3).get(3))));
		user8.setMinHeight(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(3).get(4))));
		user8.setMaxHeight(Integer.parseInt(new java.text.DecimalFormat("0").format(manList.get(3).get(5))));
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
}
