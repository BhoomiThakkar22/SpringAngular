package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@RestController
@CrossOrigin("*")
public class Controller {
	
	@Autowired
	StudentRepository repo;
	
	@RequestMapping("/api/student/ListAll")
	public List<Student> listAll(){
		return repo.findAll();
	}	
	
	@RequestMapping("api/student/addnewstud")
	@ResponseBody
	public Student addstudent(@RequestBody Student student){
		repo.save(student);
		return student;
	}
	
	@RequestMapping("api/student/delete")
	@ResponseBody
	public Student deletestudent(@RequestBody Student std){
		repo.delete(std);
		return null;
	}
}
