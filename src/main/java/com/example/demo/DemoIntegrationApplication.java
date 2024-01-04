package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoIntegrationApplication.class, args);

		System.out.println("Checking integration completed successfully....");
		printString("CRM Portal Program");
		System.out.println(countNumberOfWord("Checking integration completed successfully...."));
		System.out.println(countNumberOfWord(null));
	}

	public static void printString(String str) {

		if (str != null && str.length() > 1) {
			System.out.println(str);
		}
	}

	public static String countNumberOfWord(String word) {

		int ascii = 0;
		int count = 1;

		if (word != null && word.length() > 1) {
			for (int i = 0; i < word.length(); i++) {

				ascii = word.charAt(i);

				if (ascii == 32) {
					count++;
				}

			}

			// lst.forEach(s->System.out.print(s));

			return "Word Count :" + count;
		}

		return "Invalid String provided";
	}

}
