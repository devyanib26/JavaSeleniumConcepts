package javaBasics.Inheritance;

public class MainOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Main Method");
	}
	public static void main(String args) {
		// TODO Auto-generated method stub
		System.out.println("Method having only string as argument");

	}
	
	public static void main(String[] args, String arg) {
		// TODO Auto-generated method stub
		System.out.println("Method having string array and one string as argument");
	}
	
	public static void main(int[] args, String[] arg) {
		// TODO Auto-generated method stub
		System.out.println("Method having integer array and string array as argument");
	}
}
