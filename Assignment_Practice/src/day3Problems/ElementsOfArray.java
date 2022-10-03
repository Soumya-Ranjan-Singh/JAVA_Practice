//This program is to print all the elements of an array.

package day3Problems;

public class ElementsOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,2,3,4,5};
		
		//Method-1
		for (int element: array)
		{
			System.out.print(element + " ");
		}
		
		//Method-2
		System.out.println("\n");
		for (int i=0; i<array.length; i++)
		{
			System.out.print(array[i] +" ");
		}

	}

}
