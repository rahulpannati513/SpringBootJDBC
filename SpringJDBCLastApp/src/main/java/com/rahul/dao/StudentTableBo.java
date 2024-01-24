package com.rahul.dao;
//it is a POJO class
public class StudentTableBo {
	private Integer sid;
	private String sname;
	private String scity;
	
	public StudentTableBo() {
		System.out.println("StudentBo obj is created ...");
	}
	
	
	@Override
	public String toString() {
		return "StudentTableBo [sid=" + sid + ", sname=" + sname + ", scity=" + scity + ", getSid()=" + getSid()
				+ ", getSname()=" + getSname() + ", getScity()=" + getScity() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}

}
