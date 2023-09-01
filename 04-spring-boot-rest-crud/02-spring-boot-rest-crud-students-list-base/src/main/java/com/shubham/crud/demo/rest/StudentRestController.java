package com.shubham.crud.demo.rest;

import com.shubham.crud.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getStudents () {
        List<Student> resStudents = new ArrayList<>();

        resStudents.add(new Student("Shubham", "Kumar"));
        resStudents.add(new Student("Ankit", "Kumar"));
        resStudents.add(new Student("Alok", "Kumar"));

        return resStudents;
    }
}
