package com.pavan.beans;

import javax.annotation.PostConstruct; //To use this add Dependency in pom.xml
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.*;

//public class HelloBean implements InitializingBean,DisposableBean {
public class HelloBean {
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
		System.out.println("Inti -->HelloBean");
		name="AAA";
		message="Good Morning!!!";
	}
	public void destroy()
	{
		System.out.println("Destroy -->HelloBean");
	}
	public void localInit()
	{
		System.out.println("LocalInit -->HaiBean");
		name="BBB";
		message="Good Morning!!!";
	}
	public void localDestroy()
	{
		System.out.println("LocalDestroy -->HaiBean");
	}
	public String sayHello()
	{
		return "Hello "+name+" "+message;
	}
}
