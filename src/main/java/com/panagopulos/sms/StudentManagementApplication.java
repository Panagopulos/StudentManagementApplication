package com.panagopulos.sms;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.panagopulos.sms.entity.Student;
import com.panagopulos.sms.repository.StudentRepository;



@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
	try {	
		//Check if students already exist
		if (studentRepository.count()== 0) { 
		Student student1 = new Student("Tomas", "Panagopulos", "tpanagopulos@gmail.com");
		studentRepository.save(student1);
		
		Student student2 = new Student("Marian", "Gacik", "Mariangacik@gmail.com");
		studentRepository.save(student2);
		
		Student student3 = new Student("tony", "stark" , "starkmarvel@gmail.com");
		studentRepository.save(student3);
		}
	}  catch (Exception e) {
        // Handle the exception (log it, throw a custom exception, etc.)
        e.printStackTrace();
     }
  }
}

	