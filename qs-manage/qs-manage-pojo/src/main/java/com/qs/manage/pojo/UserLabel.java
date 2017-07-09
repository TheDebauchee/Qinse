package com.qs.manage.pojo;

import java.util.List;
import java.util.Map;

public class UserLabel {
	private Long id;
	private String name;
	private List<AttrTag> labell;
	private List<MatTag> courtLabell;
	
	public List<AttrTag> getLabell() {
		return labell;
	}
	public void setLabell(List<AttrTag> labell) {
		this.labell = labell;
	}
	public List<MatTag> getCourtLabell() {
		return courtLabell;
	}
	public void setCourtLabell(List<MatTag> courtLabell) {
		this.courtLabell = courtLabell;
	}
	private Map<String,Double> lable;
	private Map<String,Double> courtLabel;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Double> getLable() {
		
		for(AttrTag attr : this.labell){
			this.lable.put(attr.getTagName(), attr.getValue());
		}
		return lable;
	}
	public Map<String,Double> getCourtLabel() {
		for(MatTag mat : this.courtLabell){
			this.courtLabel.put(mat.getTagName(), mat.getValue());
		}
		return courtLabel;
	}
	public void setCourtLabel(Map<String,Double> courtLabel) {
		this.courtLabel = courtLabel;
	}
	public void setLabel(Map<String,Double> userLabel) {
		this.lable = userLabel;
	}
	
}
