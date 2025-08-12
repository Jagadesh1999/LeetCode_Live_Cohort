// 1. Range Sum Query - Immutable

class NumArray {
    int[] prefix_nums;

    public NumArray(int[] nums) {
        prefix_nums = new int[nums.length];
        prefix_nums[0] = nums[0];

        for(int i = 1; i < prefix_nums.length; i++) {
            prefix_nums[i] = prefix_nums[i-1] + nums[i];
        }
    }
    
    // Brute force approach :
    // - O(n) for one query.
    // - Takes O(n ^ 2) for n queries range sum.                               

    // Prefix sum approach :
    // - O(constant) time for one query.
    // - Helps in retaining the function at O(n) irrespective of the number of queries.

    public int sumRange(int left, int right) {
        if(left == 0) {
            return prefix_nums[right];
        }
        return prefix_nums[right] - prefix_nums[left-1];
    }
} // TC : O(n)

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
