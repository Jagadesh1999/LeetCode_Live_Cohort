// 5. Maximum Size Subarray Sum Equals K (Prefix sum + Hashmap)

class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        int currentPrefixSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        
        int res = 0; int length = 0;
        
        for(int i = 0; i < arr.length; i++) {
            currentPrefixSum += arr[i];
            
            if(map.containsKey(currentPrefixSum - k)) {
                length = i - map.get(currentPrefixSum - k);
                res = Math.max(res, length);
            }
            
            if(!map.containsKey(currentPrefixSum)) {
                map.put(currentPrefixSum, i);
            }
        }
        return res;
    }
}
