//This program is to display sum of n natural numbers by while loop.

package day2Problems.While_Loop_Problem;

import java.util.Scanner;

public class SumofNaturalNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, i = 0, sum = 0;
		System.out.println("Enter the Natural Number: "+"\n");
		try (Scanner scan = new Scanner(System.in)) {
			n = scan.nextInt();
		}
		
		while (i < n)
		{
			i++;
			sum = sum+i;
		}
		
		System.out.println("Sum of first "+n+" Natural Numbers is "+sum);

	}

}
