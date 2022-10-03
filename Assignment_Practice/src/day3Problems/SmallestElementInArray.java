//This program is to print the smallest element in Array.

package day3Problems;

public class SmallestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {70,50,10,40,90,20,30};
		int min = arr[0];
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i] < min)
				min = arr[i];
		}
		System.out.println("Smallest element present in the above given array is: " + min);

	}

}
