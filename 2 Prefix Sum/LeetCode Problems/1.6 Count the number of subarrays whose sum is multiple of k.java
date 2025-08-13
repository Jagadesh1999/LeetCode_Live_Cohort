/*
6. Given an integer array nums and an integer k, return true if nums has a good subarray or false otherwise.

A good subarray is a subarray where:

its length is at least two, and
the sum of the elements of the subarray is a multiple of k.
Note that:

A subarray is a contiguous part of the array.
An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k.
 

Example 1:

Input: nums = [23,2,4,6,7], k = 6
Output: true
Explanation: [2, 4] is a continuous subarray of size 2 whose elements sum up to 6.
*/

// If prefixSum[j]%k == prefixSum[i]%k;
// then, (prefixSum[j]−prefixSum[i]) mod k=0
// That says, Subarray sum from i+1 to j == multiples of k

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int currentPrefixSum = 0; int length = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for(int i = 0; i < nums.length; i++) {
            currentPrefixSum += nums[i];
            int mod_currentPrefixSum = currentPrefixSum % k;
            if(mod_currentPrefixSum < 0) mod_currentPrefixSum += k;

            if(map.containsKey(mod_currentPrefixSum)) {
                length = i - map.get(mod_currentPrefixSum);
                if(length >= 2) return true;
            } else {
                map.put(mod_currentPrefixSum, i);
            }
        }
        return false;
    }
} // TC : O(n)
