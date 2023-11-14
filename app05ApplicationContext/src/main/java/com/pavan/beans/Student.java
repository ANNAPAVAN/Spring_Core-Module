package com.pavan.beans;

public class Student {
	private String sid;
	private String sname;
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void getStudentDetails()
	{
		System.out.println("Student Id:"+sid);
		System.out.println("Student Name:"+sname);
	}
}
