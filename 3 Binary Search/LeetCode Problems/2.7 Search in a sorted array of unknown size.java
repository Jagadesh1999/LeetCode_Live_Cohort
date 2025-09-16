/**
 * // This is ArrayReader's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface ArrayReader {
 * public int get(int index);
 * }
 */
class Solution {
    public int search(ArrayReader reader, int target) {
        // Step 1: Find the search boundaries
        int low = 0;
        int high = 1;
        
        while (reader.get(high) < target) {
            low = high;
            high = high * 2;
        }

        // Step 2: Perform standard binary search within the found boundaries
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midVal = reader.get(mid);
            
            if (midVal == target) {
                return mid;
            } else if (midVal < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
