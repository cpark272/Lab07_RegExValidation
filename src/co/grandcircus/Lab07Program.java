package co.grandcircus;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Lab07Program {

	public static void main(String[] args) {
		
		// Sets up Scanner class to input data from user
		Scanner scan = new Scanner(System.in);
		
		// Prompts user to enter a valid name
		System.out.print("Please enter a valid name: ");
		String userName = scan.next();
		
		// Outputs the result of the name validator
		System.out.println(checkName(userName));
		
		// Prompts user to enter an valid email
		System.out.print("\nPlease enter a valid email: ");
		String userEmail = scan.next();
		
		// Outputs the result of the email validator
		System.out.println(checkEmail(userEmail));
		
		// Prompts user to enter a valid phone number
		System.out.print("\nPlease enter a valid phone number: ");
		String userPhone = scan.next();
		
		// Outputs the result of the phone number validator
		System.out.println(checkPhone(userPhone));
		
		// Prompts user to enter a valid date
		System.out.print("\nPlease enter a valid date: ");
		String userDate = scan.next();
		
		// Outputs the result of the date validator
		System.out.println(checkDate(userDate));
		
		scan.close();
		
	}
	
	// This method will validate the name of the user
	public static String checkName(String name) {
		
		boolean nameResult = Pattern.matches("[A-Z]{1}[a-z]{1,29}", name);
		
		if (nameResult == true) {
			return "Name is valid!";
		} else {
			return "Sorry, name is not valid!";
		}
		
	}
	
	// This method will validate the email of the user
	public static String checkEmail(String email) {
		
		boolean emailResult = Pattern.matches("[a-z0-9]{5,30}@[a-z0-9]{5,10}.[a-z0-9]{2,3}", email);
		
		if (emailResult == true) {
			return "Email is valid!";
		} else {
			return "Sorry, email is not valid!";
		}
		
	}
	
	// This method will validate the phone number of the user
	public static String checkPhone(String phone) {
		
		boolean phoneResult = Pattern.matches("\\d{3}-\\d{3}-\\d{4}", phone);
		
		if (phoneResult == true) {
			return "Phone is valid!";
		} else {
			return "Sorry, phone is not valid!";
		}
		
	}
	
	// This method will validate the date entered by the user
	public static String checkDate(String date) {
		
		boolean dateResult = Pattern.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}", date);
		
		if (dateResult == true) {
			return "Date is valid!";
		} else {
			return "Sorry, date is not valid!";
		}
		
	}

}
