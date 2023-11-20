package com.pavan.beans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	private String eno;
	private String ename;
	private float esal;
	private String eaddr;
	private Account acc;
	
/*	// uncomment when we go for Constructor Dependency Injection
 
	@Autowired(required=true)
	public Employee(String eno,String ename,float esal,String eaddr, @Qualifier("currentAcc")Account acc)
	{
		this.eno=eno;
		this.ename=ename;
		this.esal=esal;
		this.eaddr=eaddr;
		this.acc=acc;
	}
*/	
    public String getEno() {
		return eno;
	}
	public void setEno(String eno) {
		this.eno = eno;
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
	
//	@Required
//	@Autowired
	@Autowired(required=true)
	@Qualifier("savingsAcc") //when two or more bean objects with same type we have to specify id to avoid ambiguity
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	public void getEmpDetails()
	{
		System.out.println("Employee Details ");
		System.out.println("Employee Id   : "+eno);
		System.out.println("Employee Name : "+ename);
		System.out.println("Employee Sal  : "+esal);
		System.out.println("Employee Addr : "+eaddr);
		System.out.println();
		System.out.println("Account Details");
		System.out.println("Account Id   : "+acc.getAccNo());
		System.out.println("Account name : "+acc.getAccName());
		System.out.println("Account Type : "+acc.getAccType());
		System.out.println("Account bal  : "+acc.getBalance());
		
	}
}
