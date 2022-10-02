//This program is to display sum of n natural numbers by for loop.

package day2Problems.For_Loop_Problem;

import java.util.Scanner;

public class SumofNaturalNosByForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, sum = 0;
		System.out.println("Enter the Natural Number: "+"\n");
		try (Scanner scan = new Scanner(System.in)) {
			n = scan.nextInt();
		}
		
		for (int i=0; i <= n; i++)
		{
			sum = sum+i;
		}
		
		System.out.println("Sum of first "+n+" Natural Numbers is "+sum);

	}

}
