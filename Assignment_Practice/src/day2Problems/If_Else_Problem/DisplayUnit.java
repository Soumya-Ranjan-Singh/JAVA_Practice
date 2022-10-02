//This program is to display unit, ten, hundred, thousand by if else statement.

package day2Problems.If_Else_Problem;

import java.util.Scanner;

public class DisplayUnit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter a single digit number: "+"\n");
		int a;
		try (Scanner scan = new Scanner(System.in)) 
		{
			a = scan.nextInt();
		}
		if (a == 1)
			System.out.println("Unit");
		else if (a == 10)
			System.out.println("Ten");
		else if (a == 100)
			System.out.println("Hundred");
		else if (a == 1000)
			System.out.println("Thousand");
		else if (a == 10000)
			System.out.println("Ten Thousands");
		else if (a == 100000)
			System.out.println("One Lakh");
		else
			System.out.println("Invalid Num");

	}

}
