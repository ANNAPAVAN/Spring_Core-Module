package com.pavan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

import com.pavan.beans.*;
import com.pavan.config.AppConfig;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
//		-------------------------------------------------------------------------------
		
//		String[] beanNames = context.getBeanDefinitionNames();
//		for(String s:beanNames)
//		{
//			System.out.println(s);
//		}
 		
//		----------------------------------------------------
		
//		WelcomeBean welBean1 = (WelcomeBean)context.getBean("welcomeBean");
//		System.out.println(welBean1.getWelcomeMessage());
//        HelloBean helloBean = (HelloBean) context.getBean("helloBean");
//        System.out.println(helloBean.sayHello());
		
//		-------------------------------------------------------
		
//		System.out.println(welBean1.getWelcomeMessage());
//		WelcomeBean welBean2 = (WelcomeBean)context.getBean(WelcomeBean.class);
//		System.out.println(welBean2.getWelcomeMessage());
//		System.out.println(welBean1);
//		System.out.println(welBean2);
//		System.out.println(welBean1==welBean2);  //singleton scope
	}

}
