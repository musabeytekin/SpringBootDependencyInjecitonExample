package com.di.constructorinjection.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // her di için ayrı nesne oluşturur.
public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println("In constructor:" + this.getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
