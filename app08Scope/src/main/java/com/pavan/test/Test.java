package com.pavan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pavan.beans.HelloBean;
import com.pavan.scopes.ThreadScope;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pavan/resources/applicationContext.xml");
		HelloBean helloBean1 = (HelloBean)context.getBean("helloBean");
		HelloBean helloBean2 = (HelloBean)context.getBean("helloBean");
//		System.out.println(helloBean1.sayHello());
//		System.out.println(helloBean2.sayHello());
		
		System.out.println("Main Thread -> "+helloBean1);
		System.out.println("Main Thread -> "+helloBean2);
		
//		ThreadScope threadScope = (ThreadScope) context.getBean("threadScope");
//		HelloBean helloBean = (HelloBean)threadScope.remove("helloBean");
//		System.out.println(helloBean);
//		
//		HelloBean helloBean3 = (HelloBean)context.getBean("helloBean");
//		System.out.println(helloBean3);
//		HelloBean helloBean4 = (HelloBean)threadScope.remove("helloBean");
//		System.out.println(helloBean4);
		Runnable r = new Runnable() {
			public void run()
			{
				HelloBean helloBean3 = (HelloBean)context.getBean("helloBean");
				HelloBean helloBean4 = (HelloBean)context.getBean("helloBean");
				
				System.out.println("User Thread1 -> "+helloBean3);
				System.out.println("User Thread2 -> "+helloBean4);
			}
		};
		Thread t = new Thread(r);
		t.start();
		
		new Thread(()->{
			HelloBean helloBean5 = (HelloBean)context.getBean("helloBean");
			HelloBean helloBean6 = (HelloBean)context.getBean("helloBean");
			
			System.out.println("User Thread2 -> "+helloBean5);
			System.out.println("User Thread2 -> "+helloBean6);
		}).start();
	
// for each thread one bean Object is Created
		
	}

}
