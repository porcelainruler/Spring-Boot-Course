package com.shubham.mycoolapp.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // In Prototype scope new bean is generated for all component classes in dependency injection
public class CricketCoach implements Coach {

    // Log constructor call
    public CricketCoach () {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    // Init Operations
    @PostConstruct
    public void doSomeStartUpTasks () {
        System.out.println("In <doSomeStartUpTasks()>: " + getClass().getSimpleName());
    }

    // Before destroy clean up tasks
    @PreDestroy
    public void doSomeCleanUpTasks () {
        System.out.println("In <doSomeCleanUpTasks()>: " + getClass().getSimpleName());
    }

    @Override
    public String getWorkout() {
        return "Do fast bowling practice for 15 min";
    }
}
