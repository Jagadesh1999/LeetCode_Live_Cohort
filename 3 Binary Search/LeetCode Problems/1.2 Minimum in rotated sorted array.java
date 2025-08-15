// 2. Find the minimum in rotated sorted array

// Logic : The minimum point after rotation has the next point smaller than itself.

class Solution {
    public boolean check(int[] nums, int mid, int high) {
        if(nums[mid] <= nums[high]) return true;
        else return false;
    }

    public int findMin(int[] nums) {
        int low = 0; 
        int high = nums.length - 1;
        int res = nums[0];

        while(low <= high) {
            int mid = (low + high) / 2;
            if(check(nums, mid, high)) {
                if(nums[mid] < res) {
                    res = nums[mid];
                }
                high = mid-1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
} // TC : O(log2(n))
