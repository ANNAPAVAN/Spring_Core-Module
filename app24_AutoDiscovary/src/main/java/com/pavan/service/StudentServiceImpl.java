package com.pavan.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.pavan.dto.Student;
import org.springframework.stereotype.*;
import com.pavan.dao.*;

@Service("studentService") //on base of this name("studentService") only we get StudentServiceImpl object ,it is like id in bean tag
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public String addStudent(Student student) {
		String status  = studentDao.add(student);
		return status;
	}

	@Override
	public Student searchStudent(String sid) {
		Student student = studentDao.search(sid);
		return student;
	}



	@Override
	public String updateStudent(Student student) {
		String status = studentDao.update(student);
		return status;
	}

	@Override
	public String deleteStudent(String sid) {
		String status = studentDao.delete(sid);
		return status;
	}

}
