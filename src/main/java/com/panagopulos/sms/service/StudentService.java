package com.panagopulos.sms.service;

import java.util.List;

import com.panagopulos.sms.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
}
