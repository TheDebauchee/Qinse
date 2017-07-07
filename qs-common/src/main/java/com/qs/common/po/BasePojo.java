package com.qs.common.po;

import java.io.Serializable;
import java.util.Date;

import org.apache.solr.client.solrj.beans.Field;

//pojo基类，完成2个任务，2个日期，实现序列化
public class BasePojo implements Serializable{
	@Field
	private Date created;
	@Field
	private Date updated;
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	
}
