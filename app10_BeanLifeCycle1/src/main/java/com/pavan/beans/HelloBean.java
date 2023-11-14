package com.pavan.beans;

public class HelloBean {
	//executed At the time of loading bean class bytes code to the memory
	static {
		System.out.println("HelloBean class Loading...");
	}
	//Executed at the time of creating bean object
	// Here private,protected,default constructors also works 
	// must be 0-arg constructor
	public HelloBean()
	{
		System.out.println("HelloBean instatiation...");
	}
	public String sayHello()
	{
		return "Hello User!!";
	}
	
//	//Bean instatiation using static factory method
//	public static HelloBean getInstance()           //include in bean as factory-methhod
//	{
//		System.out.println("static factory method...");
//		return new HelloBean();
//	}
	
	
}
