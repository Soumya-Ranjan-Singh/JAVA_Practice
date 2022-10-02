package day2Problems.For_Loop_Problem;

import java.util.Scanner;

public class palin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter no");
		Scanner sc = new Scanner(System.in);
			String n = sc.nextLine();
			sc.close();
			String r="";
			for (int i=n.length()-1; i>=0; i--)
			{
				r=r+n.charAt(i);
			}
			System.out.println(r);
			if (r.equals(n))
			{
				System.out.println("Palindrome");
			}
			else
				System.out.println("Not Palindrome");

	}

}
