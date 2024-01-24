package com.rahul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rahul.dao.CourseInfo;
import com.rahul.dao.SpringJdbc;

@Component
public class StudentCommandLineInterface implements CommandLineRunner {	
	@Autowired
	private SpringJdbc springJdbc;
	@Override
	public void run(String... args) throws Exception {	
		springJdbc.insert(new CourseInfo(1,"Spring"));
		springJdbc.insert(new CourseInfo(2,"Java"));
		springJdbc.insert(new CourseInfo(3,"Hibernate"));
		
		springJdbc.deleteById(2);
		System.out.println(springJdbc.findById(1));
		System.out.println(springJdbc.findById(3));
		
		//springJdbc.findById(1);
		

	}

}
