/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        // Step 1 : Find the index of the peak element in the mountain array
        // mountainArr.get(k) api is used 2 * log(n) times
        int low = 0;
        int high = mountainArr.length() - 1;
        int peak = -1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                peak = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        // Step 2 : Search in the left portion as we need to return the first index of the target
        // mountainArr.get(k) api is used log(n) times
        low = 0;
        high = peak;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(mountainArr.get(mid) == target) {
                return mid;
            } else if(mountainArr.get(mid) < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Step 3 : Check for the target in the right portion
        // mountainArr.get(k) api is used log(n) times
        low = peak;
        high = mountainArr.length() - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(mountainArr.get(mid) == target) {
                return mid;
            } else if(mountainArr.get(mid) > target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
} // TC : O(log n)

// In total, mountainArr.get(k) api is used 4 * log(n) times, that is, ~log(n) times.
