/*
13. You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int high = m * n - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            
            int row = mid / n;
            int column = mid % n;

            if(matrix[row][column] == target) {
                return true;
            } else if(matrix[row][column] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
} // TC : O(log(m * n))
