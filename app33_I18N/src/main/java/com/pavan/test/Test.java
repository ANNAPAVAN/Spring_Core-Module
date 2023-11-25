package com.pavan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pavan.beans.*;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pavan/resourcesXML/applicationContext.xml");
		I18NBean bean = (I18NBean)context.getBean("i18nBean"); 
		bean.display();

	}

}
