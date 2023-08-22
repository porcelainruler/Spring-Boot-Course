package com.shubham.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
    @Override
    public String getWorkout() {
        return "Do hard run for 1000 m";
    }
}
