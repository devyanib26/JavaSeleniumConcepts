package javaBasics.Arrays;

public class RecursiveCompute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursiveCompute rc = new RecursiveCompute();
		System.out.println("Sum = " + rc.computeByString(7));
		System.out.println("Sum = " + rc.computeByString(4));
		System.out.println("Sum = " + rc.computeByNumber(7));
		System.out.println("Sum = " + rc.computeByNumber(4));
		
	}

	public int computeByString(int x) {
		int sum = 0;
		String str = "";
		for (int i=1; i<= 4; i++) {
			str = str + Integer.toString(x);
			System.out.println(str);
			sum = sum + Integer.parseInt(str);
		}
		return sum;
	}

	public int computeByNumber(int x) {
		int sum = x, num = x;
		for (int i=1; i< 4; i++) {
			x = x*10 + num;
			System.out.println(x);
			sum = sum + x;
		}
		return sum;
	}
}

