package javaBasics.Inheritance;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner objNum = new Scanner(System.in);
	Scanner objStr = new Scanner(System.in);
	System.out.println("Enter a number to check if it is palindrome or not: ");
	int number = objNum.nextInt();
	checkPalindrome(number);
//=============== Palindrome check of a user input number ================= 
	System.out.println("Please enter yes if you want to continue:");
	String userChoice = objStr.nextLine();
	
	while(userChoice.equals("yes")) {
		System.out.println("Enter a number: ");	
		number = objNum.nextInt();
		checkPalindrome(number);
		System.out.println("Do you want to continue (yes/no):");
		userChoice = objStr.nextLine();
	}
/*
 =============== Table of a user input number ================= 
 
	System.out.println("Enter a number to display the table:");
	int number = obj.nextInt();
	
	for (int i=1; i <= 10;i++) {
		System.out.println(number +" x "+ i + " = " + i*number);
	}
*/	
/*	 =============== Enter user details like name, city, pincode ================= 

	System.out.println("Enter your name:");
	String name = obj.nextLine();
	System.out.println("Enter your city name:");
	String city = obj.nextLine();
	System.out.println("Enter your pin code:");
	int pincode = obj.nextInt();
	System.out.println("Hello "+ name+ ", your city is "+ city + " and your pincode is "+ pincode);
	*/
	objNum.close();
	objStr.close();
	}

	static void checkPalindrome(int number) {
		int num = number;
		int rev = 0, temp = 0;
		while (num>0) {
			temp = num%10;
			rev = (rev*10)+temp;
			num = num/10;
			//System.out.println(rev);
		}
		if (rev == number)
			System.out.println("PALINDROME Number.");
		else
			System.out.println("It is not a palindrome.");
	}
}
