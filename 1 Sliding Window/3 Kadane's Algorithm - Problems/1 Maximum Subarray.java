Given an integer array nums, find the subarray with the largest sum, and return its sum.
Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.

/*
The brute force approach will take us O(n^2) to pick each of the subarray one by one and compute the sum to find the max sum for this problem
*/

// Kadane's Algorithm :
class Solution {
    public int maxSubArray(int[] nums) {
        int curr_sum = nums[0]; int result_sum = nums[0];

        for(int i = 1; i < nums.length; i++) {
            curr_sum += nums[i];
            if(curr_sum < nums[i]) {
                curr_sum = nums[i];
            }
            
            result_sum = Math.max(result_sum, curr_sum);
        }
        return result_sum;
    }
} //TC : O(n)
