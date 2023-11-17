package com.pavan.beans;

public class Course {
	private String cid;
	private String cname;
	private int ccost;
	
	public Course()
	{
		System.out.println("0-org constructor");
		
	}
	
	public Course(String cid)
	{
		System.out.println("1-org constructor");
		this.cid=cid;
	}
	
	public Course(String cid,String cname)
	{
		System.out.println("2-org constructor");
		this.cid=cid;
		this.cname=cname;
	}
	
	public Course(String cid,String cname,int ccost)
	{
		System.out.println("3-org constructor");
		this.cid=cid;
		this.cname=cname;
		this.ccost=ccost;
	}
	
//	public String getCid() {
//		return cid;
//	}
//	public void setCid(String cid) {
//		this.cid = cid;
//	}
//	public String getCname() {
//		return cname;
//	}
//	public void setCname(String cname) {
//		this.cname = cname;
//	}
//	public int getCcost() {
//		return ccost;
//	}
//	public void setCcost(int ccost) {
//		this.ccost = ccost;
//	}
	
	public void getCourseDetails()
	{
		System.out.println("Details");
		System.out.println("Course Id   :"+cid);
		System.out.println("Course Name :"+cname);
		System.out.println("Course Cost :"+ccost);
	}
	
	
}
