package com.mirian.myapp.dao;

import com.mirian.myapp.model.Student;

import java.util.List;

public interface StudentDAO extends IAbstractDAO<Student>{
    void save(Student theStudent);

    Student readById(int id);

    List<Student> readAll();
    void update(Student theStudent);

    void deleteById(int id);
}
