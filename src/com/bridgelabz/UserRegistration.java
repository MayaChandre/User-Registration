package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	// Last name must start with Capital letter and has minimum 3 length
	
	public static void main(String[] args) {
		System.out.println("Welcome to User-Registration");
		System.out.println("Enter Last Name of User::");
		Scanner sc = new Scanner(System.in);
		String lastName = sc.next();


		String regex = "^[A-Z]([a-z]{2})+$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		boolean result = matcher.matches();
		if (result)
			System.out.println("Valid lastName");
		else
			System.out.println("Invalid lasttName");
		sc.close();
		
	}

}
