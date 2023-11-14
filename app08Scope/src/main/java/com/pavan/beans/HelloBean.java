package com.pavan.beans;

public class HelloBean {
	static {
		System.out.println("HelloBean class Loading");
	}
	public HelloBean()
	{
		System.out.println("HelloBean class Instantiation");
	}
	public String sayHello()
	{
		return "Hello Users";
	}
}
