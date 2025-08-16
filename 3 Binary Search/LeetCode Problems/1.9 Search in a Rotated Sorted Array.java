// 9. Search in a rotated sorted array

class Solution {
    public boolean check(int[] nums, int mid, int low, int high, int target) {
        if(nums[low] <= nums[mid]) {
            return (nums[low] <= target && target <= nums[mid]);
        } else {
            return !(nums[mid] <= target && target <= nums[high]);
        }
    }

    public int search(int[] nums, int target) {
        int low = 0; 
        int high = nums.length - 1;
        int res = -1;
        
        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(nums[mid] == target) {
                res = mid;
                break;
            }

            if(check(nums, mid, low, high, target)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
} // TC : O(log n)
