package com.qs.web.pojo;

import java.util.Map;

public class UserLabel {
	private String id;
	private String name;
	private Map<String,Double> lable;
	private Map<String,Double> courtLabel;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Double> getLable() {
		return lable;
	}
	public void setLable(Map<String, Double> lable) {
		this.lable = lable;
	}
	public Map<String,Double> getCourtLabel() {
		return courtLabel;
	}
	public void setCourtLabel(Map<String,Double> courtLabel) {
		this.courtLabel = courtLabel;
	}
	
}
