package com.mirian.myapp.dao;

import com.mirian.myapp.model.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {
    private final EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }

    @Override
    public Student readById(int id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> readAll() {
        TypedQuery<Student> query = entityManager.createQuery("From Student", Student.class);
        List<Student> students = query.getResultList();
        return students;
    }

    @Override
    @Transactional
    public void update(Student theStudent) {
        entityManager.merge(theStudent);
    }

    @Override
    @Transactional
    public void deleteById(int StudentId) {
        entityManager.detach(StudentId);
    }
}
