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
/*	
//	UserDefined Initialization
	public void init()
	{
		System.out.println("init()->method");
		name="ravi";
		message="Good Afternoon!!!";
	}
//	UserDefined Destruction
	public void destroy()
	{
		System.out.println("destroy()->method");
		name="";
		message="";
	}
*/

/*
	//for InitializingBean and DisposableBean
	//Container will automatically call, no need to put anything in bean
	@Override
	public void afterPropertiesSet() throws Exception
	{
		System.out.println("Initializing through afterPropertiesSet() method ");
		name="Ramesh";
		message="Good Night!!!!";
	}
	@Override
	public void destroy() throws Exception
	{
		System.out.println("Destructing through distroy() method ");
		name="";
		message="";
	}
*/
	
	//for @PostConstruct and @PreDestroy 
	@PostConstruct
	public void initializeBean()
	{
		System.out.println("Initializing through @PostConstruct method ");
		name="Rakesh";
		message="Good !!!!";
	}
	@PreDestroy 
	public void destroyBean()
	{
		System.out.println("Destry through @PreDestroy method ");
		name="";
		message="";
	}
	
	public String sayHello()
	{
		return "Hello "+name+" "+message;
	}
}
