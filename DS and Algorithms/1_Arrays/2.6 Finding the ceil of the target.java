import java.io.*;
import java.util.*;

public class Main {
	public static void solve(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= target) {
                result = mid;
                high = mid - 1;
            } else { 
                low = mid + 1;
            }
        }
        System.out.println(result);
    }

	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int size = sc.nextInt();
	    
	    int[] nums = new int[size];
	    for(int i = 0; i < size; i++) {
	        nums[i] = sc.nextInt();
	    }
	    
	    int target = sc.nextInt();
	    
	    solve(nums, target);
	}
} 
