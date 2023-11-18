package com.pavan.beans;

public class Branch {
	private Student student;
/*	public Branch(Student student) {
		// TODO Auto-generated constructor stub
		this.student = student;
	}
*/	
	public String getBranchName()
	{
		return "Computers";
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	

}
