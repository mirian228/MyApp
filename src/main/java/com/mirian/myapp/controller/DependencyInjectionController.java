package com.mirian.myapp.controller;

import com.mirian.myapp.dependencyinjection.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DependencyInjectionController {

    private final Coach myCoach;

    @Autowired
    public DependencyInjectionController(Coach myCoach) {
        this.myCoach = myCoach;
    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }


}
