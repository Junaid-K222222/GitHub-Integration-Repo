package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoIntegrationApplication.class, args);
		
		System.out.println("Checking integration completed successfully....");

		System.out.println(String.format("Although some issue exist in the code.... Need to be resovled.", args));
		
		printString("CRM Portal Program");
	}
	
	public static void printString(String str) {
		
		if(str != null && str.length()>1) {
			System.out.println(str);
		}
	}

}
