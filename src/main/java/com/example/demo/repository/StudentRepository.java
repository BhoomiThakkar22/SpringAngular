package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	@Query("from Student s where s.id=:id")
	Student findOne(@Param(value="id")Integer id);
	
}
