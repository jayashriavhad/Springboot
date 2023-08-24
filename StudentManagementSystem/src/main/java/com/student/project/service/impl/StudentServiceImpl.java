package com.student.project.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.project.entity.Student;
import com.student.project.repository.StudentRepository;
import com.student.project.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	// dependancy injection
	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
	}

}
