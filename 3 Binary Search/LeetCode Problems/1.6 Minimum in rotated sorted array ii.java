// 6. Minimum in rotated sorted array ii (The input array contains duplicates)

class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while(low < high) {
            int mid = low + (high - low) / 2;

            if(nums[mid] < nums[high]) {
                high = mid;
            } else if(nums[mid] == nums[high]) {
                high--;
            } else {
                low = mid + 1;
            }
        }    
        return nums[high];
    }
} // TC : O(log n)
