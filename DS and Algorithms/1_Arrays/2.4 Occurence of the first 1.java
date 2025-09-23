// 2. Find the first occurence of 1 in a sorted array of 0s and 1s.
// This problem is the base template that we would use to solve any binary search problem

class Solution {
    private boolean check(int[] arr, int mid) {
        return (arr[mid] == 1);
    }
    
    public long firstIndex(int arr[]) {
        int low = 0;
        int high = arr.length-1;
        long res = -1;
        
        while(low <= high) {
            int mid = (low + high) / 2;
            if(!check(arr, mid)) {
                low = mid + 1;
            } else {
                res = mid;
                high = mid - 1;
            }
        }
        return res;
    }
} // TC : O(log2(n))
