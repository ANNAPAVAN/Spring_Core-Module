package com.pavan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pavan.beans.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pavan/resources/applicationContext.xml");
		Student student = (Student)context.getBean("studentBean");
		student.getStudentDetails();
		


	}

}
