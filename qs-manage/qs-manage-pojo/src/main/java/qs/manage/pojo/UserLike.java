package qs.manage.pojo;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="user_like")
public class UserLike {
	@Id
	private Long id;
	private String like;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLike() {
		return like;
	}
	public void setLike(String like) {
		this.like = like;
	}
	
	
}
