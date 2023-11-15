package com.pavan.beans;

public class HaiBean {
	private String name;
	private String message;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void init()
	{
		System.out.println("Inti -->HaiBean");
		name="AAA";
		message="Good Afternoon!!!";
	}
	public void destroy()
	{
		System.out.println("Destroy -->HaiBean");
	}

	public String sayHai()
	{
		return "Hai "+name+" "+message;
	}
}
