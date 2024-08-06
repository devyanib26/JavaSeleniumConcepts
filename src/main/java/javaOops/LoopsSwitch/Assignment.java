package javaOops.LoopsSwitch;

public class Assignment {

	void findLargestNumber(int x, int y, int z) {
		if (x>y && x>z)
			System.out.println("The largest number is "+x);
		else if (y>z)
			System.out.println("The largest number is "+y);
		else
			System.out.println("The largest number is "+z);
	}
	
	void swapNumbers(int x, int y) {
		int z=x;
		x=y;
		y=z;
		System.out.println("The value of first number is "+ x + " and value of second number is "+y);
	}

	String dayOfWeek(int day) {
		switch(day) {
		case 1: System.out.println("Sunday"); return ("Sun");
		//break;
		case 2: System.out.println("Monday");return ("Mon");
		//break;
		case 3:	System.out.println("Tuesday");return ("Tues");
		//break;
		case 4:	System.out.println("Wednesday");return ("Wed");
		//break;
		case 5:	System.out.println("Thursday");return ("Thu");
		//break;
		case 6:	System.out.println("Friday");return ("Fri");
		//break;
		case 7:	System.out.println("Saturday");return ("Sat");
		//break;
		default: System.out.println("Invalid Input. Please enter a valid input between 1 and 7."); return ("Invallid");
		//break;
		}
	}

	void findDivisableNumber(int x, int y) {
			for(int k=1;k<=100; k++) {
				if (k%x == 0) 
					if (k%y == 0) {
						System.out.println(k + " is divisable by "+ x + " and "+ y);
				}
			}
	}
	
}
