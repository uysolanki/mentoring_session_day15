package com.greatlearning.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.entity.Student;
import com.greatlearning.service.StudentService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class ElectronicsController {
	
	@Autowired
	StudentService studservice;

	@PostMapping("/addStudent")
	public Student addStudent(
			@RequestParam("a") int x,
			@RequestParam("b") String y,
			@RequestParam("c") double z)
		{
		Student s1=new Student();
		s1.setRno(x);
		s1.setSname(y);
		s1.setPer(z);
		return studservice.abc(s1);
	}
	
	
	@PostMapping("/addStudentByObject")
	public Student addStudent(@RequestBody Student s1)
		{
		return studservice.abc(s1);
	    }
	
	@RequestMapping("/getStudent")
	public Student getStudent()
	{
		Student s1=new Student();
		s1.setRno(101);
		s1.setSname("Alice");
		s1.setPer(78.5);
		return s1;
	}
	
	@RequestMapping("/getStudents")
	public List<Student> getStudents()
	{
		List<Student> students=new ArrayList<>();
		students.add(new Student(101,"Alice",78.5));
		students.add(new Student(102,"Ben",78.5));
		students.add(new Student(103,"Chris",78.5));
		return students;
		
	}
	
	@RequestMapping("/testdev")
	public String testdev()
	{
		return "testdev";
	}
}
