package com.shubham.mycoolapp.dao;

import com.shubham.mycoolapp.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    public List<Student> findAll() {
        // Creating query
        TypedQuery<Student> query = entityManager.createQuery("FROM Student", Student.class);

        return query.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        // Create query
        TypedQuery<Student> query = entityManager.createQuery("FROM Student WHERE lastName=:theLastName", Student.class);

        // Set query parameter
        query.setParameter("theLastName", lastName);

        // Return the list of output students with provided lastName
        return query.getResultList();
    }
}
