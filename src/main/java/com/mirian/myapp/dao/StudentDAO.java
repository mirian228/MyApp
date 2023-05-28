package com.mirian.myapp.dao;

import com.mirian.myapp.model.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student theStudent);

    Student read(int id);

    List<Student> readAll();
    void update(Student theStudent);

    void delete(Student theStudent);
}
