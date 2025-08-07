// Application of Framework 1 : 
// Problem-1 : Maximum Average Subarray Sum 
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int currSum = 0; int maxSum = Integer.MIN_VALUE; int left = 0; int right = 0;
        while(right < nums.length) {
            // Step 1 : Allow always
            currSum += nums[right];
            
            // Step 2 : Can we remove..!?
            if(right >= k) {
                currSum -= nums[left];
                left++;
            }
            
            // Step 3 : Is it k-sized 
            if(right - left + 1 == k) {
                maxSum = Math.max(maxSum, currSum);
            }
            right++;
        }
        return (double) maxSum / k;
    }
} // TC : O(n)
