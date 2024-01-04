package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoIntegrationApplication.class, args);
		
		System.out.println("Demo Integration of Project with github");
	}

}
