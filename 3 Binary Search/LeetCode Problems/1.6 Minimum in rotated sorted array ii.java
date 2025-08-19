// 6. Minimum in rotated sorted array ii (The input array contains duplicates)

class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int res = 0;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            
            if (nums[mid] < nums[res]) {
                res = mid;  // Update res when a smaller value is found
            }

            if(nums[mid] == nums[high]) {
                high--;
            } else if(nums[mid] < nums[high]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return nums[res];
    }
} // TC : O(log n)

