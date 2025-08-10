/*
Given an integer array nums, find a subarray that has the largest product, and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer.

Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
*/

class Solution {
    public int maxProduct(int[] nums) {
        int min_product = nums[0]; int max_product = nums[0];
        int result = nums[0];

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] < 0) {
                int temp = max_product;
                max_product = min_product;
                min_product = temp;
            }

            max_product = Math.max(nums[i], max_product * nums[i]);
            min_product = Math.min(nums[i], min_product * nums[i]);
            result = Math.max(result, max_product);
        }
        return result;
    }
} // TC : O(n)
