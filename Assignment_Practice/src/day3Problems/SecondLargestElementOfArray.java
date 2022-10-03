//This program is to find 2nd Largest Number in an Array.

package day3Problems;

import java.util.Arrays;

public class SecondLargestElementOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {20,70,50,10,40,90,20,30};
		int size = arr.length;
		int secondMax = getSecondLargest(arr, size);
		
		//from method-1
		System.out.println("Second Largest element present in the above given array is: " + secondMax);
		System.out.println("\n");
		
		//from method-2
		int seMax = getSeLargest(arr, size);
		System.out.println("Second Largest element present in the above given array is: " + seMax);
		
	}
	
	//Method-1: By sorting
	public static int getSecondLargest(int[] a, int total){  
		for (int i = 0; i < total; i++)
		{
			int temp =0;
			for (int j = i+1; j < total; j++)
			{
	            if (a[i]>a[j])
	            {
	               temp = a[i];
	               a[i] = a[j];
	               a[j] = temp;
	            }
			}
		}
		int secondMax = a[total-2];
		return secondMax;
	}
	
	//Method-2: Implementing Arrays class
	public static int getSeLargest(int[] b, int tot) {
		Arrays.sort(b);  
		int seMax = b[tot-2]; 
		return seMax;
	}

}
