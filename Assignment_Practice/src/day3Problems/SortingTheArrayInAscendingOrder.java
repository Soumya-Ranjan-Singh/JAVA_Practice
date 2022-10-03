//This program is to sort the elements of an array in ascending order.

package day3Problems;

public class SortingTheArrayInAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {70,50,10,40,90,20,30};
		System.out.println("Elements of original array: ");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < arr.length; i++)
		{
			int temp=0;
			for(int j = i+1; j < arr.length; j++)
			{
				if (arr[i] > arr[j])
				{
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("\n");
		System.out.println("Elements of array sorted in ascending order: ");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}

	}

}
