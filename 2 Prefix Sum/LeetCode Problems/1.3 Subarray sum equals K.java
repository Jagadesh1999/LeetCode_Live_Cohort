// 3. Subarray sum equals K - LeetCode

/*
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
A subarray is a contiguous non-empty sequence of elements within an array.

Example 1:
Input: nums = [1,1,1], k = 2
Output: 2
*/

class Solution {
    public int subarraySum(int[] nums, int k) {
        int currentPrefixSum = 0; int diff = 0; int res = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Initialisation - to handle subarrays that start from 0th index and sum upto k.


        for(int i = 0; i < nums.length; i++) {
            currentPrefixSum += nums[i]; // current prefix sum till index i

            // Compute the diff, check the frequency in the map, add to result
            diff = currentPrefixSum - k;
            if(map.containsKey(diff)) {
                res += map.get(diff);
            }

            // Update the map
            map.put(currentPrefixSum, map.getOrDefault(currentPrefixSum, 0) + 1);
        }
        return res;
    }
} // TC : O(n)

// Dry run : 
// nums = [1, 1, 1], k = 2

// currentPrefixSum = 0; diff = 0; res = 0;
// Map : ((0, 1))

// i = 0 :
    // currentPrefixSum = 0 + 1 = 1

    // diff = 1 - 2 = -1
    // -1 !present in the map

    // Map : ((0, 1), (1, 1))

// i = 1 :
    // currentPrefixSum = 0 + 1 + 1 = 2
    
    // diff = 2 - 2 = 0
    // map contains diff, so res += 1

    // Map : ((0, 1), (1, 1), (2, 1))

// i = 2 :
    // currentPrefixSum = 2 + 1 = 3

    // diff = 3 - 2 = 1
    // map contains diff, so res += 1

    // Map : ((0, 1), (1, 1), (2, 1), (3, 1))

// res = 2


