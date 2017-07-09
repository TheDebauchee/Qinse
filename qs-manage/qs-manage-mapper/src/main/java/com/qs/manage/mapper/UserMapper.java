package com.qs.manage.mapper;

import java.util.List;

import com.qs.common.mapper.SysMapper;
import com.qs.manage.pojo.User;

<<<<<<< HEAD
=======
import qs.manage.pojo.SelectedMember;
import qs.manage.pojo.SelectedMemberInfo;
import com.qs.manage.pojo.User;
>>>>>>> ab2aa842685dcfe090376ff8bff19a6bd8e6da98

public interface UserMapper extends SysMapper<User> {

	SelectedMemberInfo findWomanSelectedMember(SelectedMember user);
	
	void saveSelectedMember(SelectedMemberInfo user11);
	
	SelectedMemberInfo findManSelectedMember(SelectedMember user);
	
	List<SelectedMember> findSelectedMember();

	
}
