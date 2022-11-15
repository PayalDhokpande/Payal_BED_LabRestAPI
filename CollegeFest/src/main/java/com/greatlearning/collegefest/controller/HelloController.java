package com.greatlearning.collegefest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatlearning.collegefest.entity.Student;
import com.greatlearning.collegefest.service.StudentService;

@Controller
public class HelloController {
	@Autowired
	private StudentService studentService;

	// add mapping for "/list"

	@RequestMapping("/")
	public String listStudents(Model theModel) {

		// get Students from db
		List<Student> theStudents = studentService.findAll();

		// add to the spring model
		theModel.addAttribute("Student", theStudents);

		return "list-Students";
	}

}
