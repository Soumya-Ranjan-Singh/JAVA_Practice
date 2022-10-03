//This program is to print the largest element in Array.

package day3Problems;

public class LargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {70,50,10,40,90,20,30};
		int max = arr[0];
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i] > max)
				max = arr[i];
		}
		System.out.println("Largest element present in the above given array is: " + max);

	}

}
