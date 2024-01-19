package com.rahul.SpringJDBCAPI.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("empDao")
public class EmployeDaoImpl implements IEmployeeDao {
	
	private static final String SQL_QUERY = "SELECT * FROM employee";
	 List<Employee> empList =null;
	@Autowired
	private  DataSource dataSource;
	private Object connect;
	private String sql;
	
	
	public EmployeDaoImpl(){
		System.out.println("EmployeeDaoImp bean is created");
	}
	

	@Override
	public List<Employee> getTheEmployee() {
		
		System.out.println("DataSource : "+ dataSource.getClass().getName());

		try {
			
			
		Connection connect =	dataSource.getConnection();
		PreparedStatement pstmt = connect.prepareStatement(SQL_QUERY);
	     ResultSet rs = pstmt.executeQuery();
	     empList =new ArrayList();
	     
	     while(rs.next())
	     {
	    	 Employee emp = new Employee();
	    	 
	    	 emp.setId(rs.getInt("id"));
	    	 emp.setCity(rs.getNString("city"));
	    	 emp.setName(rs.getString("name"));
	    	 emp.setSalary(rs.getDouble("salary"));
	    	
	    	
	    	empList.add(emp);
	    	 
	     }
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();	
		}
		return empList;
	}

}
