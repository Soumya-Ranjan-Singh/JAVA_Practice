//This program is to print the elements of an array in reverse order.

package day3Problems;

public class ReverseOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {10,20,30,40,50};
		System.out.println("Array Original Sequence: ");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
		System.out.println("Array in Reverse Order Sequence: ");
		for (int i = arr.length-1; i >= 0; i--)
		{
			System.out.print(arr[i] + " ");
		}

	}

}
