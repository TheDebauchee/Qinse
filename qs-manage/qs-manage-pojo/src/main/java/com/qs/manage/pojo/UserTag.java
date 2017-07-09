package com.qs.manage.pojo;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="user_tag")
public class UserTag {
	@Id
	private Long id;
	private String tag;
	private String name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
