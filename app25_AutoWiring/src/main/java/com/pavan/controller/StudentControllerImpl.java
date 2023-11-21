package com.pavan.controller;

import com.pavan.dto.Student;
import org.springframework.stereotype.*;

import com.pavan.service.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;

@Controller("studentController") //if you want to get StudentControllerImpl object use this as id in applicationContext.xml
public class StudentControllerImpl implements StudentController {
	BufferedReader br=null;
	
	@Autowired
	private StudentService studentService;
	
	public StudentControllerImpl()
	{
		try {
			br=new BufferedReader(new InputStreamReader(System.in));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Override
	public void addStudent() {
		try {
			System.out.println("Student Id:");
			String sid=br.readLine();
			System.out.println("Student Name:");
			String sname=br.readLine();
			System.out.println("Student Address:");
			String saddr=br.readLine();
			
			Student student= new Student();
			student.setSid(sid);
			student.setSname(sname);
			student.setSaddr(saddr);
			
			String status = studentService.addStudent(student);
			
			if(status.equals("existed"))
			{
				System.out.println("Student already exists");
			}
			if(status.equals("success"))
			{
				System.out.println("Student insertion success");
			}
			if(status.equals("failure"))
			{
				System.out.println("Student insertion failure");
			}
				
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void searchStudent() {
		try {
			System.out.println("Student id: ");
			String sid=br.readLine();
			Student student = studentService.searchStudent(sid);
			
			if(student==null)
			{
				System.out.println("Student not exixted");
			}
			else
			{
				System.out.println("Student Details :");
				System.out.println("-----------------");
				System.out.println("Student Id    : "+student.getSid());
				System.out.println("Student Name  : "+student.getSname());
				System.out.println("Student Addr  : "+student.getSaddr());
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateStudent() {
		try {
			System.out.println("Student Id:");
			String sid = br.readLine();
			Student student = studentService.searchStudent(sid);
			if(student==null)
			{
				System.out.println("Student not exixted");
			}
			else
			{
//				System.out.println("Student Id              : "+student.getSid());
				System.out.println("Student Name old value: '"+student.getSname()+"' new value: ");
				String sname = br.readLine();
				System.out.println("Student Addr old value : '"+student.getSaddr()+"' new value: ");
				String saddr = br.readLine();
				
				student.setSname(sname);
				student.setSaddr(saddr);
				
				String status = studentService.updateStudent(student);
				if(status.equals("success"))
				{
					System.out.println("Student updation successful");
				}
				else
				{
					System.out.println("Student updation Failed");
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteStudent() {
		try {
			System.out.println("Student Id:");
			String sid = br.readLine();
			String status = studentService.deleteStudent(sid);
			
			if(status.equals("success"))
			{
				System.out.println("Student Deletion success");
			}
			if(status.equals("failue"))
			{
				System.out.println("student deletion failure");
			}
			if(status.equals("notexisted"))
			{
				System.out.println("Student not existed");
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}

}
