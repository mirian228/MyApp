package com.mirian.myapp.dao;

import com.mirian.myapp.model.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
    public Student read(int id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public void update(Student theStudent) {
    entityManager.flush();
    }

    @Override
    public void delete(Student theStudent) {
        entityManager.detach(theStudent);
    }
}
