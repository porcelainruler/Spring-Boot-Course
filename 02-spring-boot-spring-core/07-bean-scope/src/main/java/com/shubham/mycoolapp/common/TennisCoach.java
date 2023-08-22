package com.shubham.mycoolapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach implements Coach {

    // Log constructor call
    public TennisCoach () {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getWorkout() {
        return "Do smash practice for 20 min";
    }
}
