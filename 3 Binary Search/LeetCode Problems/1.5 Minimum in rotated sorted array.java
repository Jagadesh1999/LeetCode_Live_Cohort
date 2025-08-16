// 5. Find the minimum in rotated sorted array

// Logic : 
// The minimum point after rotation has the next point smaller than or equal to itself and alse the 
// before point greater than or equal to itself

class Solution {
    public boolean check(int[] nums, int mid) {
        return (nums[mid] <= nums[nums.length-1]);
    }

    public int findMin(int[] nums) {
        int low = 0; 
        int high = nums.length - 1;
        int res = -1;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(!check(nums, mid)) {
                low = mid + 1;
            } else {
                res = mid;
                high = mid - 1;
            }
        }
        if(res == -1) return -1;
        return nums[res];
    }
} // TC : O(log2(n))
