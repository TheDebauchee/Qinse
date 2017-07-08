package qs.manage.pojo;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="user_photo")
public class UserPhoto {
	@Id
	private Long id;
	private String pic1;
	private String pic2;
	private String pic3;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPic1() {
		return pic1;
	}
	public void setPic1(String pic1) {
		this.pic1 = pic1;
	}
	public String getPic2() {
		return pic2;
	}
	public void setPic2(String pic2) {
		this.pic2 = pic2;
	}
	public String getPic3() {
		return pic3;
	}
	public void setPic3(String pic3) {
		this.pic3 = pic3;
	}
	
	
}
