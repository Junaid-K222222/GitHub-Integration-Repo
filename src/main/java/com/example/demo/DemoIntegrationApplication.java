package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoIntegrationApplication {

	/**
	 * Main Method For Logics
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		SpringApplication.run(DemoIntegrationApplication.class, args);

		// System.out.println("Checking integration completed successfully....");
		// printString("CRM Portal Program");
		// System.out.println(countNumberOfWord("Checking integration completed
		// successfully...."));
		// System.out.println(countNumberOfWord(null));

		// convertCamelCase("APPLICATION");

		printString("------------------------------------------------------------");
		System.out.println(convertCamelCaseString("application is now started..."));
		printString("------------------------------------------------------------");

	}

	/**
	 * 
	 * @param str
	 * @return
	 */
	
	public static String convertCamelCaseString(String str) {
		StringBuilder newString = new StringBuilder();
		if (str != null && str.length() > 1) {

			String array[] = str.split(" ");
			for (int i = 0; i < array.length; i++) {
				newString.append(makeWordCamelCase(array[i]));
				newString.append(" ");
			}

			return newString.toString();
		}

		return " ";
		
	}

	/**
	 * 
	 * @param str
	 * @return
	 */
	
	public static String makeWordCamelCase(String str) {

		if (str != null && str.length() > 1) {
			str = str.replaceFirst(str.charAt(0) + "", ((char) (((int)str.charAt(0)) - 32)) + "");
			return str;
		}
		
		return " ";
	}

	/**
	 * 
	 * @param str
	 * @return
	 */
	public static String convertCamelCase(String str) {

		if (str != null && str.length() > 3) {

			for (int i = 0; i < str.length(); i++) {

				System.out.print((char) ((int)str.charAt(i)) + 32 + "==");
			}
		}

		return "Invalid String provided";
	}

	/**
	 * Used for Print String Pass argument give result
	 * 
	 * @param str
	 */
	public static void printString(String str) {

		if (str != null && str.length() > 1) {
			System.out.println(str);
		}
	}

	/**
	 * Check Number of words in a string
	 * 
	 * @param word
	 * @return
	 */
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
			return "Word Count :" + count;
		}

		return "Invalid String provided";
	}

}
