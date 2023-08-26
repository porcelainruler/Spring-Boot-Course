package com.shubham.mycoolapp.dao;

import com.shubham.mycoolapp.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDAOImpl implements StudentDAO {

    // Define entityManager for Accessing DB
    private EntityManager entityManager;

    @Autowired
    public StudentDAOImpl (EntityManager entityManager) { this.entityManager = entityManager; }

    // Implement / Override the defined interface methods
    @Override
    @Transactional
    public void save(Student theStudent) {
        this.entityManager.persist((theStudent));
    }

    @Override
    public Student findById(int id) {
        return this.entityManager.find(Student.class, id);
    }
}
