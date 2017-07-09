package com.qs.web.pojo;

public class Sim implements Comparable<Sim>{
	private Double simm;
	private Long simId;
	public Sim(Long simId,Double simm){
		this.simId = simId;
		this.simm = simm;
	}
	public Double getSimm() {
		return simm;
	}
	public void setSimm(Double simm) {
		this.simm = simm;
	}
	public Long getSimId() {
		return simId;
	}
	public void setSimId(Long simId) {
		this.simId = simId;
	}
	public int compareTo(Sim s) {
		if(this.simm>s.simm){
			return -1;
		}else if(this.simm<s.simm){
			return 1;
		}else{
			return 0;
		}
	}
	@Override
	public String toString() {
		return "Sim [simm=" + simm + ", simId=" + simId + "]";
	}
	
	
}
