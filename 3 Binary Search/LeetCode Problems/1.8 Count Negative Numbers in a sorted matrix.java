// 8. Count negative numbers in a sorted matrix

// Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.
// Example 1:

// Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
// Output: 8
// Explanation: There are 8 negatives number in the matrix.

class Solution {
    public int check(int[] row, int mid) {
        if (row[mid] < 0) return 1;
        else return 0;
    }

    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int res = 0;
        for (int i = 0; i < m; i++) {
            int low = 0;
            int high = grid[i].length - 1;
            int res_temp = -1;

            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (check(grid[i], mid) == 0) {
                    low = mid + 1;
                } else {
                    res_temp = mid;
                    high = mid - 1;
                }
            }
            if (res_temp != -1) 
                res_temp = grid[i].length - res_temp;
            else 
                res_temp = 0;

            res += res_temp;
        }
        return res;
    }
} // TC : O(m * log n)

// The better approach would be of O(m + n)
class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int row = 0;
        int column = n - 1;
        int res = 0;

        while(row < m && column >= 0) {
            if(grid[row][column] < 0) {
                // All elements below in this column are negative
                res += m - row;
                column--; // Move left to next column
            } else {
                row++; // Move down to next row
            }
        }
        return res;
    }
} // TC : O(m + n)
