package com.pavan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pavan.beans.*;
import com.pavan.validator.*;
import java.util.*;
import org.springframework.validation.MapBindingResult;
import org.springframework.validation.ObjectError;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pavan/resources/applicationContext.xml");
		User user = (User)context.getBean("userBean");
		user.getUserDetails();
		System.out.println();
		
		UserValidator userValidator = (UserValidator)context.getBean("userValidator");
		Map<String,String> map = new HashMap<>();
		MapBindingResult results = new MapBindingResult(map,"com.pavan.beans.User");
		userValidator.validate(user, results);
		List<ObjectError> list = results.getAllErrors();
		for(ObjectError error:list)
		{
			System.out.println(error.getDefaultMessage());
		}
		
	}

}
