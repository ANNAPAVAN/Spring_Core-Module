package com.pavan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pavan.beans.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("/com/pavan/resources/applicationContext.xml");
		Student student = (Student)context.getBean("student");
		System.out.println(student.getStudentName());
		Branch branch = (Branch)context.getBean("branch");
		System.out.println(branch.getBranchName());
		
//		Circular dependency injection is NOT supported by Constructor dependency Injection
		
//		Circular dependency injection is supported by Setter method dependency Injection

	}

}
