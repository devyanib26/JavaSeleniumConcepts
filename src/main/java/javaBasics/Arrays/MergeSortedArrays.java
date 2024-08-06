package javaBasics.Arrays;

import java.util.Arrays;

public class MergeSortedArrays {

	 public static void main(String[] args){
  		MergeSortedArrays msa = new MergeSortedArrays();
		int[][] arr = {{5, 7, 15, 18},{1, 8, 9, 17},{1, 4, 7, 7}};
		msa.merageSortArray(arr);
		
	}

	 public int[] merageSortArray(int[][] arr) {
		int len = arr.length;
    	int size = 0, counter = 0; 

    	for (int i = 0; i < len; i++)
    		size = size + arr[i].length;
    	
    	System.out.println("The total size of the new sorted array would be " + size);
    	
		int[] mergedArr = new int[size];

        // Put the elements in sorted array.
        for (int i = 0; i < len; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
            	mergedArr[counter] = arr[i][j];
            	counter ++;
            }
        }

        // Sort the output array
        Arrays.sort(mergedArr);

        // Print sorted and merged array
        for (int i = 0; i < size; i++)
            System.out.print(mergedArr[i] + " ");
        
        return mergedArr;
	}
		 
		     
}
