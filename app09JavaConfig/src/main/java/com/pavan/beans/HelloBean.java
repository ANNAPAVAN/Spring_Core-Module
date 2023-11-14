package com.pavan.beans;

public class HelloBean {
	private String name;
	
	static {
		System.out.println("HelloBean class Loading");
	}
	public HelloBean()
	{
		System.out.println("HelloBean class Instantiation");
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public String sayHello()
	{
		
		return "hello "+name+" user!!!!";
	}
}
