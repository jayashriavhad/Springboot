package com.student.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.student.project.entity.Student;
import com.student.project.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		
//		Student student1=new Student("Jayashri","Avhad","jay11@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2=new Student("sakshi","sanap","sak12@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3=new Student("pranjal","jadhav","pran11@gmail.com");
//		studentRepository.save(student3);
//		
		
		
	}

}
