package array.array0806;

public class Array0806 {
    class Solution {
        public int[] numberOfLines(int[] widths, String s) {
                int[] arr = new int [2];
                arr[0] = 1 ;
                for(char i : s.toCharArray() ){
                    arr[1] += widths[i - 'a' ];
                    if( arr[1] > 100 ){
                        arr[0]+=1;
                        arr[1] = widths[i-'a'];
                    }
                }
                return arr;
        }
    }
}
