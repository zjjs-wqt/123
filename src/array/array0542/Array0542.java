package array.array0542;

import java.util.Map;

public class Array0542 {
}

class Solution {
    public int[][] updateMatrix(int[][] mat){
        int xlen = mat.length;
        int ylen = mat[0].length;
        for( int i = 0 ; i < xlen ; ++i){
            for( int j = 0 ; j < ylen ; ++j){
                if(mat[i][j] == 1 ){
                    mat[i][j]= xlen + ylen;
                }
                if(  i > 0 )
                    mat[i][j]=Math.min(mat[i][j],mat[i-1][j]+1);
                if( j > 0 )
                    mat[i][j]= Math.min(mat[i][j],mat[i][j-1]+1);
            }
        }
        for( int i = xlen -1 ; i >= 0  ; --i){
            for( int j = ylen - 1 ; j >= 0 ; --j){
                if(  i < xlen - 1 )
                    mat[i][j]=Math.min(mat[i][j],mat[i+1][j]+1);
                if( j < ylen -1 )
                    mat[i][j]= Math.min(mat[i][j],mat[i][j+1]+1);
            }
        }
        return mat;
    }
}