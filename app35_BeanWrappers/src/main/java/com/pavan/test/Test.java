package com.pavan.test;

import java.util.Map;
import java.util.*;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import com.pavan.beans.*;

public class Test {

	public static void main(String[] args) {
		BeanWrapper bw = new BeanWrapperImpl(Employee.class);
		bw.setPropertyValue("eno",111);
		bw.setPropertyValue("ename","pavan");
		bw.setPropertyValue("esal",500000);
		bw.setPropertyValue("eaddr","rpk");
		
		System.out.println("Employee Details");
		System.out.println("Employee No   : "+bw.getPropertyValue("eno"));
		System.out.println("Employee Name : "+bw.getPropertyValue("ename"));
		System.out.println("Employee Sal  : "+bw.getPropertyValue("esal"));
		System.out.println("Employee Addr : "+bw.getPropertyValue("eaddr"));
		
		System.out.println("---------------------");
		Map<String,Object> map = new HashMap<>();
		map.put("eno", 222);
		map.put("ename", "anil");
		map.put("esal", 600000);
		map.put("eaddr", "hyd");
		bw.setPropertyValues(map);
		
		Employee emp = (Employee)bw.getWrappedInstance();
		emp.getEmployeeDetails();
		System.out.println("---------------------");
		System.out.println(bw.isReadableProperty("eno"));
		System.out.println(bw.isReadableProperty("ename"));
		System.out.println(bw.isReadableProperty("esal"));
		System.out.println(bw.isReadableProperty("eaddr"));
		System.out.println("---------------------");
		System.out.println(bw.isWritableProperty("eno"));
		System.out.println(bw.isWritableProperty("ename"));
		System.out.println(bw.isWritableProperty("esal"));
		System.out.println(bw.isWritableProperty("eaddr"));
		System.out.println("---------------------");
		
		//Copying data from one bean object into another
		Employee emp1 = new Employee();
		BeanUtils.copyProperties(emp,emp1);
		emp1.getEmployeeDetails();
		
	}

}
