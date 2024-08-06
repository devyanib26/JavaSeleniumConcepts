package javaOops.LoopsSwitch;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Palindrome sequence - The number/string is reversible and same.
	int number = 1234321;
	String str = String.valueOf(number);
//	String str = "devyani";

	int len = str.length()/2, len1 = str.length()-1;
	boolean flag = false;
	char arr[]=str.toCharArray();
	
	for(int i=0; i<len;i++) {
//		System.out.println(arr[i]+ " "+ arr[len1]);
		if (arr[i]== arr[len1])	{
			len1--;
			flag = true;
		}
		else
			flag = false;
	}
	
	if (flag == true)
			System.out.println("The number/string "+str +" is a Palindrome sequence.");
	else
		System.out.println("The number/string "+str +" is NOT a Palindrome sequence.");
	
	}

}
