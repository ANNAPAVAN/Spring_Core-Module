package com.pavan.beans;

public class Course {
	String cid;
	String cname;
	int ccost;
	public Course(String cid,String cname,int ccost)
	{
		this.cid=cid;
		this.cname=cname;
		this.ccost=ccost;
	}
	public String getCid()
	{
		return cid;
	}
	public String getCname()
	{
		return cname;
	}
	public int getCcost()
	{
		return ccost;
	}

}
