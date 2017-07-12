package qs.manage.pojo;

import java.util.ArrayList;
import java.util.List;

public class SelectedMember {
	private Integer salary;
	private Integer maxHeight;
	private Integer minHeight;
	private Integer maxAge;
	private Integer minAge;
	private List<ArrayList<Double>> centers;
	private List<Double> member;

	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Integer getMaxHeight() {
		return maxHeight;
	}
	public void setMaxHeight(Integer maxHeight) {
		this.maxHeight = maxHeight;
	}
	public Integer getMinHeight() {
		return minHeight;
	}
	public void setMinHeight(Integer minHeight) {
		this.minHeight = minHeight;
	}
	public Integer getMaxAge() {
		return maxAge;
	}
	public void setMaxAge(Integer maxAge) {
		this.maxAge = maxAge;
	}
	public Integer getMinAge() {
		return minAge;
	}
	public void setMinAge(Integer minAge) {
		this.minAge = minAge;
	}
	public List<ArrayList<Double>> getCenters() {
		return centers;
	}
	public void setCenters(List<ArrayList<Double>> centers) {
		this.centers = centers;
	}
	public List<Double> getMember() {
		return member;
	}
	public void setMember(List<Double> member) {
		this.member = member;
	}
	@Override
	public String toString() {
		return "SelectedMember [salary=" + salary + ", maxHeight=" + maxHeight + ", minHeight=" + minHeight
				+ ", maxAge=" + maxAge + ", minAge=" + minAge + ", centers=" + centers + ", member=" + member + "]";
	}


	
}
