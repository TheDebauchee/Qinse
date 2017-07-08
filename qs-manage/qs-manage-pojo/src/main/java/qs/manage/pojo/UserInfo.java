package qs.manage.pojo;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="user_info")
public class UserInfo {
	@Id
	private Long id;
	private String gender;
	private String education;
	private String salary;
	private String height;
	private String workplace;
	private String hashouse;
	private String haskid;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWorkplace() {
		return workplace;
	}
	public void setWorkplace(String workplace) {
		this.workplace = workplace;
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
