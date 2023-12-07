package com.panagopulos.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.panagopulos.sms.entity.Student;
import com.panagopulos.sms.repository.StudentRepository;
import com.panagopulos.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;

	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}



	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
	
	@Override
	public Student saveStudent(Student student)  {
		return studentRepository.save(student);
	}

}