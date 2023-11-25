package com.pavan.core;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Date;
public class Test {

	public static void main(String[] args) {
		
		Locale l1 = new Locale("en","US");
		NumberFormat nf1 = NumberFormat.getInstance(l1);
		System.out.println(nf1.format(123456.7984562));  //  123,456.798  
		
		Locale l2 = new Locale("it","IT");  //Italian
		NumberFormat nf2 = NumberFormat.getInstance(l2);
		System.out.println(nf2.format(123456.7984562));   //  123.456,798
		
		
		DateFormat df1 = DateFormat.getDateInstance(0,l1);  
		System.out.println(df1.format(new Date()));        //  Friday, November 24, 2023
		
		
		DateFormat df2 = DateFormat.getDateInstance(0,l2);  // here we can use 0 or 1 or 2 or 3 as the size of the Date decreses Respectively 
		System.out.println(df2.format(new Date()));        // venerdì 24 novembre 2023
		
		df2 = DateFormat.getDateInstance(1,l2);
		System.out.println(df2.format(new Date()));   //   24 novembre 2023
		df2 = DateFormat.getDateInstance(2,l2);
		System.out.println(df2.format(new Date()));   //   24 nov 2023
		df2 = DateFormat.getDateInstance(3,l2);
		System.out.println(df2.format(new Date()));   //   24/11/23
		
		
		ResourceBundle rb = ResourceBundle.getBundle("abc",l1);
		System.out.println(rb.getString("welcome"));
	}

}
