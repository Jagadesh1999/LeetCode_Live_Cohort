// 8. Find the pivot index of the array - LeetCode

/*. 
Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of 
all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. 
This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.
*/

// Approach : 
// Step 1 : Compute the cummulative sum
// Step 2 : Check if the prefixSum - nums[i] is equals to the cummulative sum - prefixSum
// Step 3 : Return the index if the condition is true. If no such element, return -1.

// Approach : 
// Step 1 : Compute the cummulative sum
// Step 2 : Check if the prefixSum - nums[i] is equals to the cummulative sum - prefixSum
// Step 3 : Return the index if the condition is true. If no such element, return -1.

class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1000000007;
        int currentPrefixSum = 0; int diff = 0; int res = 0;
        int oddSum = 0; int evenSum = 1;

        for(int i = 0; i < arr.length; i++) {
            currentPrefixSum += arr[i]; 

            if(currentPrefixSum % 2 == 0) {
                res = (res + oddSum) % MOD;
                evenSum++;
            } else {
                res = (res + evenSum) % MOD;
                oddSum++;
            }
        }
        return res;
    }
} // TC : O(n)
