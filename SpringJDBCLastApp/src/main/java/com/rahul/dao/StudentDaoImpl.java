package com.rahul.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements IStudentDao {
	
	private static final String SQL_QUERY = "select sid, sname , scity from student where sid=?";
	private static final String SQL_QUERY2 = "select * from student";
	@Autowired
	private  JdbcTemplate jdbcTemplate;

//	private static class RowMapperImp implements RowMapper<StudentTableBo>
//	{
//
//		@Override
//		public StudentTableBo mapRow(ResultSet rs, int rowNum) throws SQLException {
//			//normal approach 
//			return null;
//		} the 30 line new RowMapper and this class is same in advance way we doing directly there onluy
	
//		
//	}
	@Override
	public StudentTableBo studentTableBo(Integer id) {
		// we are using jdbc template
		
	//	jdbcTemplate.queryForObject(SQL_QUERY, new RowMapper<StudentTableBo>() {
//
//			@Override
//			public StudentTableBo mapRow(ResultSet rs, int rowNum) throws SQLException {
//				 StudentTableBo bo =  new StudentTableBo();
////				 int id=rs.getInt(1); below and this code are same
////				 bo.setSid(id);
//				 bo.setSid(rs.getInt(1));
//				 bo.setSname(rs.getString("SNAME"));
//				 bo.setSname(rs.getString("SCITY"));
//				return bo;
//			} this is one of implementation we can use lambda aswell
//			},id);
		 return jdbcTemplate.queryForObject(SQL_QUERY,( rs,rowNum)->{
				 StudentTableBo bo =  new StudentTableBo();
//				 int id=rs.getInt(1); below and this code are same
//				 bo.setSid(id);
				 bo.setSid(rs.getInt("sid"));
				 bo.setSname(rs.getString("SNAME"));
				 bo.setSname(rs.getString("SCITY"));
				return bo;
			} 
			,id);
		
		
		
		
	}
	public List<StudentTableBo> getstudents() {

		 return (List<StudentTableBo>) jdbcTemplate.query(SQL_QUERY2,( rs,rowNum)->{
				 StudentTableBo bo =  new StudentTableBo();

				 bo.setSid(rs.getInt("sid"));
				 bo.setSname(rs.getString("SNAME"));
				 bo.setSname(rs.getString("SCITY"));
				return bo;
			} 
			);
		
		
		
		
	}
//it is a plain POJO class nothing here no logic only 
//declaration for accesing and setting


}



//package com.rahul.dao;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class StudentDaoImpl implements IStudentDao {
//
//    private static final String SQL_QUERY = "SELECT sid, sname, scity FROM student WHERE sid=?";
//    
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    @Override
//    public StudentTableBo studentTableBo(Integer id) {
//        // Using jdbcTemplate to query for a single object based on the provided SQL query and parameters
//        // Lambda expression is used as a concise way to implement the RowMapper interface
//
//        // Correcting the method to return the result of the jdbcTemplate query
//        return jdbcTemplate.queryForObject(SQL_QUERY, (rs, rowNum) -> {
//            // Mapping the result set to a StudentTableBo object
//            StudentTableBo bo = new StudentTableBo();
//            bo.setSid(rs.getInt("sid"));
//            bo.setSname(rs.getString("sname"));
//            bo.setScity(rs.getString("scity"));
//            return bo;
//        }, id);
//    }
//}
//

