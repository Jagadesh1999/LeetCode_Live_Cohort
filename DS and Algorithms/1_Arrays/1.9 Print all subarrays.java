import java.io.*;
import java.util.*;

public class Main
{
	public static void solve(int[] nums) { 
	    for(int si = 0; si < nums.length; si++) { // To represent each eligible start index
	        for(int ei = si; ei < nums.length; ei++) { // To represent a group of end indices for each start index
	            for(int idx = si; idx <= ei; idx++) { // To print a subarray in the range of si-ei (both inclusive)
	                System.out.print(nums[idx] + " ");
	            }
	            System.out.println();
	        }
	    }
	} // TC : O(n^3), SC : O(1)
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int size = sc.nextInt();
	    
	    int[] nums = new int[size];
	    for(int i = 0; i < size; i++) {
	        nums[i] = sc.nextInt();
	    }
	    
	    solve(nums);
	}
} 

