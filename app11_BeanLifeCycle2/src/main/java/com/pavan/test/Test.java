package com.pavan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


import com.pavan.beans.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pavan/resources/applicationContext.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/pavan/resources/applicationContext.xml");
		HelloBean hb = (HelloBean)context.getBean("helloBean");
		System.out.println(hb.sayHello());
		
		//To destroy Bean
		context.registerShutdownHook(); //present in AbstractApplicationContext
		
		
		
	}

}
