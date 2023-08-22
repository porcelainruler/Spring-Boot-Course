package com.shubham.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    @Override
    public String getWorkout() {
        return "Do batting practice for a hour";
    }
}
