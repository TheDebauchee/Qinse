package com.qs.manage.pojo;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="atteuser")
public class AtteUser {
	@Id
	private Long userId;
	@Id
	private Long atteId;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getAtteId() {
		return atteId;
	}
	public void setAtteId(Long atteId) {
		this.atteId = atteId;
	}
}
