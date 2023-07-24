package com.di.constructorinjection.rest;

import com.di.constructorinjection.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach coach;

    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach coach) {
        System.out.println("In constructor:" + this.getClass().getSimpleName());
        this.coach = coach;
    }


    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }

}
