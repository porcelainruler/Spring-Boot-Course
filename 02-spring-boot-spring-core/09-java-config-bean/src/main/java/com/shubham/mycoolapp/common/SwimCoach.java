package com.shubham.mycoolapp.common;

public class SwimCoach implements Coach {

    public SwimCoach () {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getWorkout() {
        return "Swim for 1 km";
    }
}
