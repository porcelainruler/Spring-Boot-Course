package com.shubham.mycoolapp.dao;

import com.shubham.mycoolapp.entity.Student;
import org.springframework.stereotype.Component;

public interface StudentDAO {
    void save(Student theStudent);

    Student findById(int id);
}
