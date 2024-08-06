package javaBasics.Inheritance;

public class Car {
	private String color;
	private int year;
	private String name;
	
	void display() {
		System.out.println("The car name is " + name+ color+ year);
	}
	
	void setName(String input) {
		name = input;
	}
 
}
