package com.qs.manage.pojo;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="user_status")
public class UserStatus {
	@Id
	private Long userId;
	private String occupation;	//用户的职业
	private String firm;	//用户的公司
	private String smoke;	//是否抽烟
	private String drink;	//是否喝酒
	private String hascar;	//是否有车
	private String cooking;	//是否会做饭
	private String housework;	//家务
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getFirm() {
		return firm;
	}
	public void setFirm(String firm) {
		this.firm = firm;
	}
	public String getSmoke() {
		return smoke;
	}
	public void setSmoke(String smoke) {
		this.smoke = smoke;
	}
	public String getDrink() {
		return drink;
	}
	public void setDrink(String drink) {
		this.drink = drink;
	}
	public String getHascar() {
		return hascar;
	}
	public void setHascar(String hascar) {
		this.hascar = hascar;
	}
	public String getCooking() {
		return cooking;
	}
	public void setCooking(String cooking) {
		this.cooking = cooking;
	}
	public String getHousework() {
		return housework;
	}
	public void setHousework(String housework) {
		this.housework = housework;
	}
	
}
