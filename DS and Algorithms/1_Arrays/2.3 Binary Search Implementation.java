
// Binary Search :
// -- Works on linear data structures with fast access - Arrays
// -- Works on ordered data structures (ascending, descending etc.)
// -- In every iteration, we reduce the search radius by half
// -- Can be implemented using both the iteration and the recursive approach
// -- TC : O(log2(n))

class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
    
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] < target) {
                low = mid + 1; 
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
} // TC : O(log2(n))
