// 9. Search in a rotated sorted array i - LeetCode

// Understandable Code Syntax : 
class Solution {
    public int checkLeft(int mid, int[] nums, int low, int target) {
        if(nums[low] <= target && target <= nums[mid]) {
            return 1;
        } else {
            return 0;
        } 
    }

    public int checkRight(int mid, int[] nums, int high, int target) {
        if(nums[mid] <= target && target <= nums[high]) {
            return 1;
        } else {
            return 0;
        } 
    }
    
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int res = -1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(nums[mid] == target) {
                return mid;
            }
            if (nums[low] <= nums[mid]) { // Left half sorted
                if (checkLeft(mid, nums, low, target) == 1) {
                    high = mid -1;
                } else {
                    low = mid +1;
                }
            } else { // Right half sorted
                if (checkRight(mid, nums, high, target) == 1) {
                    low = mid +1;
                } else {
                    high = mid -1;
                }
            }
        }
        return -1;
    }
} // TC : O(log n)

// Elegant Code Syntax
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
