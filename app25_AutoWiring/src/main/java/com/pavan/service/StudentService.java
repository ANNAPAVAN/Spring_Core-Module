package com.pavan.service;

import com.pavan.dto.*;

public interface StudentService {
	public String addStudent(Student student);
	public Student searchStudent(String sid);
	
	public String updateStudent(Student student);
	public String deleteStudent(String sid);
	
}
