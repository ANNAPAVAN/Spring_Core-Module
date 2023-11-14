package com.pavan.beans;

public class Employee {
	private int eno;
	private String ename;
	public int getEno()
	{
		return eno;
	}
	public void setEno(int eno)
	{
		this.eno = eno;
	}
	public String getEname()
	{
		return ename;
	}
	public void setEname(String ename)
	{
		this.ename = ename;
	}
	public void getEmployee()
	{
		System.out.println("Employee Id :"+eno);
		System.out.println("Employee Name :"+ename);
	}
	
}
