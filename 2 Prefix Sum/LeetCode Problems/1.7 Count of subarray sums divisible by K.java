// 7. Count of subarray sums divisible by K - LeetCode

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int currentPrefixSum = 0; int res = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for(int i = 0; i < nums.length; i++) {
            currentPrefixSum += nums[i];
            int mod_currentPrefixSum = currentPrefixSum % k;
            if(mod_currentPrefixSum < 0) mod_currentPrefixSum += k;

            if(map.containsKey(mod_currentPrefixSum)) {
                res += map.get(mod_currentPrefixSum);
            } 
            map.put(mod_currentPrefixSum, map.getOrDefault(mod_currentPrefixSum, 0) + 1);
        }
        return res;
    }
} // TC : O(n)
