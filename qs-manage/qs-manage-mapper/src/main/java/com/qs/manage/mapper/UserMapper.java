package com.qs.manage.mapper;

import java.util.List;

import com.qs.common.mapper.SysMapper;
<<<<<<< HEAD

import qs.manage.pojo.SelectedMember;
import qs.manage.pojo.SelectedMemberInfo;
import qs.manage.pojo.User;
=======
import com.qs.manage.pojo.User;
>>>>>>> 26575bd8b0db3d0c39c94a0c81c22c85060bbd1e

public interface UserMapper extends SysMapper<User> {

	SelectedMemberInfo findWomanSelectedMember(SelectedMember user);
	
	void saveSelectedMember(SelectedMemberInfo user11);
	
	SelectedMemberInfo findManSelectedMember(SelectedMember user);
	
	List<SelectedMember> findSelectedMember();

	
}
