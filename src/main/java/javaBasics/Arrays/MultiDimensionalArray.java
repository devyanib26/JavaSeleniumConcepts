package javaBasics.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbers = {{1,2,3,4}, {10, 20, 30}};
		
		//System.out.println(numbers[1][1]);
		//System.out.println(numbers.length);
		
		for (int i=0; i< numbers.length;i++) {
			for (int j=0; j <numbers[i].length;j++) {
				System.out.print(numbers[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
