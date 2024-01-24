package com.rahul.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SpringJdbc 
{
	//private static final String SQL_QUERY = " INSERT INTO STUDENT(id,name,city) values(1,rahul,Gdk)";
	
	private static final String SQL_QUERY = "insert into course(cid,cname) Values(?,?)";


	private static final String DELETE_QUERY = "delete from course where cid=?";


	private static final String SELECT_QUERY = "select cid , cname from  course where cid =?";
	
	
	@Autowired   
	private JdbcTemplate jdbc;
//	
//	public void insert() {
//		jdbc.update(SQL_QUERY);
//	}
	
//	public void insert(CourseInfo info) {
//		System.out.println("Implementing Class of JDBCTemplate :"+jdbc.getClass().getName());
//		jdbc.update(SQL_QUERY,info.getClass(),info.getCname());
//	}

	public void insert(CourseInfo info) {
		System.out.println("Implementing Class of JDBCTemplate :"+jdbc.getClass().getName());
//		jdbc.update(SQL_QUERY,info.getCid(),info.getCname());
		
		int rowsAffected = jdbc.update(SQL_QUERY,info.getCid(),info.getCname());
		System.out.println("Rows Affected :"+rowsAffected);
		}
	
	
	
	public void deleteById(long id) {
		jdbc.update(DELETE_QUERY,id);
		System.out.println("Record delete with id "+id +"Num of records deleted :"+id);
	}
	
	public CourseInfo findById(long id) {
		return jdbc.queryForObject(SELECT_QUERY,new BeanPropertyRowMapper<>(CourseInfo.class),id);
	}

}
