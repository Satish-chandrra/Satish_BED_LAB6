package com.gl.StudentManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.StudentManagement.entity.Student;
import com.gl.StudentManagement.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	@Override
	public Student findById(int theId) {
		return studentRepository.findById(theId).get();
	}

	@Override
	public void save(Student theStudent) {
		studentRepository.save(theStudent);
	}

	@Override
	public void deleteById(int theId) {
		studentRepository.deleteById(theId);
	}

}
