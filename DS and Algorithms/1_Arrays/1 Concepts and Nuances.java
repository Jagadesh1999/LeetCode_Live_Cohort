/*
Arrays :
-- Data structure that is used to store values of similar datatypes in a contiguous memory location.
-- Elements are accessed with the help of indices.
-- Array indices starts from 0.
*/

import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Array Size Input
		int size = sc.nextInt(); 
		
		// Array Declaration
		int[] nums = new int[size]; 
		
		// Array Initialization
		for(int i = 0; i < size; i++) { 
		    nums[i] = sc.nextInt();
		} 
		
		// Printing the elements of the array
		for(int i = 0; i < size; i++) {
		    System.out.print(nums[i] + " ");
		}
	}
} // TC : O(n), SC : O(1)
