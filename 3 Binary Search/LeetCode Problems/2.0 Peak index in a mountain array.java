// 10. Peak index in a mountain array 
// You are given an integer mountain array arr of length n where the values increase to a peak element and then 
// decrease. Return the index of the peak element.
// Your task is to solve it in O(log(n)) time complexity.

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // This is the condition to check if 'mid' is on the downhill slope.
            // A peak element is always greater than its neighbor to the right.
            if (arr[mid] > arr[mid + 1]) {
                // We've found a potential peak. It could be the actual peak, or it could
                // be an element on the right side of the peak.
                // We store 'mid' as a possible result.
                result = mid;
                // Since the peak must be at or to the left of 'mid', we search the left half.
                high = mid - 1;
            } else { // arr[mid] < arr[mid + 1]
                // We are on the uphill slope. The peak must be to the right of 'mid'.
                // So, we discard the left half and search the right half.
                low = mid + 1;
            }
        }
        return result;
    }
}
