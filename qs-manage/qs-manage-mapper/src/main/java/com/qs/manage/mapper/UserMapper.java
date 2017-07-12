package com.qs.manage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.qs.common.mapper.SysMapper;
import com.qs.manage.pojo.User;

import qs.manage.pojo.SelectedMember;
import qs.manage.pojo.SelectedMemberInfo;
import qs.manage.pojo.UserGreet;

import com.qs.manage.pojo.User;

public interface UserMapper extends SysMapper<User> {

	SelectedMemberInfo findWomanSelectedMember(SelectedMember user);
	
	void saveSelectedMember(SelectedMemberInfo user11);
	
	SelectedMemberInfo findManSelectedMember(SelectedMember user);
	
	List<SelectedMember> findSelectedMember();
	@Select("select count(*) from user where phone=#{phone}")
	Integer queryByPhone(String phone);

	void sayHi(UserGreet ug);

	Long getUserId(Long myId);

	String getNickName(Long userId);

	
}
