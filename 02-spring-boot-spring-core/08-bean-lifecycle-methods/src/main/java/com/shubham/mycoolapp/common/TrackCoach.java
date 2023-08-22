package com.shubham.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

    // Log constructor call
    public TrackCoach () {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getWorkout() {
        return "Do hard run for 1000 m";
    }
}
