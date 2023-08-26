package com.shubham.mycoolapp.dao;

import com.shubham.mycoolapp.entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;

public interface StudentDAO {
    void save(Student theStudent);

    Student findById(int id);

    List<Student> findAll();

    List<Student> findByLastName(String lastName);

    void update (Student student);

    void delete (int id);

    int deleteAll ();
}
