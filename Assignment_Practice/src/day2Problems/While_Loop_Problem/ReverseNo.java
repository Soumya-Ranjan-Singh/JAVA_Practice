//This program is to reverse the no and print it by while loop.

package day2Problems.While_Loop_Problem;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, a, rev = 0;
		System.out.println("Enter the number: "+"\n");
		try (Scanner scan = new Scanner(System.in)) {
			n = scan.nextInt();
		}
		a = n;
		
		while (n != 0)
		{
			int rem = n%10;
			rev = (rev*10)+rem;
			n = n/10;
		}
		
		System.out.println("Reverse of the number "+a+" is "+rev);

	}

}
