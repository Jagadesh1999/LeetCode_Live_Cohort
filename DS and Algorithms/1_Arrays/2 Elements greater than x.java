import java.io.*;
import java.util.*;

public class Main
{
	public static int solve(int[] nums, int x) {
	    int count = 0;
	    
	    for(int i = 0; i < nums.length; i++) {
	        if(nums[i] > x) {
	            count++;
	        }
	    }
	    
	    return count;
	} // TC : O(n), SC : O(1)
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int size = sc.nextInt();
	    
	    int[] nums = new int[size];
	    
	    for(int i = 0; i < size; i++) {
	        nums[i] = sc.nextInt();
	    }
	    
	    int x = sc.nextInt();
	    
	    int count = solve(nums, x);
	    
	    System.out.println(count);
	}
} 
