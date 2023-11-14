package com.pavan.beans;

public class WelcomeBean {
	private String name;
	static {
		System.out.println("WelcomeBean class Loading");
	}
	public WelcomeBean()
	{
		System.out.println("WelcomeBean class Instantiation");
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public String getWelcomeMessage()
	{
		return "Hello, hi "+name+" welcome to Spring Framework";
	}
}
