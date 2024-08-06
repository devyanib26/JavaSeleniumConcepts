package javaOops.LoopsSwitch;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 123456789;
		String str = String.valueOf(number);
//		String str = "devyani";
		char arr[] = str.toCharArray();
		String reverseArr = "";
		int len = str.length()-1;
		
		for(int i=0; i<= len;i++) {
			reverseArr = reverseArr+arr[len-i];
		}
	System.out.println("The reverse sequence of a given number/string is "+reverseArr +".");
	System.out.println(Math.round(93));
	for (int x=1; x <1000; x++) {
		
	int num = x;
	int rev=0;
	int temp;
	int number1 = num;
	
	while (num > 0) {
		temp = num%10;
		rev = (rev*10) + temp;
		num = num/10;
	}
	if (number1 == rev) {
	System.out.println(rev);
	}
	
	}
	}
	
}
	
