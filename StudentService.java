package com.greatlearning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.entity.Student;
import com.greatlearning.repository.StudentRepository;

@Service  //or  @Component
public class StudentService {
	
	@Autowired
	StudentRepository studrepo;

	public Student abc(Student s1) {
		return studrepo.save(s1);
		
	}

}
