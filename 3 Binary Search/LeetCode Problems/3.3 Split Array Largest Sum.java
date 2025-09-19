/*
Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.
Return the minimized largest sum of the split.
A subarray is a contiguous part of the array.

Example 1:

Input: nums = [7,2,5,10,8], k = 2
Output: 18
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.
*/

class Solution {
    public int splitArray(int[] nums, int k) {
        // Step 1 - Edge case
        if (k > nums.length) { 
            return -1;
        }

        // Step 2 - Search Space Estimations 
        int maximum = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > maximum) {
                maximum = nums[i]; 
            }
        }

        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int low = maximum;
        int high = sum;
        int result = -1;

        // Step 3 - Binary Search on answer
        while(low <= high) {
            int mid = low + (high - low) / 2;
            long groupsNeeded = 1;
            long currentSum = 0;
            boolean possible = true;

            // Step 4 - The Feasibilty Check
            for(int i = 0; i < nums.length; i++) {
                if(currentSum + nums[i] > mid) {
                    groupsNeeded++;
                    currentSum = nums[i];
                    if(groupsNeeded > k) {
                        possible = false;
                        break;
                    }
                } else {
                    currentSum += nums[i];
                }
            }

            if(groupsNeeded <= k) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
} // TC : O(n * log s)
