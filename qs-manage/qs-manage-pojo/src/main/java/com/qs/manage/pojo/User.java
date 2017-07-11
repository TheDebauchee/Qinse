package com.qs.manage.pojo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.qs.common.po.BasePojo;

@Table(name="user")
public class User extends BasePojo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
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
	public Spouse getSpouse() {
		return spouse;
	}
	public void setSpouse(Spouse spouse) {
		this.spouse = spouse;
	}
	public UserDetail getDetail() {
		return detail;
	}
	public void setDetail(UserDetail detail) {
		this.detail = detail;
	}
	public UserLike getUserLike() {
		return userLike;
	}
	public void setUserLike(UserLike userLike) {
		this.userLike = userLike;
	}
	public UserPhoto getUserphoto() {
		return userphoto;
	}
	public void setUserphoto(UserPhoto userphoto) {
		this.userphoto = userphoto;
	}
	public UserStatus getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(UserStatus userStatus) {
		this.userStatus = userStatus;
	}
	public UserValues getUserValues() {
		return userValues;
	}
	public void setUserValues(UserValues userValues) {
		this.userValues = userValues;
	}
	
	
	
}
