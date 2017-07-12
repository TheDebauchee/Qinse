package com.qs.manage.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="user_info")
public class UserInfo {
	@Id
	@Column(name="id")
	private Long userId;
	private String gender;
	private String age;
	private String relname;
	private String nickname;
	private String maritalStatus;
	private String workplace;
	private String height;
	private String education;
	private String salary;
	private String hashouse;
	private String haskid;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getRelname() {
		return relname;
	}
	public void setRelname(String relname) {
		this.relname = relname;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getWorkplace() {
		return workplace;
	}
	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}
	
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getHashouse() {
		return hashouse;
	}
	public void setHashouse(String hashouse) {
		this.hashouse = hashouse;
	}
	public String getHaskid() {
		return haskid;
	}
	public void setHaskid(String haskid) {
		this.haskid = haskid;
	}
	
}
