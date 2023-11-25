package com.pavan.beans;

public class Employee {
	private String eid;
	private String ename;
	private float esal;
	private EmployeeAddress empAddress;
	
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
	public EmployeeAddress getEaddr() {
		return empAddress;
	}
	public void setEmpAddress(EmployeeAddress empAddress) {
		this.empAddress = empAddress;
	}
	public void geEmployeeDetails()
	{
		System.out.println("Employee Details");
		System.out.println("Employee ID   : "+eid);
		System.out.println("Employee Name : "+ename);
		System.out.println("Employee Sal  : "+esal);
		System.out.println("");
		System.out.println("Employee Address: ");
		System.out.println("hno    : "+empAddress.getHno());
		System.out.println("street : "+empAddress.getStreet());
		System.out.println("city   : "+empAddress.getCity());
		System.out.println("state  : "+empAddress.getState());
		System.out.println("country: "+empAddress.getCountry());
		
	}
}
