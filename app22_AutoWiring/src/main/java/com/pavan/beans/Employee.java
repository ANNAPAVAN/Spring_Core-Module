package com.pavan.beans;

public class Employee {
	private String eid;
	private String ename;
	private float esal;
	private Account account;
	private Address address;
	
	public Employee(String eid,String ename,float esal,Account account,Address address)
	{
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
		this.account=account;
		this.address=address;
	}
	
/*	public String getEid() {
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
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
*/	
	public void getEmpDetails()
	{
		System.out.println("Employee Details");
		System.out.println("Employee Id   : "+eid);
		System.out.println("Employee Name : "+ename);
		System.out.println("Employee Salry: "+esal);
		System.out.println("");
		System.out.println("Employee Account Details");
		System.out.println("Account No  : "+account.getAccNo());
		System.out.println("Account Name: "+account.getAccName());
		System.out.println("Account Type: "+account.getAccType());
		System.out.println("Balance     : "+account.getBalance());
		System.out.println("");
		System.out.println("Employee Address Details");
		System.out.println("House No : "+address.getHno());
		System.out.println("Street   : "+address.getStreet());
		System.out.println("City     : "+address.getCity());;
		System.out.println("State    : "+address.getState());
		
	}
	
	
}
