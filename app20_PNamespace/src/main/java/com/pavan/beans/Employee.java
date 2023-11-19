package com.pavan.beans;

public class Employee {
	private String eid;
	private String ename;
	private String esal;
	private String eaddr;
	private Account acc;
	
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEsal() {
		return esal;
	}
	public void setEsal(String esal) {
		this.esal = esal;
	}
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	public void getEmployeeDetails()
	{
		System.out.println("Employee Details");
		System.out.println("Employee Id   : "+eid);
		System.out.println("Employee Name : "+ename);
		System.out.println("Employee Sal  : "+esal);
		System.out.println("Employee Addr : "+eaddr);
		System.out.println("Account Details");
		System.out.println("Account : "+acc.getAccNo());
		System.out.println("Account : "+acc.getAccName());
		System.out.println("Account : "+acc.getAccType());
		System.out.println("Account : "+acc.getBalance());
	}
	
}
