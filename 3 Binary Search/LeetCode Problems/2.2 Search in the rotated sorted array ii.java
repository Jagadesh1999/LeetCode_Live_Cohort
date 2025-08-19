// 12. Search in the rotated sorted array (Duplicates Version) - LeetCode

// Different scenarios :
// 1. If the middle element is the target
// 2. If the middle element is the same as that of both low and high
// 3. If the left portion is sorted (contains nested conditionals inside)
// 4. If the right portion is sorted (contains nested conditionals inside)

class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        boolean targetIsPresent = false;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            
            if(nums[mid] == target) {
                targetIsPresent = true;
                return targetIsPresent;
            } else if(nums[low] == nums[mid] && nums[mid] == nums[high]) {
                    low++;
                    high--;
            } else if(nums[low] <= nums[mid]) {
                if(nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if(nums[mid] <= nums[high]) {
                if(nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return targetIsPresent;
    }
} // TC : O(log n)
