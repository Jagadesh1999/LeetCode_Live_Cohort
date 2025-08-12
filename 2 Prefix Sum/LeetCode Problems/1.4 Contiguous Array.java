4. Contiguous Array - LeetCode
/*
Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.
Example 1:

Input: nums = [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1. */

// One‑line memory trick : 
// Same prefix sum seen again → subarray sum is zero.
// Earliest time you saw it = longest route back.
// Latest time you saw it = shorter route.

class Solution {
    public int findMaxLength(int[] nums) {
        int currentPrefixSum = 0; int length = 0; int maxLength = 0; 

        Map<Integer, Integer> map = new HashMap<>();

        // Before we began, we had prefix sum 0 at a virtual position -1.
        // This ensures subarrays starting from the very first element are counted correctly for length.
        map.put(0, -1);

        // Key idea - transform all the 0s in the nums array to 1
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) nums[i] = -1;
        }

        // Now, the question reduces to finding the length of the longest subarray whose sum is 0
        for(int i = 0; i < nums.length; i++) {
            currentPrefixSum += nums[i];

            if(map.containsKey(currentPrefixSum)) {
                length = i - map.get(currentPrefixSum);
                maxLength = Math.max(maxLength, length);
            } else {
                map.put(currentPrefixSum, i);
            }
        }
       return maxLength; 
    }
} // TC : O(n)
