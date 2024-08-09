package com.connect.service;

import com.connect.ddo.Student;

public interface iStudentService {
	
	String save(Student student);
	
	Student findById(Integer sid);
	
	String updateById(Student student);
	
	String deleteById(Integer sid);
	
}
