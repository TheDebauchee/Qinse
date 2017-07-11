package com.qs.manage.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 择偶意向
 */
@Table(name="spouse")
public class Spouse {
	@Id
	@Column(name="id")
	private Long userId;
	private String sGender;
	private String sMinAge;
	private String sMaxAge;
	private String sMaritalStatus;
	private String sWorkplace;
	private String sHomeLoc;
	private String sEducation;
	private String sMinHeight;
	private String sMaxHeight;
	private String sMinSalary;
	private String sMaxSalary;
	private String sHaschild;
	private String sHashouse;
	private String sDrink; 
	private String sSmoke;
	
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getsGender() {
		return sGender;
	}
	public void setsGender(String sGender) {
		this.sGender = sGender;
	}
	public String getsMinAge() {
		return sMinAge;
	}
	public void setsMinAge(String sMinAge) {
		this.sMinAge = sMinAge;
	}
	public String getsMaxAge() {
		return sMaxAge;
	}
	public void setsMaxAge(String sMaxAge) {
		this.sMaxAge = sMaxAge;
	}
	public String getsMaritalStatus() {
		return sMaritalStatus;
	}
	public void setsMaritalStatus(String sMaritalStatus) {
		this.sMaritalStatus = sMaritalStatus;
	}
	public String getsWorkplace() {
		return sWorkplace;
	}
	public void setsWorkplace(String sWorkplace) {
		this.sWorkplace = sWorkplace;
	}
	public String getsHomeLoc() {
		return sHomeLoc;
	}
	public void setsHomeLoc(String sHomeLoc) {
		this.sHomeLoc = sHomeLoc;
	}
	public String getsEducation() {
		return sEducation;
	}
	public void setsEducation(String sEducation) {
		this.sEducation = sEducation;
	}
	public String getsMinHeight() {
		return sMinHeight;
	}
	public void setsMinHeight(String sMinHeight) {
		this.sMinHeight = sMinHeight;
	}
	public String getsMaxHeight() {
		return sMaxHeight;
	}
	public void setsMaxHeight(String sMaxHeight) {
		this.sMaxHeight = sMaxHeight;
	}
	public String getsMinSalary() {
		return sMinSalary;
	}
	public void setsMinSalary(String sMinSalary) {
		this.sMinSalary = sMinSalary;
	}
	public String getsMaxSalary() {
		return sMaxSalary;
	}
	public void setsMaxSalary(String sMaxSalary) {
		this.sMaxSalary = sMaxSalary;
	}
	public String getsHaschild() {
		return sHaschild;
	}
	public void setsHaschild(String sHaschild) {
		this.sHaschild = sHaschild;
	}
	public String getsHashouse() {
		return sHashouse;
	}
	public void setsHashouse(String sHashouse) {
		this.sHashouse = sHashouse;
	}
	public String getsDrink() {
		return sDrink;
	}
	public void setsDrink(String sDrink) {
		this.sDrink = sDrink;
	}
	public String getsSmoke() {
		return sSmoke;
	}
	public void setsSmoke(String sSmoke) {
		this.sSmoke = sSmoke;
	}
	
}
