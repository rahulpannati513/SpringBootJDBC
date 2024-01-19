package com.rahul.SpringJDBCAPI;

import java.util.Iterator;
//This program is direct JDBC 
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.rahul.SpringJDBCAPI.dao.EmployeDaoImpl;
import com.rahul.SpringJDBCAPI.dao.Employee;

@SpringBootApplication
public class SpringJdbcapiApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(SpringJdbcapiApplication.class, args);
	
    EmployeDaoImpl emp = context.getBean(EmployeDaoImpl.class);
    
//         List<Employee> list = emp.getTheEmployee();
//          Iterator<Employee> itr = list.iterator();
//          while(itr.hasNext()) {
//        	  System.out.println(itr.next());
//          }
    
//    List<Employee> list = emp.getTheEmployee();
//    list.forEach(em -> System.out.println(em));

    emp.getTheEmployee().forEach(em->System.out.println(em));
    
	
	context.close();
	}

}
