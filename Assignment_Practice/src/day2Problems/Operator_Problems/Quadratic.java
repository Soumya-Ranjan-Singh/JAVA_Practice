//This program is to find the quadratic roots of an equation a*x*x + b*x + c.

package day2Problems.Operator_Problems;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a: "+"\n");
		a = scan.nextInt();
		System.out.println("Enter the value of b: "+"\n");
		b = scan.nextInt();
		System.out.println("Enter the value of c: "+"\n");
		c = scan.nextInt();
		scan.close();
		int delta = b*b-4*a*c;
		System.out.println("Eqaution is: a*x*x + b*x + c"+"\n");
		double x1 = (-b+((double)Math.sqrt(delta)))/(2*a);
		double x2 = (-b-((double)Math.sqrt(delta)))/(2*a);
		System.out.println("Roots of x are: ");
		System.out.print("x1: "+x1);
		System.out.print("x2: "+x2);

	}

}
