package com.pavan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pavan.bean.HelloBean;

public class Test {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloBean hello = (HelloBean)context.getBean("helloBean");
        System.out.println(hello.sayHello());
    }
}
