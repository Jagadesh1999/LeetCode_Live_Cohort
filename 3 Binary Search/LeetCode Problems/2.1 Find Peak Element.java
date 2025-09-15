/*
11. A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, 
return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater 
than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time.
*/

// Think we can have multiple peaks and the last element of the array could be a peak as well
class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // This is the core logic that handles all cases
            // 1. A downhill slope (nums[mid] > nums[mid+1])
            // 2. The very last element of the array
            if (mid == nums.length - 1 || nums[mid] > nums[mid + 1]) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}

// TC : O(log n)
