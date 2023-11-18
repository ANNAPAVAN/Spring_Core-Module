package com.pavan.beans;
import java.util.*;
public class Student {
	private String sid;
	private String sname;
	private Address saddr;
	private List<String> squal;
	private Set<String> scources;
	private Map<String,String> scources_And_Faculty;
	
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
	public Address getSaddr() {
		return saddr;
	}
	public void setSaddr(Address saddr) {
		this.saddr = saddr;
	}
	public List<String> getSqual()
	{
		return squal;
	}
	public void setSqual(List<String> squal)
	{
		this.squal = squal;
	}
	
	public Set<String> getScources()
	{
		return scources;
	}
	
	public void setScources(Set<String> scources)
	{
		this.scources=scources;
	}
	
	public Map<String,String> getScources_And_Faculty()
	{
		return scources_And_Faculty;
	}
	public void setScources_And_Faculty(Map<String,String> scources_And_Faculty)
	{
		this.scources_And_Faculty = scources_And_Faculty;
	}
	
	public void getStudentDetails()
	{
		System.out.println("Student Details");
		System.out.println("------------------");
		System.out.println("Student Id   :"+sid);
		System.out.println("Student Name :"+sname);
		System.out.print("Student Qualifications :");
		for(String qual:squal)
		{
			System.out.print(qual+" ");
		}
		System.out.println();
		System.out.print("Student Cources :");
		for(String course:scources)
		{
			System.out.print(course+" ");
		}
		System.out.println();
		System.out.println("Student Course and Faculty :");
		for(Map.Entry<String,String> e1:scources_And_Faculty.entrySet())
		{
			System.out.println(e1.getKey()+"-->"+e1.getValue());
		}
		System.out.println();
		System.out.println("Student Address Details");
		System.out.println("-----------------------");
		System.out.println("Plot No  :"+saddr.getPno());
		System.out.println("Street   :"+saddr.getStreet());
		System.out.println("City     :"+saddr.getCity());
		System.out.println("State    :"+saddr.getState());
		System.out.println("Country  :"+saddr.getCountry());
		
//		Output
		/*
			Student Details
			------------------
			Student Id   :S-111
			Student Name :Anil
			Student Qualifications :Btech TSBOARD SSC 
			Student Cources :WEB JAVA SPRING PYTHON 
			Student Course and Faculty :
			Web-->Ram
			java-->Khiran
			spring-->Somkumar
			python-->RamaKrishna
			
			Student Address Details
			-----------------------
			Plot No  :100/2d
			Street   :MgRoad
			City     :Hyd
			State    :Telangana
			Country  :India
		 */
		
	}
	
}
