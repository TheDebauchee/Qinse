package com.qs.manage.pojo;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="user_detail")
public class UserDetail {
	@Id
	private Long id;
	private String homeLoc;
	private String weight;
	private String shape;
	private String zodiac;
	private String sign;
	private String race;
	private String religion;
	private String gradFrom;
	private String major;
	private String selfDesc;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHomeLoc() {
		return homeLoc;
	}
	public void setHomeLoc(String homeLoc) {
		this.homeLoc = homeLoc;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getZodiac() {
		return zodiac;
	}
	public void setZodiac(String zodiac) {
		this.zodiac = zodiac;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getGradFrom() {
		return gradFrom;
	}
	public void setGradFrom(String gradFrom) {
		this.gradFrom = gradFrom;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getSelfDesc() {
		return selfDesc;
	}
	public void setSelfDesc(String selfDesc) {
		this.selfDesc = selfDesc;
	}
	
}
