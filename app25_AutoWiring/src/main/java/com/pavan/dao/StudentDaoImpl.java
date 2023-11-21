package com.pavan.dao;

import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;
import javax.sql.DataSource;
import java.sql.*;



import com.pavan.dto.Student;

//@Component("studentDao")  //like id attribute in bean , here "studentDao" used to get StudentDaoImpl object
@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private DataSource dataSource;
	
	@Override
	public String add(Student student) {
		String status="";
		
		try {
			Connection con = dataSource.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from studentApp where SID=?");
			pst.setString(1, student.getSid());
			ResultSet rs = pst.executeQuery();
			boolean b=rs.next();
			if(b==true)
			{
				status="existed";
			}
			else
			{
				pst = con.prepareStatement("insert into studentApp values(?,?,?);");
				pst.setString(1,student.getSid() );
				pst.setString(2,student.getSname() );
				pst.setString(3,student.getSaddr() );
				int rowCount = pst.executeUpdate();
				if(rowCount==1)
				{
					status="success";
				}
				else
				{
					status="failure";
				}
			}
		}catch(Exception e)
		{
			status="failure";
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public Student search(String sid) {
		Student student = null;
		try {
			Connection con = dataSource.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from studentApp where sid=?");
			pst.setString(1,sid);
			ResultSet rs = pst.executeQuery();
			boolean b = rs.next();
			
			if(b==true)
			{
				student  = new Student();
				student.setSid(rs.getString("sid"));
				student.setSname(rs.getString("sname"));
				student.setSaddr(rs.getString("saddr"));
				
			}
			else
			{
				student=null;
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return student;
	}

	@Override
	public String update(Student student) {
		String status="";
		try {
			Connection con = dataSource.getConnection();
			PreparedStatement pst = con.prepareStatement("update studentApp set sname=? , saddr=? where sid=? ");
			pst.setString(1, student.getSname());
			pst.setString(2, student.getSaddr());
			pst.setString(3, student.getSid());
			int rowCount = pst.executeUpdate();
			if(rowCount==1)
			{
				status="success";
			}
			else
			{
				status = "failure";
			}
		}catch(Exception e)
		{
			status = "failure";
			e.printStackTrace();
		}

		return status;
	}

	@Override
	public String delete(String sid) {
		String status="";
		try {
			Connection con =  dataSource.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from studentApp where sid=?");
			pst.setString(1, sid);
			ResultSet rs = pst.executeQuery();
			boolean b = rs.next();
			if(b==true)
			{
				pst = con.prepareStatement("delete from studentApp where sid=?");
				pst.setString(1, sid);
				int rowCount = pst.executeUpdate();
				if(rowCount==1)
				{
					status="success";
				}
				else
				{
					status="failure";
				}
				
			}
			else
			{
				status = "notexisted";
			}
			
		}catch(Exception e)
		{
			status = "failure";
			e.printStackTrace();
		}
		return status;
	}

}
