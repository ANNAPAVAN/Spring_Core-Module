package com.pavan.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import com.pavan.beans.User;
import java.util.Properties;


public class UserValidator implements Validator {

	
	private Resource resource; //to get the messages from Error_Messages.properties
	public void setResource(Resource resource)
	{
		this.resource = resource;
	}
	
	@Override
	public boolean supports(Class<?> cls) {
		
		return User.class.equals(cls);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		
		//Getting Hard coded Data
		
//		User user = (User)obj;
//		if(user.getUname()==null || user.getUname().equals(""))
//		{
//			//errors : a map object internally
//			//On the based of property name validation message(key,value) is prepared by  rejectValue() ,
// 			//that is going to be stored in errors as {property name, validation message}
//			errors.rejectValue("uname","error.uname.required","User Name is required"); //property,key,value
//		}
//		if(user.getUpwd()==null || user.getUpwd().equals(""))
//		{
//			errors.rejectValue("upwd","error.upwd.required","User Password is required"); 
//		}
//		if(user.getUage()==0)
//		{
//			errors.rejectValue("uage","error.uage.required","User Age is required"); 
//		}
//		if(user.getUemail()==null || user.getUemail().equals(""))
//		{
//			errors.rejectValue("uemail","error.uemail.required","User Email is required"); 
//		}
//		if(user.getUmobile()==null || user.getUmobile().equals(""))
//		{
//			errors.rejectValue("umobile","error.umobile.required","User Mobile Number is required"); 
//		}
		
		//Getting data from Properties file
		 try {
			 
			User user = (User)obj;
			Properties prop = PropertiesLoaderUtils.loadProperties(resource);
			if(user.getUname()==null || user.getUname().equals(""))
			{
				//errors : a map object internally
				//On the based of property name validation message(key,value) is prepared by  rejectValue() ,
	 			//that is going to be stored in errors as {property name, validation message}
				errors.rejectValue("uname","error.uname.required",prop.getProperty("error.uname.required")); //property,key,value
			}
			if(user.getUpwd()==null || user.getUpwd().equals(""))
			{
				errors.rejectValue("upwd","error.upwd.required",prop.getProperty("error.upwd.required")); 
			}
			if(user.getUage()==0)
			{
				errors.rejectValue("uage","error.uage.required",prop.getProperty("error.uage.required")); 
			}
			if(user.getUemail()==null || user.getUemail().equals(""))
			{
				errors.rejectValue("uemail","error.uemail.required",prop.getProperty("error.uemail.required")); 
			}
			if(user.getUmobile()==null || user.getUmobile().equals(""))
			{
				errors.rejectValue("umobile","error.umobile.required",prop.getProperty("error.umobile.required")); 
			}
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	}

}
