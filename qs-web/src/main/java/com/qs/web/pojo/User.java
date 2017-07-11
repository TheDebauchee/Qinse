package com.qs.web.pojo;

import com.qs.common.po.BasePojo;

public class User extends BasePojo{
	private Long userId;
	private String password;
	private String phone;
	private UserInfo info;	//基本信息
	private Spouse spouse;	//择偶意向
	private UserDetail detail;	//用户详细信息
	private UserLike userLike;	//用户的爱好
	private UserPhoto userphoto;	//用户的图片
	private UserStatus userStatus;	//用户的状态
	private UserValues userValues;	//用户的价值观婚姻观
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public UserInfo getInfo() {
		return info;
	}
	public void setInfo(UserInfo info) {
		this.info = info;
	}
	
	
}
