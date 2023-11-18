package com.pavan.beans;

public class Student {
	private Branch branch;
/*	public Student(Branch branch) {
		// TODO Auto-generated constructor stub
		this.branch = branch;
	}
*/
	
	public String getStudentName()
	{
		return "Pavan";
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

}
