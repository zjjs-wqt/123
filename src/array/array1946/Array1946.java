package array.array1946;

public class Array1946 {
    class Solution {
        public String maximumNumber(String num, int[] change) {
            char[] str = num.toCharArray();
            int flag = 0 ; 
            for (int i = 0; i < str.length ; i++) {
                if( change[str[i] - '0'] > str[i] - '0' ){
                    str[i] = (char) ('0' + change[str[i] - '0']);
                    flag = 1 ; 
                }
                else if( change[str[i] - '0'] >= str[i] - '0' && flag == 1){
                    str[i] = (char) ('0' + change[str[i] - '0']);
                }
                else if(flag == 1 ){
                    break;
                }
            }
            return String.valueOf(str);
        }
    }
}
