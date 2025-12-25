package week3.Day2.HW;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		
		// Given Array
		int[] array = {1, 4, 3, 2, 8, 6, 7}; 
		
		// Step 1: Sort the array
		Arrays.sort(array);
		
		// Step 2: Loop through the array to find the missing element
		for(int i=0; i<array.length; i++)
		{
			if(array[i] != i+1) // Check if the expected value is missing
			{
				System.out.println("Missing Number: " + (i+1));
				break; // Stop after finding the missing number
			}
		}

	}

}
