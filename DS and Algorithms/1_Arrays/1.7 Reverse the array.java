import java.io.*;
import java.util.*;

public class Main
{
	public static void solve(int[] nums) {
	    int start = 0;
	    int end = nums.length-1;
	    
	    while(start < end) {
	        int temp = nums[start];
	        nums[start] = nums[end];
	        nums[end] = temp;
	        
	        start++;
	        end--;
	    }
	    
	    for(int i = 0; i < nums.length; i++) {
	        System.out.print(nums[i] + " ");
	    }
	} // TC : O(n), SC : O(1)
	
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
