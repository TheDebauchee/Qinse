package com.qs.manage.pojo;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="user_values")
public class UserValues {
	@Id
	private Long id;
	private String maritalStatus;
	private String whenToMarry;
	private String wantKid;
	private String wantParent;
	private String wantSeperation;
	private String desiredDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getWhenToMarry() {
		return whenToMarry;
	}
	public void setWhenToMarry(String whenToMarry) {
		this.whenToMarry = whenToMarry;
	}
	public String getWantKid() {
		return wantKid;
	}
	public void setWantKid(String wantKid) {
		this.wantKid = wantKid;
	}
	public String getWantParent() {
		return wantParent;
	}
	public void setWantParent(String wantParent) {
		this.wantParent = wantParent;
	}
	public String getWantSeperation() {
		return wantSeperation;
	}
	public void setWantSeperation(String wantSeperation) {
		this.wantSeperation = wantSeperation;
	}
	public String getDesiredDate() {
		return desiredDate;
	}
	public void setDesiredDate(String desiredDate) {
		this.desiredDate = desiredDate;
	}
	
	
	
}
