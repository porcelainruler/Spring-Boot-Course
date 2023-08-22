package com.shubham.mycoolapp.rest;

import com.shubham.mycoolapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // Dependency declaration
    private Coach myCoach;

    // Another dependency for scope check of initialised beans
    private Coach anotherCoach;

    // Constructor injection for coach
    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach thisCoach, @Qualifier("cricketCoach") Coach theAnotherCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = thisCoach;
        anotherCoach = theAnotherCoach;
    }

    @GetMapping("/getWorkout")
    public String getDailyWorkout() {
        return myCoach.getWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans -> myCoach == anotherCoach " + (myCoach ==  anotherCoach);
    }
}
