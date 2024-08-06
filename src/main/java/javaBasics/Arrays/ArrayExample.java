package javaBasics.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars = new String[5];
		//String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		//System.out.println(cars);
		cars[0] = "BMW";
		cars[1] = "Swift";
				
		
		/* for (int i=0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		*/
		
		int[] numbers = new int[5];
		//System.out.println(numbers[1]);
		// Default value of an integer is ZERO.
		numbers[0] = 1;
		numbers[1] = 100;
		numbers[2] = 1000;
		numbers[3] = 555;
		numbers[4] = 333;
		int[] newNum = new int[4];
		int index = 3, j=0;
		
		for (int i=0; i < numbers.length; i++) {
			if (i == index){
				continue;
			}
			newNum[j] = numbers[i];
			j++;
		}
		for (int i=0; i < newNum.length; i++) {
		System.out.println(newNum[i]);
		}
	}

}
