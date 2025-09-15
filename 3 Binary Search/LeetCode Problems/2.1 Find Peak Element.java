/*
11. A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, 
return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater 
than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time.
*/

class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // This is the key change to prevent out-of-bounds error
            if (mid < nums.length - 1 && nums[mid] < nums[mid + 1]) {
                // We are on an uphill slope, so the peak is to the right.
                low = mid + 1;
            } else {
                // We are on a downhill slope or at the very end of the array.
                // This could be a peak.
                result = mid;
                high = mid - 1;
            }
        }
        return result;
    }
}

// TC : O(log n)
