package com.shubham.mycoolapp;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getWorkout() {
        return "Do fast bowling practice for 15 min...";
    }
}
