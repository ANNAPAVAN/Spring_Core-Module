package com.pavan.test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import com.pavan.beans.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Employee emp = (Employee)factory.getBean("empBean");
		emp.getEmployee();
	}

}
