import java.io.*;
import java.util.*;

// Brute Force Approach :
// For each subarray, calculate the sum and keep updating the max sum

// Optimsed Approach : Kadane's Algorithm - O(n)

// Observations : 
// -- If all the elements of the array are positive, then their sum is the maximum subarray sum

// arr = [-, -, +, +, +] - sum of the last three

// arr = [+, -, +, +, +] :
// If the addition of first 2 is positive, then max is the sum of all.
// Else, max would be either 1st or the sum of the last three.

public class Main
{
	public static void solve(int[] nums, int k) { 
	    int sum = 0;
	    int maxSum = Integer.MIN_VALUE;
	    
	    for(int i = 0; i < nums.length; i++) {
	        if(sum >= 0) {
	            sum += nums[i];
	        }
	        else {
	            sum = nums[i];
	        }
	        maxSum = Math.max(sum, maxSum);
	    }
	    System.out.println(maxSum);
	} 
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int size = sc.nextInt();
	    
	    int[] nums = new int[size];
	    for(int i = 0; i < size; i++) {
	        nums[i] = sc.nextInt();
	    }
	    
	    int k = sc.nextInt();
	    
	    solve(nums, k);
	}
} 
