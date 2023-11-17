package com.pavan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pavan.beans.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pavan/resources/applicationContext.xml");
		Course course0=(Course)context.getBean("courseBean0");
		course0.getCourseDetails();
		System.out.println("-------------------");
		Course course1=(Course)context.getBean("courseBean1");
		course1.getCourseDetails();
		System.out.println("-------------------");
		Course course2=(Course)context.getBean("courseBean2");
		course2.getCourseDetails();
		System.out.println("-------------------");
		Course course=(Course)context.getBean("courseBean");
		course.getCourseDetails();
		
		/*  OUTPUT
		 
		    0-org constructor
			1-org constructor
			2-org constructor
			3-org constructor
			Details
			Course Id   :null
			Course Name :null
			Course Cost :0
			-------------------
			Details
			Course Id   :C-111
			Course Name :null
			Course Cost :0
			-------------------
			Details
			Course Id   :C-111
			Course Name :Java
			Course Cost :0
			-------------------
			Details
			Course Id   :C-111
			Course Name :Java
			Course Cost :5000
		*/
	}

}
