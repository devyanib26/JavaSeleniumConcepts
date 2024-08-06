package javaBasics.Inheritance;

public class NewCalculator extends Calculator{
	public void add(int x, int y, int z) {
		System.out.println("Sum of 3 numbers: "+ (x+y+z));
	}
	public void multiply(int x, int y, int z) {
		System.out.println("Multiplication of 3 numbers: "+ (x*y*z));
	}
}
