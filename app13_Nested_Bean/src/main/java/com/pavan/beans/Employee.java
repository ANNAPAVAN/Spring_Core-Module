package com.pavan.beans;

public class Employee {
    private String eid;
    private String ename;
    private float esal;
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
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
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
    
	
	public void getEmpDetails()
	{
		System.out.println("Employee Details ");
		System.out.println("Emp No   : "+eid);
		System.out.println("Emp Name : "+ename);
		System.out.println("Emp Sal  : "+esal);
		System.out.println("Emp Addr : "+eaddr);
		System.out.println("---------------------------------");
		System.out.println("Account Details");
		System.out.println("Account Number : "+acc.getAccNo());
		System.out.println("Account Name   : "+acc.getAccName());
		System.out.println("Account Type   : "+acc.getAccType());
		System.out.println("Account Balance: "+acc.getBalance());
		
	}
    
}
