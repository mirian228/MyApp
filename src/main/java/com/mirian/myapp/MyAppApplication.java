package com.mirian.myapp;

import com.mirian.myapp.dao.StudentDAO;
import com.mirian.myapp.model.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		//Create student object
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("Paul", "Doe", "paul@gmail.com");
		//Save student object
		System.out.println("Saving the student....");
		studentDAO.save(tempStudent);
		// display id of the saved student
		System.out.println("Saved student. Generated ID:" + tempStudent.getId());
	}



}
