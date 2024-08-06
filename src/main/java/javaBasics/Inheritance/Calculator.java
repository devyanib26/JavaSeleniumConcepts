package javaBasics.Inheritance;

public class Calculator {

	//=========== Inheritance ===============
	public void add(int x, int y) {
		System.out.println("Sum of 2 numbers: "+ (x+y));
	}
	public void subtract(int x, int y) {
		System.out.println("Subtraction of 2 numbers: "+ Math.abs(x-y));
	}
	public void divide(int x, int y) {
		System.out.println("Dividend of 2 numbers: "+ (x*y));

}
	public void multiply(int x, int y) {
		System.out.println("Multiplication of 2 numbers: "+ (x/y));

}
}
