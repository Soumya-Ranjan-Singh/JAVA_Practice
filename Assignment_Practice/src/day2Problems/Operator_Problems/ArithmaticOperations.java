//This program is to find maximum and minimum after doing some arithmetic operations.

package day2Problems.Operator_Problems;

import java.util.Scanner;

public class ArithmaticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a: "+"\n");
		int a = scan.nextInt();
		System.out.print("Enter b: "+"\n");
		int b = scan.nextInt();
		System.out.print("Enter c: "+"\n");
		int c = scan.nextInt();
		scan.close();
		double d = a+b*c;
		double e = c+a/b;
		double f = a%b+c;
		double g = a*b+c;
		System.out.println("First Operation: "+d);
		System.out.println("Second Operation: "+e);
		System.out.println("Third Operation: "+f);
		System.out.println("Fourth Operation: "+g);
		
		//method-1
		
		if(d > e && d > f && d > g)
			System.out.println("Max Number: "+d);
		else if(e > f && e > g)
			System.out.println("Max Number: "+e);
		else if(f > g)
			System.out.println("Max Number: "+f);
		else
			System.out.println("Max Number: "+g);
		if(d < e && d < f && d < g)
			System.out.println("Min Number: "+d);
		else if(e < f && e < g)
			System.out.println("Min Number: "+e);
		else if(f < g)
			System.out.println("Min Number: "+f);
		else
			System.out.println("Min Number: "+g);
		
		//Derived from method-2
		
		double max = max(d, e, f, g);
		double min = min(d, e, f, g);
		System.out.println("Max Number is: "+max);
		System.out.println("Min Number is: "+min);
				
	}

	//method-2

	public static double max(double d, double e, double f, double g){
		return (d>e && d>f && d>g? d: e>f && e>g? e: f>g? f:g);
	}
	public static double min(double d, double e, double f, double g){
		return (d<e && d<f && d<g? d: e<f && e<g? e: f<g? f:g);
	}
}
