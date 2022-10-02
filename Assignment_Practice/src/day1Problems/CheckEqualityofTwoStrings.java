//This program is to check whether two strings are equal or not.

package day1Problems;

public class CheckEqualityofTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Soumya";
		String b = "Soumya";
		String c = "Ranjan";
		System.out.println("String a"+a);
		System.out.println("String b"+b);
		System.out.println("String c"+c);
		
		//Method- 1 (By means of if else block)
		if (a == b)
		{
			System.out.println("Above a & b strings are equal");
		}
		else if (a == c)
		{
			System.out.println("Above a & c strings are equal");
		}
		else if (b == c)
		{
			System.out.println("Above b & c strings are equal");
		}
		else
		{
			System.out.println("Above two strings are not equal");
		}
		
		//Method- 2 (By means of boolean value i.e - if equal then print true otherwise print false.
		boolean d = a.equals(b);
		boolean e = a.equals(c);
		boolean f = b.equals(c);
		System.out.println("Above a & b are eqaul "+d);
		System.out.println("Above a & c are eqaul "+e);
		System.out.println("Above b & c are eqaul "+f);

	}

}
