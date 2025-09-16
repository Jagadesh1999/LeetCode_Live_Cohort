// Properties of the matrix for the problem :
// -- In each row, the elements are sorted from left to right
// -- In each column, the elements are sorted from top to bottom
// -- But, the first element of each row need not necessarily be greater than the last element of the 
//    previous row.

// Search from the top right corner approach :
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int total_rows = matrix.length;
        int total_columns = matrix[0].length;
        int row = 0;
        int column = matrix[0].length - 1;

        while(row < total_rows && column >= 0) {
            if(matrix[row][column] == target) {
                return true;
            } else if(matrix[row][column] < target) {
                row++;
            } else {
                column--;
            }
        }
        return false;
    }
} // TC : O(m + n)
