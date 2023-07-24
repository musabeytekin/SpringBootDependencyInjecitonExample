package com.di.constructorinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@SpringBootApplication(
		scanBasePackages = {"com.di.constructorinjection", "com.di.util"}
)
*/

@SpringBootApplication
public class ConstructorInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConstructorInjectionApplication.class, args);
	}

}
