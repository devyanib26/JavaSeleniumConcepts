package javaOops.Inheritance.NetBankingPages;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		int x = obj.nextInt();
		int y = obj.nextInt();
		int z = 0;
		String a = "";
		
		try {
			System.out.println(a.charAt(1));
			z = x/y;
		}
		catch (Exception e){
			e.printStackTrace();
			System.out.println("Exception occurred: "+ e.getMessage());
			z = 5;
		}
		System.out.println("Value of z: "+z);
		obj.close();
	}

}
