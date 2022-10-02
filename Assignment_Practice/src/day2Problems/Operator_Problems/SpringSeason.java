//This program is to check whether the month and date falls in between March 20 to June 20.

package day2Problems.Operator_Problems;

import java.util.Scanner;

public class SpringSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month,date;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter month: "+"\n");
		month = scan.nextInt();
		System.out.println("Enter date: "+"\n");
		date = scan.nextInt();
		scan.close();
		boolean a=false;
		
		if (month == 3)
		{
			if(date >= 20 && date <= 31)
			{
				a=true;
			}
			System.out.println(a);
		}
		else if (month == 4)
		{
			if(date>=1 && date<=30)
			{
					a=true;
			}	
			System.out.println(a);
		}
		else if(month==5)
		{
			if(date>=1 && date<=31)
			{
				a=true;
			}
			System.out.println(a);
		}
		else if(month==6)
		{
			if(date>=1 && date<=20)
			{
				a=true;
			}
			System.out.println(a);
		}
		else
			System.out.println(a);

	}

}
