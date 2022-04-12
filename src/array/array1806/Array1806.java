package array.array1806;

public class Array1806 {
    class Solution {
        public int reinitializePermutation(int n) {
            int ans = 1 ; 
            int pos = n - 2 ;
            pos = pos / 2 ; 
            while( pos != n - 2 ){
                ans ++ ;
                if( pos % 2 == 0 ){
                    pos = pos / 2 ;
                }
                else {
                    pos = n / 2 + (pos - 1 ) / 2 ;
                }
            }
            return ans ; 
        }
    }
}
