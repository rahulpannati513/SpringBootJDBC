package com.rahul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.rahul.dao.StudentDaoImpl;
import com.rahul.dao.StudentTableBo;

@SpringBootApplication
public class SpringJdbcLastAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJdbcLastAppApplication.class, args);
		StudentDaoImpl dao = context.getBean(StudentDaoImpl.class);
		 StudentTableBo bo = dao.studentTableBo(1);//this studentTableBo is comming from interface 
		 System.out.println(bo);
		 
		dao.getstudents().forEach(data -> System.out.println(data));
	}

}
