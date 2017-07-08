package com.qs.sso.pojo;

import com.qs.common.po.BasePojo;

public class User extends BasePojo{
	private Long userId;
	private String username;
	private String password;
	private String phone;
	private UserInfo info;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
