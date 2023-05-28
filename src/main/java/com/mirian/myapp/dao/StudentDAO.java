package com.mirian.myapp.dao;

import com.mirian.myapp.model.Student;

public interface StudentDAO {
    void save(Student theStudent);

    Student read(int id);

    void update(Student theStudent);

    void delete(Student theStudent);
}
