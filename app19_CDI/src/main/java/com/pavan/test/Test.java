package com.pavan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pavan.beans.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("/com/pavan/resources/applicationContext.xml");
	    Student student = (Student)context.getBean("student");
	    student.getStudentDetails();
	    
//	    Output when we provide only Constructor dependency injection
	    /*
	    Constructor Dependency Injection
		Student Details: 
		Student Id    : A-111
		Student Name  : Pavan
		Student Addr  : Hyd
	     */
//	    ----------------------------------------------------------------------------------------------------------------------------------------
	    
//	    Output when we provide only Setter method dependency injection
	    /*
	    Setter method Dependency Injection
		Student Details: 
		Student Id    : B-111
		Student Name  : kalyan
		Student Addr  : Hyd
	    */
	    
	    
//	    Output when we provide both Constructor dependency injection and Setter method dependency injection
	    /*
	    Constructor Dependency Injection
		Setter method Dependency Injection
		Student Details: 
		Student Id    : B-111
		Student Name  : kalyan
		Student Addr  : Hyd
	    */
	    //so the setter method dependency values are final values (Overriding)

	}

}
