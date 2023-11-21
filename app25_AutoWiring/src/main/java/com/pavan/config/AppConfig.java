package com.pavan.config;

import org.springframework.context.annotation.*;
import com.pavan.dao.*;
import com.pavan.service.*;
import com.pavan.controller.*;
import org.apache.commons.dbcp2.BasicDataSource;
import javax.sql.DataSource;

@Configuration 
public class AppConfig {
	
    @Bean
    public DataSource dataSource() {
    	BasicDataSource dataSource=null;
    	try {
        dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/db");
        dataSource.setUsername("root");
        dataSource.setPassword("Mysql134"); // Replace ******** with your actual password
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	return dataSource;
    }
    
	@Bean
	public StudentDao studentrDao()
	{
		StudentDao studentDao = new StudentDaoImpl();
		return studentDao;
	}
	
	@Bean
	public StudentService studentService()
	{
		StudentService studentService = new StudentServiceImpl();
		return studentService;
	}
	
	@Bean
	public StudentController studentController()
	{
		StudentController studentController = new StudentControllerImpl();
		return studentController;
	}
}
