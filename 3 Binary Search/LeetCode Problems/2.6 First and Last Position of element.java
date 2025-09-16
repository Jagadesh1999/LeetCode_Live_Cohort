class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findBoundary(nums, target, true);
        result[1] = findBoundary(nums, target, false);
        return result;
    }

    public static int findBoundary(int[] nums, int target, boolean findFirst) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(nums[mid] == target) {
                ans = mid;
                if(findFirst) {
                    // We found a target, but we want the FIRST one, so search left
                    high = mid - 1;
                } else {
                    // We found a target, but we want the SECOND one, so search right
                    low = mid + 1;
                }
            } else if(nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
} // TC : O(log n)
