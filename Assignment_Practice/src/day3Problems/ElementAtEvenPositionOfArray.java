//This program is to print the elements of an array present on an even position.

package day3Problems;

public class ElementAtEvenPositionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//For an array even position starts from index 1 because array starts from 0 index.
		int [] arr = {25,11,70,22,50,12,48,57,34,89};
		for (int i = 1; i < arr.length; i += 2)
		{
			System.out.print(arr[i] +" ");
		}

	}

}
