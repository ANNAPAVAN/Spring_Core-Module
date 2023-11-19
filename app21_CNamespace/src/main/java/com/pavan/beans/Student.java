package com.pavan.beans;

public class Student {
	String sid;
	String sname;
	String saddr;
	Course course;
	public Student(String sid,String sname,String saddr,Course course)
	{
		this.sid=sid;
		this.sname=sname;
		this.saddr=saddr;
		this.course=course;
	}
	
	public void getStudentDetails()
	{
		System.out.println("Student Details ");
		System.out.println("Student Id   : "+sid);
		System.out.println("Student Name : "+sname);
		System.out.println("Student Addr : "+saddr);
		System.out.println("Student course Details ");
		System.out.println("Course Id   : "+course.getCid());
		System.out.println("Course Name : "+course.getCname());
		System.out.println("Course Cost : "+course.getCcost());
		
	}

}
