// 3. Lowerbound Implementation

import java.io.*;
import java.util.*;

class Main {
    private static int check(int mid, int[] nums, int target) {
        if(nums[mid] >= target) return 1;
        else return 0;
    }
    
    public static int lowerbound(int[] nums, int target) {
        int low = 0; 
        int high = nums.length-1;
        int res = nums.length;
        
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(check(mid, nums, target) == 0) {
                low = mid + 1;
            } else {
                res = mid;
                high = mid - 1;
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int length = sc.nextInt();
        
        int[] nums = new int[length];
        for(int i = 0; i < length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(lowerbound(nums, target));
    }
}
