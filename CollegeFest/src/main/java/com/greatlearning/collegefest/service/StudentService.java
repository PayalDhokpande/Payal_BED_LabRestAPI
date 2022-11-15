package com.greatlearning.collegefest.service;

import java.util.List;

import com.greatlearning.collegefest.entity.Student;

public interface StudentService {

	List<Student> findAll();

	Student findById(int theId);

	void save(Student theStudent);

	void deleteById(int theId);

}