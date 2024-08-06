package javaOops.LoopsSwitch;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ========= Print a Table of 7.========= 
		int x = 1 ;
		
		while (x <= 10) {
			System.out.println("7 x "+x+ " = "+(7*x));
			x++;
		}
		
		// ========= Print a list of number. ========= 
		x = 1;
		do {
			System.out.println(x);
			x++;
		}
		while (x > 10) ; 

		// ========= Print a list of numbers in reverse order.========= 
		int y=0;
		for (y=10; y>0; y--)
		{
			System.out.println(y);
		}

		// ========= Print a table of 5.========= 
		int z=0;
		for (z=1; z<=10; z++)
		{
			//if ((z*5)%2 != 0)
			if (z==2) 
			{continue;}
			
		System.out.println("5 x "+ z+ " = "+z*5);
		
			if (z==8)
				{break;}
		}
System.out.println("Outside the for LOOP");
/*		
		// ========= Find biggest number of the given array.========= 
		int arr[] = {5, 15, 68, 3, 45, 22, 12};
		
		System.out.println(arr.length);
		int p=0, q=0, r=0;
		while (p < arr.length)
		{
			r++;
			if ((r < arr.length) && (arr[p] > q))
				q=arr[p];
			p++;
		}
		
		System.out.println("Biggest array number is "+q);
*/
	}

}
