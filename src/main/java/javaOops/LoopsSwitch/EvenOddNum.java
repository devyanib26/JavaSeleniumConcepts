package javaOops.LoopsSwitch;

public class EvenOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ========= Find if a number is ODD/EVEN.========= 

		int i = 98;
		if ((i%2) == 0)
			System.out.println("This is EVEN number.");
		else
			System.out.println("This is ODD number.");
		
		// ========= Find largest number from given 3 numbers.========= 
		
		int x=105, y=95, z=88;
		if (x>y && x>z)
			System.out.println("X is the largest number.");
		else if (y>z)
			System.out.println("Y is the largest number.");
		else
			System.out.println("Z is the largest number.");
		
	}

}
