package com.pavan.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pavan.beans.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("/com/pavan/resources/applicationContext.xml");
		
		Account acc = (Account)context.getBean("accountBean");
		acc.createAccount();
		acc.searchAccount();
		acc.updateAccount();
		acc.deleteAccount();
		
		//console Output
		/*
		 		Account Created...
				Account Identified....
				Account Updated...
				Account Deleted.... 
		 */
		
		//In log.txt file
		/*
			 	Thu Nov 23 23:54:27 IST 2023 : Acc Created
				Thu Nov 23 23:54:27 IST 2023 : Acc Identified
				Thu Nov 23 23:54:27 IST 2023 : Acc Updated
				Thu Nov 23 23:54:27 IST 2023 : Acc Deleted
		 */
	}

}
