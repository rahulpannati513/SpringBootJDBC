package com.rahul.dao;

import java.util.List;

public interface IStudentDao {
	 //IT IS THE RETURN TYPE OF THE GETSTUDENT BY ID 
	//here we are creating the pojo class refernce and pass the values with id or any attributer
	
	public  StudentTableBo studentTableBo(Integer id);
	public  List<StudentTableBo>  getstudents();
}
