package array.array0357;

public class Array0357 {
    class Solution {
        public int countNumbersWithUniqueDigits(int n) {
            if(n == 0 ){
                return 1 ;
            }
            else if(n == 1 ){
                return 10 ;
            }
            int cur = 9  ;
            for (int i = 1; i < n; i++) {
                cur = cur * (10 - i );
            }
            return cur + countNumbersWithUniqueDigits(n-1);
        }
    }
}
