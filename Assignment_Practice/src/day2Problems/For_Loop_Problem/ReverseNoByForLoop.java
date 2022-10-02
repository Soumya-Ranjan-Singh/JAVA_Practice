//This program is to reverse the no and print it by for loop.

package day2Problems.For_Loop_Problem;

import java.util.Scanner;

public class ReverseNoByForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, a, rev = 0;
		System.out.println("Enter the number: "+"\n");
		try (Scanner scan = new Scanner(System.in)) {
			n = scan.nextInt();
		}
		a = n;
		
		for( ;n != 0; n=n/10)   
		{  
			int rem = n % 10;  
			rev = rev * 10 + rem;  
		}
		
		System.out.println("Reverse of the number "+a+" is "+rev);

	}

}
