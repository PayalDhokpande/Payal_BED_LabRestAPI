package com.greatlearning.collegefest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.collegefest.entity.Student;
import com.greatlearning.collegefest.repository.StudentRepository;




@Service
public  class StudentServiceImplementation implements StudentService {
	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> findAll() {

		// find all the records from the database table
		List<Student> students = studentRepository.findAll();

		return students;
	}

	@Override
	public Student findById(int theId) {

		return studentRepository.findById(theId).get();
	}

	@Override
	public void save(Student theStudent) {

		studentRepository.saveAndFlush(theStudent);
	}

	@Override
	public void deleteById(int theId) {

		studentRepository.deleteById(theId);

	}

}