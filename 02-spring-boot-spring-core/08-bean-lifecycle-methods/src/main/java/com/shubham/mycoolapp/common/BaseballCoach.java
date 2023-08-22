package com.shubham.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    // Log constructor call
    public BaseballCoach () {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getWorkout() {
        return "Do batting practice for a hour";
    }
}
