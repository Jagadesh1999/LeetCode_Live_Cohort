// Bruteforce Approach : 
// Use nested loops 

// Better than Bruteforce :
// One array for prefix product
// One array for suffix product
// Res array that holds the product of prefix product and the suffix product

// Optimised Appeoach : (also based on the same prefix and suffix Product Approach)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix = 1; int suffix = 1;
        int[] res = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            res[i] = prefix;
            prefix *= nums[i];
        }

        for(int i = nums.length - 1; i >= 0; i--) {
            res[i] *= suffix;
            suffix *= nums[i];
        }

        return res;
    }
} // TC : O(n)
