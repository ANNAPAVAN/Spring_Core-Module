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
		
//		In case of Constructor Dependency injection only, Circular Dependency Injection is possible, so we get an Exception 
		
//		In case of Setter Method dependency injection ,Circular Dependency Injection is not possible, so we get an Output

	}

}
