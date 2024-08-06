package javaOops.LoopsSwitch;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Prime Number: a number that is divisible only by itself and 1. 
// A prime number is a natural number greater than 1 that cannot be formed by multiplying two smaller natural numbers. 
// A natural number greater than 1 that is not prime is called a composite number.
		boolean flag = false;
	
/*		int number = 73;
		
		for(int i=2;i<= number/2; i++) {
			if (number%i == 0) {
				flag = true;
				System.out.println("divided by "+i);
			}
		}
		if (flag == true)
			System.out.println("The number "+ number + " is NOT a Prime Number.");
		else
			System.out.println("The number "+ number + " is a Prime Number.");
*/

	// ================ Print a list of 100 prime numbers ===========
		int x = 0;
		for(int j=2;j<= 10000; j++) {
			for(int k=2;k<= j/2; k++) {
				if (j%k == 0) {
					flag = true;
					//System.out.println("divided by "+k);
				}
			}
			if (flag == false) {
				x++;
				System.out.println(x+". "+ j + " is a Prime Number.");	
			}
			flag=false;
			if (x==100)
				break;
		}

	}
}
