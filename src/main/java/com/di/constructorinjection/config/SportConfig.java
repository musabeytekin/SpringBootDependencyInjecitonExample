package com.di.constructorinjection.config;

import com.di.constructorinjection.common.Coach;
import com.di.constructorinjection.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    // use @Bean("aquatic") for costom bean id
    @Bean // default bean id is method name
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
