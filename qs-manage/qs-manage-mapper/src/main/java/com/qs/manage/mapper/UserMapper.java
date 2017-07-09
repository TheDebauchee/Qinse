package com.qs.manage.mapper;

import java.util.List;

import com.qs.common.mapper.SysMapper;

import qs.manage.pojo.SelectedMember;
import qs.manage.pojo.SelectedMemberInfo;
import com.qs.manage.pojo.User;

public interface UserMapper extends SysMapper<User> {

	SelectedMemberInfo findWomanSelectedMember(SelectedMember user);
	
	void saveSelectedMember(SelectedMemberInfo user11);
	
	SelectedMemberInfo findManSelectedMember(SelectedMember user);
	
	List<SelectedMember> findSelectedMember();

	
}
