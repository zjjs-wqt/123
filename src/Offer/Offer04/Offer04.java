package Offer.Offer04;

public class Offer04 {
}
class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0 ){
            return false;
        }
        int n = matrix.length , m = matrix[0].length;
        int row = 0 , col = m - 1 ;

        while( row < n && col >= 0 ){
            if(matrix[row][col] > target )
                col--;
            else if(matrix[row][col] < target)
                row++;
            else
                return true;
        }
        return false;
    }
}