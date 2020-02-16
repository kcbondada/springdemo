package com.springboot.student.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	 @RequestMapping("/student")
	 public List<Student> studDetails() {
		 return Arrays.asList(
				 new Student(1,"kalyan"),
				 new Student(2,"chay")
				 );
		 
		 
	 }

}
 