class Solution {
    public void rotate(int[] nums, int k) {
        // Edge Case : 
        if(k >= nums.length) {
            k = k % nums.length;
        }

        // Step 1 - Reverse the whole array
        int start = 0;
        int end = nums.length - 1;

        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }

        // Step 2 : Reverse the first k elements
        start = 0;
        end = k - 1;

        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }

        // Step 3 : Reverse the last (n-k) elements
        start = k;
        end = nums.length - 1;

        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }

        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }
} // TC : O(n), SC : O(1)
