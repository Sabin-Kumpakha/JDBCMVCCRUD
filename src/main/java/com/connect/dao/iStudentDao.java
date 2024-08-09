package com.connect.dao;

import com.connect.ddo.Student;

public interface iStudentDao {
	
	String save(Student student);
	
	Student findById(Integer sid);
	
	String updateById(Student student);
	
	String deleteById(Integer sid);
}
