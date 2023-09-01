package com.shubham.crud.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestGlobalExceptionHandler {
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
