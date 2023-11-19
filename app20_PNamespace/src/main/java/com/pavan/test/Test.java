package com.pavan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pavan.beans.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pavan/resources/applicationContext.xml");
		Employee emp =(Employee)context.getBean("empBean");
		emp.getEmployeeDetails();
		
		/* 	OUTPUT
		 
		  	Employee Details
			Employee Id   : A-111
			Employee Name : pavan
			Employee Sal  : 500000
			Employee Addr : hyd
			Account Details
			Account : abc123
			Account : sbi
			Account : savings
			Account : 500000000
		*/
		

	}

}
