//This program is to get your name from command line argument

package day1Problems;

import java.util.Scanner;

public class GetNameByUsingCommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Method-1:-
		/*To run this program you need to right click-->Run as-->Run configurations-->Go to Arguments tab
		provide your name*/
		
		for (int i=0;i<args.length;i++)
		{
			System.out.print(args[i]+" ");
		}
		
		//Method-2:-
		//You can directly provide value by scanner input.
		
		String name;
		System.out.println("Enter your name");
		try (Scanner sc = new Scanner(System.in)) {
			name = sc.nextLine();
		}
		System.out.println("Your name is "+name);
	}

}
