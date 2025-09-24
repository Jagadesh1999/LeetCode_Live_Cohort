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
} // TC : O(log n)

// public static int[] FindFloorAndCeil(int[] arr, int target){
//         int n = arr.length;

//         int si = 0;
//         int ei = n-1;
//         int floor = Integer.MIN_VALUE;
//         int ceil = Integer.MAX_VALUE;

//         while(si <= ei){
//             int mid = (si + ei)/2;

//             if(arr[mid] == target){
//                 floor = arr[mid];
//                 ceil = arr[mid];
//                 break;
//             } else if(arr[mid] < target){
//                 floor = arr[mid];
//                 si = mid + 1;
//             } else {
//                 ceil = arr[mid];
//                 ei = mid - 1;
//             }
//         }

//         return new int[]{floor, ceil};
//     }
