// 10. Peak index in a mountain array 
// You are given an integer mountain array arr of length n where the values increase to a peak element and then 
// decrease. Return the index of the peak element.
// Your task is to solve it in O(log(n)) time complexity.

class Solution {
    public int check(int mid, int[] arr) {
        if(arr[mid] > arr[mid+1]) {
            return 1;
        } else {
            return 0;
        }
    } 

    public int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int res = -1;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(check(mid, arr) == 0) {
                low = mid + 1;
            } else {
                res = mid;
                high = mid - 1;
            }
        }
        return res;
    }
} // TC : O(log n)
