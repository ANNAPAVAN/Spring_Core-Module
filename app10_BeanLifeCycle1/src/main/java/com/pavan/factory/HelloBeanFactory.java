package com.pavan.factory;

import com.pavan.beans.*;
public class HelloBeanFactory {
	public HelloBean getHelloBeanInstance()
	{
		System.out.println("getHelloBeanInstance()-> HelloBeanFactory");
		return new HelloBean();
	}
}
