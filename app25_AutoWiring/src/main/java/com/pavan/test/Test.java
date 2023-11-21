package com.pavan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.pavan.config.*;

import com.pavan.controller.StudentController;

import java.util.*;
import java.io.*;

public class Test {

	public static void main(String[] args)throws Exception {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		StudentController studentController = (StudentController)context.getBean("studentController");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("1. ADD");
			System.out.println("2. SEARCH");
			System.out.println("3. UPDATE");
			System.out.println("4. DELETE");
			System.out.println("5. EXIT");
			System.out.print("Your Choice[1,2,3,4,5] :");
			int option = Integer.parseInt(br.readLine());
			
			switch(option)
			{
			case 1:
				studentController.addStudent();
				break;
			case 2:
				studentController.searchStudent();
				break;
			case 3:
				studentController.updateStudent();
				break;
			case 4:
				studentController.deleteStudent();
				break;
			case 5:
				System.out.println("<---Thank you for visiting our application--->");
				System.exit(0);
				break;
			default:
				System.out.println("Enter valid option");
				break;
				
			}
		}
	}

}

//  OUTPUT
/*  //Before
 
	  mysql> select * from studentApp;
	+-------+------------+---------+
	| sid   | sname      | saddr   |
	+-------+------------+---------+
	| s-111 | pavan      | hyd     |
	| 12345 | NITHINANNA | REPAKA  |
	| 123   | pavan      | id      |
	| 159   | rishi      | chenna  |
	| 111   | rishi.k    | newyork |
	+-------+------------+---------+
	5 rows in set (0.00 sec)
  
 */
/* Using Application
  
  	1. ADD
	2. SEARCH
	3. UPDATE
	4. DELETE
	5. EXIT
	Your Choice[1,2,3,4,5] :1
	Student Id:
	101
	Student Name:
	ANNAPAVAN
	Student Address:
	REPAKA
	Student insertion success
	1. ADD
	2. SEARCH
	3. UPDATE
	4. DELETE
	5. EXIT
	Your Choice[1,2,3,4,5] :2
	Student id: 
	134
	Student not exixted
	1. ADD
	2. SEARCH
	3. UPDATE
	4. DELETE
	5. EXIT
	Your Choice[1,2,3,4,5] :2
	Student id: 
	111
	Student Details :
	-----------------
	Student Id    : 111
	Student Name  : rishi.k
	Student Addr  : newyork
	1. ADD
	2. SEARCH
	3. UPDATE
	4. DELETE
	5. EXIT
	Your Choice[1,2,3,4,5] :3
	Student Id:
	123
	Student Name old value: 'pavan' new value: 
	Anil
	Student Addr old value : 'id' new value: 
	WGL
	Student updation successful
	1. ADD
	2. SEARCH
	3. UPDATE
	4. DELETE
	5. EXIT
	Your Choice[1,2,3,4,5] :4
	Student Id:
	150
	Student not existed
	1. ADD
	2. SEARCH
	3. UPDATE
	4. DELETE
	5. EXIT
	Your Choice[1,2,3,4,5] :4
	Student Id:
	159
	Student Deletion success
	1. ADD
	2. SEARCH
	3. UPDATE
	4. DELETE
	5. EXIT
	Your Choice[1,2,3,4,5] :5
	<---Thank you for visiting our application--->
 
 */
/* //After
  
	mysql> select * from studentApp;
	+-------+------------+---------+
	| sid   | sname      | saddr   |
	+-------+------------+---------+
	| s-111 | pavan      | hyd     |
	| 12345 | NITHINANNA | REPAKA  |
	| 123   | Anil       | WGL     |
	| 111   | rishi.k    | newyork |
	| 101   | ANNAPAVAN  | REPAKA  |
	+-------+------------+---------+
	5 rows in set (0.00 sec)
*/
