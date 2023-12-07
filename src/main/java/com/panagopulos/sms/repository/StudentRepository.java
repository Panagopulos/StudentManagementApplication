package com.panagopulos.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.panagopulos.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
