package com.pavan.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import com.pavan.beans.*;
//Annotations are mandetory
@Configuration 
public class AppConfig {
	static {
		System.out.println("AppConfig class Loading");
	}
	public AppConfig()
	{
		System.out.println("AppConfig class Instantiation");
	}
	
	@Bean
	public WelcomeBean welcomeBean()
	{
		WelcomeBean wb = new WelcomeBean();
		wb.setName("pavan");
		return wb;
	}
	@Bean
	public HelloBean helloBean()
	{
		HelloBean hb = new HelloBean();
		hb.setName("pavan");
		return hb;
	}
}
