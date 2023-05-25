package com.mirian.myapp.controller;

import com.mirian.myapp.dependencyinjection.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DependencyInjectionController {

    private final Coach myCoach;

    // Using @Qualifier annotation to specify that we want to use CricketCoach class as a dependency injected to Coach, useful when we have multiple dependencies
    @Autowired
    public DependencyInjectionController(@Qualifier("SwimCoach")Coach myCoach) {
        this.myCoach = myCoach;
    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }


}
