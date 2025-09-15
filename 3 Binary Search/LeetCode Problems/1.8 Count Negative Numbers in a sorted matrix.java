// 8. Count negative numbers in a sorted matrix

// Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.
// Example 1:

// Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
// Output: 8
// Explanation: There are 8 negatives number in the matrix.

// // Approach 1 - Binary Search
// class Solution {
//     public int countNegatives(int[][] grid) {
//         int total_count = 0;
//         for(int i = 0; i < grid.length; i++) {
//             int low = 0; 
//             int ans = -1;
//             int high = grid[i].length - 1;

//             while(low <= high) {
//                 int mid = low + (high - low) / 2;
//                 if(grid[i][mid] < 0) {
//                     ans = mid;
//                     high = mid - 1;
//                 } else {
//                     low = mid + 1;
//                 }
//             }
//             if(ans != -1) total_count += (grid[i].length - ans);
//         }
//         return total_count;
//     }
// }
// // TC : O(m * log(n))

// Approach 2 - Two Pointer
class Solution {
    public int countNegatives(int[][] grid) {
        int total_rows = grid.length;
        int total_columns = grid[0].length;
        int row = 0;
        int column = grid[0].length - 1;
        int total_count = 0;

        while(row < total_rows && column >= 0) {
            if(grid[row][column] < 0) {
                total_count += total_rows - row;
                column--;
            } else {
                row++;
            }
        }
        return total_count;
    }
} 
// TC : O(m + n)

