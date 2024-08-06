package javaBasics.Arrays;

import java.util.Arrays;

public class ArraysMinMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraysMinMaxValue mmv = new ArraysMinMaxValue();
		int[] arr = {1, 5,8,9,22,67,998,22,12,0, 88, 3};
		int[] val = mmv.findValue(arr);
		System.out.println("Minimum value is " + val[0]);
		System.out.println("Maximum value is " + val[1]);
		
		System.out.println("Minimum value is " + mmv.minValue(arr));
		System.out.println("Maximum value is " + mmv.maxValue(arr));
		
	}

	public int[] findValue(int arr[]) {
		int len = arr.length;
		int[] values = new int[2];
		values[0] = values[1] = arr[0];
	
	    // Put the elements in sorted array.
	    for (int i = 1; i < len; i++)
	    {
	    	// Minimum value stored at index 0 and Maximum value stored at index 1
	    	if(arr[i] < values[0])
	    		values[0] = arr[i];
	    	if (arr[i] > values[1])
	    		values[1] = arr[i];
	    	System.out.println(arr[i] + "_" + values[0] + "_" + values[1]);
	    }

	    return values;
	}

	public int minValue(int arr[]) {
        // Sort the array
        Arrays.sort(arr);
        return arr[0];        
	}
	
	public int maxValue(int arr[]) {
        // Sort the array
        Arrays.sort(arr);
        return arr[(arr.length)-1];
	}
}
