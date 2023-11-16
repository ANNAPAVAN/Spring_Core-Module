package com.pavan.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.pavan.beans.*;

public class AccountPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException {
    	Account acc = (Account)bean;
    	if(acc.getAccType()==null)
    	{
    		acc.setAccType("savings");
    	}
    	
       return acc;
    }
    
    @Override
    public Object postProcessAfterInitialization(Object bean, String name) throws BeansException {
    	Account acc = (Account)bean;
    	String email = acc.getAccHolderEmail();
    	if(!email.contains("@"))
    	{
    		email = email+"@gmail.com";
    		acc.setAccHolderEmail(email);
    	}
    	String mobile = acc.getAccHolderMobileNo();
    	if(!mobile.startsWith("91-"))
    	{
    		mobile = "91-"+mobile;
    		acc.setAccHolderMobileNo(mobile);
    	}
       return acc;
    }


}
