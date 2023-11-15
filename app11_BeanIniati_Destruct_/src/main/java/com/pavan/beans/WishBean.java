package com.pavan.beans;

public class WishBean {
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
		System.out.println("Inti -->WishBean");
		name="AAA";
		message="Good Night!!!";
	}
	public void destroy()
	{
		System.out.println("Destroy -->WishBean");
	}
	public String wish()
	{
		return "Happy "+name+" "+message;
	}
}
