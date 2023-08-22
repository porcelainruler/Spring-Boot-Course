package com.shubham.mycoolapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    // Constructor injection for coach
    @Autowired
    public DemoController(Coach thisCoach) { myCoach = thisCoach; }

    @GetMapping("/getWorkout")
    public String getDailyWorkout() {
        return myCoach.getWorkout();
    }
}
