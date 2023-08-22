package com.shubham.mycoolapp.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    // Log constructor call
    public CricketCoach () {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getWorkout() {
        return "Do fast bowling practice for 15 min...";
    }
}
