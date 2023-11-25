package com.pavan.beans;

public class MyString {
	public static void reverseString(String str)
	{
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
	}
}
