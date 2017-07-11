package com.qs.manage.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="user_photo")
public class UserPhoto {
	@Id
	@Column(name="id")
	private Long userId;
	private String pic1;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getPic() {
		return pic1;
	}
	public void setPic(String pic1) {
		this.pic1 = pic1;
	}
	
	
}
