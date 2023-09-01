package com.shubham.crud.demo.rest;

import com.shubham.crud.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    List<Student> theStudents;

    // This will be called post constructor call only once
    @PostConstruct
    public void loadStudents () {
        this.theStudents = new ArrayList<>();

        this.theStudents.add(new Student("Shubham", "Kumar"));
        this.theStudents.add(new Student("Ankit", "Kumar"));
        this.theStudents.add(new Student("Alok", "Kumar"));
        this.theStudents.add(new Student("God", "Shiva"));
    }

    @GetMapping("/students")
    public List<Student> getStudents () {
        return this.theStudents;
    }
}
