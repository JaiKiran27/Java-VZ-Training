package com.verizon.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
//@Table(name="productPlan")
public class Plan {
	@Id
	Integer pid;
	@Column
	String pname;
	Integer duration;
	Plan(){
	
	}
	public Plan(Integer pid, String pname, Integer duration) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Plan [pid=" + pid + ", pname=" + pname + ", duration=" + duration + "]";
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	
	

}
