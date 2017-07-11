package com.qs.manage.pojo;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="user_detail")
public class UserDetail {
	@Id
	private Long userId;
	private String homeLoc;
	private String weight;
	private String shape;	//体型
	private String zodiac;	//生肖
	private String sign;	//星座
	private String race;	//民族 
	private String religion;  //宗教信仰
	private String gradFrom;	//毕业院校
	private String major;		//专业
	private String selfDesc;	//自我描述
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
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
