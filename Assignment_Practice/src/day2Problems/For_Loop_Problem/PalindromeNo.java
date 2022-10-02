//This program is to check the no if it is palindrome or not by for loop.

package day2Problems.For_Loop_Problem;

import java.util.Scanner;

public class PalindromeNo {

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
		
		if (a == rev)
			System.out.println("Entered no "+a+" is a Palindrome Number");
		else
			System.out.println("Entered no "+a+" is not a Palindrome Number");

	}

}
