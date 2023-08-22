package com.shubham.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Override
    public String getWorkout() {
        return "Do smash practice for 20 min";
    }
}
