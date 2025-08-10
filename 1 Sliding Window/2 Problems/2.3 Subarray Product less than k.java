// 13. Subarray Product less than K
// Given an array of integers nums and an integer k, return the number of contiguous subarrays where the product of 
// all the elements in the subarray is strictly less than k.

// Example 1:

// Input: nums = [10,5,2,6], k = 100
// Output: 8
// Explanation: The 8 subarrays that have product less than 100 are:
// [10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
// Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int tail = 0; int head = -1; 
        int currProduct = 1;
        int total_subarrays = 0;

        while(tail < nums.length) {
            while(head + 1 < nums.length && (currProduct * nums[head + 1] < k)) {
                head++;
                currProduct = currProduct * nums[head];
            }

            total_subarrays += head - tail + 1;

            if(tail > head) {
                tail++;
                head = tail - 1;
                currProduct = 1;
            } else {
                currProduct = currProduct / nums[tail];
                tail++;
            }
        }
        return total_subarrays;
    }
} // TC : O(n)

