//This program is to print the duplicate elements of an array.

package day3Problems;

public class DuplicateElementsOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {10,20,10,80,50,20,20,30,60};
		System.out.println(" Array elents are : ");
		System.out.println("--------------------");
		for (int element: array)
		{
			System.out.print(element + " ");
		}
		System.out.println("\n");
		System.out.println(" Duplicate Elements of the above array : ");
		System.out.println("-----------------------------------------");
		for (int i = 0; i < array.length; i++)
		{
			for (int j = i+1; j < array.length; j++)
			{
				if (array[i] == array[j])
				{
					System.out.print(array[j] +" ");
				}
				
			}
			
		}

	}

}
