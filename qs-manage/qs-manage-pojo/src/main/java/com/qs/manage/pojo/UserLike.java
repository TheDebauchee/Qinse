package com.qs.manage.pojo;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="user_like")
public class UserLike {
	@Id
	private Long userId;
	private String like;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getLike() {
		return like;
	}
	public void setLike(String like) {
		this.like = like;
	}
	
}
