/*
11. A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, 
return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater 
than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time.
*/

class Solution {
    public int check(int mid, int[] nums) {
        if(mid != nums.length-1 && nums[mid] > nums[mid + 1]) return 1;
        else if(mid != nums.length-1 && nums[mid] < nums[mid + 1]) return 0;
        else return 1;
    }

    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int res = -1;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(check(mid, nums) == 0) {
                // Peak is guaranteed on the right
                low = mid + 1; 
                res = mid + 1; // Potential Peak
            } else {
                // Peak is guaranteed on the left
                high = mid - 1;
                res = mid; // Potential Peak
            }
        }
        return res;
    }
} // TC : O(log n)

// Corner cases :
// 1. Both peaks are at the ends of the array
// 2. Ascending array (the last element is the peak)
// 3. Descending array (the first element is the peak)
// 4. Single element array (the element is the peak)
