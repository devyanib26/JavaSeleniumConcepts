package javaBasics.Arrays;

//Rearrange an array such that arr[i] = i
public class RearrangeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RearrangeArray ra = new RearrangeArray();
		int [] arr = {5,4,3,2,1,0,9,8,7,6};
		ra.fixedArray(arr);
	}

	public void fixedArray(int[] arr) {
		int len = arr.length;
		int val = 0;
		int [] arrOut = new int[len];
		for (int i=0; i< len; i++) {
			val = arr[i];
			arrOut[val] = val;
			}
		// Print an array
		for (int i=0; i<arrOut.length; i++)
			System.out.println(arrOut[i]);

	}
}
