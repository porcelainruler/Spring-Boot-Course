package com.shubham.mycoolapp.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CricketCoach implements Coach {
    @Override
    public String getWorkout() {
        return "Do fast bowling practice for 15 min...";
    }
}
