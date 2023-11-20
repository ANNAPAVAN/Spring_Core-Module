package com.pavan.dao;

import com.pavan.dto.Student;

public interface StudentDao {
	//CRUD operations
	public String add(Student student);
	public Student search(String sid);
	public String update(Student student);
	public String delete(String sid);
	
}
