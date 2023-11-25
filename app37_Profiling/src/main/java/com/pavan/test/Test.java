package com.pavan.test;

import org.springframework.context.support.GenericXmlApplicationContext;
import com.pavan.beans.*;

public class Test {

	public static void main(String[] args) {
		//case 1: if "spring.profiles.active", "development"
/*
		System.setProperty("spring.profiles.active", "development");
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load("/com/pavan/resources/applicationContext-development.xml","/com/pavan/resources/applicationContext-production.xml");
		context.refresh();
		DBBean db = (DBBean)context.getBean("dbBean");
		db.displayDBDetails();
*/  
		/* 
		 	DataBase Details
			Driver ClassName : oracle.jdbc.OracleDriver
			Driver URL       : jdbc:oracle:thin:@localhost:1521:xe
			Database UserName: system
			Database Passwod : pavan

		 */

		
//		case 2: if "spring.profiles.active", "production"
		
		System.setProperty("spring.profiles.active", "production");
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load("/com/pavan/resources/applicationContext-development.xml","/com/pavan/resources/applicationContext-production.xml");
		context.refresh();
		DBBean db = (DBBean)context.getBean("dbBean");
		db.displayDBDetails();
		
		/*
			DataBase Details
			Driver ClassName : com.mysql.cj.jdbc.Driver
			Driver URL       : jdbc:mysql://localhost:3306/db
			Database UserName: root
			Database Passwod : pavan
		 */
	}

}
