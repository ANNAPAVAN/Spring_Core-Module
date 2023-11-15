package com.pavan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


import com.pavan.beans.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/pavan/resources/applicationContext.xml");
		HelloBean hb = (HelloBean)context.getBean("helloBean");
		System.out.println(hb.sayHello());
		
//		HaiBean haiBean = (HaiBean)context.getBean("haiBean");
//		System.out.println(haiBean.sayHai());
//		
//		WishBean wishBean = (WishBean)context.getBean("wishBean");
//		System.out.println(wishBean.wish());
		context.registerShutdownHook(); 
//		
		
		
		
		
		
		
		
		
		//OUTPUT for when three beans execution done three Beans 
//		-----------
//		Inti -->HelloBean
//		Inti -->HaiBean
//		Inti -->WishBean
//		Hello AAA Good Morning!!!
//		Hai AAA Good Afternoon!!!
//		Happy AAA Good Night!!!
//		Destroy -->WishBean
//		Destroy -->HaiBean
//		Destroy -->HelloBean
		
		//Output for when we give both local and global init() and destroy() methods in applicationContext.xml
		//First priority is given for Local , if local not present then it go for global methods
//		---------------------------
//		LocalInit -->HaiBean
//		Hello BBB Good Morning!!!
//		LocalDestroy -->HaiBean

		
		
	}

}
