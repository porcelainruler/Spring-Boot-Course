package com.shubham.crud.demo.rest;

import com.shubham.crud.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/students/{studentId}")
    public Student getSingleStudent (@PathVariable int studentId) {

        if (studentId < 0 || studentId >= this.theStudents.size()) {
            throw new StudentNotFoundException("Student not found for id - " + studentId);
        }

        return theStudents.get(studentId);
    }

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException (StudentNotFoundException exc) {
        StudentErrorResponse res = new StudentErrorResponse();

        res.setStatus(HttpStatus.NOT_FOUND.value());
        res.setMessage(exc.getMessage());
        res.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(res, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException (Exception exc) {
        StudentErrorResponse res = new StudentErrorResponse();

        res.setStatus(HttpStatus.BAD_REQUEST.value());
        res.setMessage(exc.getMessage());
        res.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(res, HttpStatus.BAD_REQUEST);
    }
}
