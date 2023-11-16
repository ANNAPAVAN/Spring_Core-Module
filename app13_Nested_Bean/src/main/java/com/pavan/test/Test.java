package com.pavan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pavan.beans.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pavan/resources/applicationContext.xml");
		
		Employee emp = (Employee)context.getBean("empBean");
		emp.getEmpDetails();
		
//		OUTPUT
//		--------
		
//		Employee Details 
//		Emp No   : 101
//		Emp Name : pavan
//		Emp Sal  : 5.0E7
//		Emp Addr : Rpk
//		---------------------------------
//		Account Details
//		Account Number : Kotak
//		Account Name   : Nithin
//		Account Type   : Savings
//		Account Balance: 50000
	}

}
