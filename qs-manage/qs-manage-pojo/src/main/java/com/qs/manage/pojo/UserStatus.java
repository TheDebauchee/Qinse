package com.qs.manage.pojo;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="user_status")
public class UserStatus {
	@Id
	private Long id;
	private String occupation;
	private String firm;
	private String smoke;
	private String drink;
	private String hascar;
	private String cooking;
	private String housework;
	private String recentPurches;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getRecentPurches() {
		return recentPurches;
	}
	public void setRecentPurches(String recentPurches) {
		this.recentPurches = recentPurches;
	}
	
	
}
