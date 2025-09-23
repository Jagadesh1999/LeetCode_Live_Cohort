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
	public static int solve(int[] nums) {
	    int minimum = Integer.MAX_VALUE;
	    int maximum = Integer.MIN_VALUE;
	    
	    for(int i = 0; i < nums.length; i++) {
	        if(nums[i] < minimum) {
	            minimum = nums[i];
	        } else if(nums[i] > maximum) {
	            maximum = nums[i];
	        }
	    }
	    
	    int difference = maximum - minimum;
	    
	    return difference;
	} // TC : O(n), SC : O(1)
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int size = sc.nextInt();
	    
	    int[] nums = new int[size];
	    
	    for(int i = 0; i < size; i++) {
	        nums[i] = sc.nextInt();
	    }
	    
	    int result = solve(nums);
	    
	    System.out.println(result);
	}
} 
