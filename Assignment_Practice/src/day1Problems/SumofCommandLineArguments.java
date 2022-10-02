//This program is to get the sum of command line arguments and count the invalid integer entered.

package day1Problems;

import java.util.Scanner;

public class SumofCommandLineArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Method-1:-
		
		/*To run this program you need to right click-->Run as-->Run configurations-->Go to Arguments tab
		provide values by giving a space after each value you have entered.*/
		
		int count = 0, sum = 0;
		System.out.println("Calculates Sum for below Integers");
		for (int i=0; i<args.length; i++)
		{
			try
			{
				sum = sum+Integer.parseInt(args[i]);
			}
			catch (NumberFormatException e)
			{
				count++;
			}
		}
		System.out.println("Sum of command line arguments are "+sum);
		System.out.println("No of invalid integers entered "+count);
		
		//Method-2:-
		//You can directly provide value by scanner input.
		
		int cnt=0, su=0;
		System.out.println("Calculates Sum for below Integers");
		String a,b,c,d,e;
		try (Scanner sc = new Scanner(System.in)) {
			a = sc.next();
			b = sc.next();
			c = sc.next();
			d = sc.next();
			e = sc.next();
		}
		String[] arr= {a,b,c,d,e};
		
		for (int i=0; i<arr.length; i++)
		{
			try
			{
				su = su+Integer.parseInt(arr[i]);
			}
			catch (NumberFormatException t)
			{
				cnt++;
			}
		}
		System.out.println("Sum of command line arguments are "+su);
		System.out.println("No of invalid integers entered "+cnt);

	}

}
