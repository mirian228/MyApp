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
          //  createStudent(studentDAO);
            int id = 1;
            Student foundStudent = studentDAO.readById(id);
            System.out.print("ID: " + foundStudent.getId() + "\n"
					+ "Name: " + foundStudent.getFirstName() + "\n"
					+ "Surname: " + foundStudent.getLastName() + "\n"
					+ "Email: " + foundStudent.getEmail());
            System.out.println(studentDAO.readAll());
           updateStudent(studentDAO);
        };
    }

    private void createStudent(StudentDAO studentDAO) {
        //Create student object
        System.out.println("Creating new student object...");
        Student tempStudent = new Student("Paul", "Doe", "paul@gmail.com");
        Student tempStudent1 = new Student("Jake", "Paul", "jake@gmail.com");
        Student tempStudent2 = new Student("Fisher", "Motor", "fisher@gmail.com");
        Student tempStudent3 = new Student("Gabe", "Newel", "gabe@gmail.com");
        //Save student object
        System.out.println("Saving the student....");
        studentDAO.save(tempStudent1);
        studentDAO.save(tempStudent2);
        studentDAO.save(tempStudent3);
        // display id of the saved student
        System.out.println("Saved student. Generated ID:" + tempStudent.getId());
    }

    private void updateStudent(StudentDAO studentDAO) {
        int studentId = 1;
        System.out.println("Getting student with id: " + studentId);

        Student myStudent = studentDAO.readById(studentId);

        System.out.println("Updating student...");

        myStudent.setFirstName("Andrew");
        studentDAO.update(myStudent);

        System.out.println("Updated student: " + myStudent);

    }
}
