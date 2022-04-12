package Interview.interview0503;

public class Interview0503 {
    class Solution {
        public int reverseBits(int num) {
            int res = 0 ;
            int flag = 0 ;
            int cnt = 0 ;
            int ans = 0 ;
            for (int i = 0; i < 32; i++) {
                if( (num & (1 << i)) != 0 && flag == 0 ){
                    res++;
                }
                else if((num & (1 << i)) != 0 && flag == 1 ){
                    cnt++;
                }
                else if ((num & (1 << i)) == 0 && flag == 0 ){
                    flag = 1 ;
                }
                else if ((num & (1 << i)) == 0 && flag == 1 ){
                    ans = Math.max(ans, res + flag + cnt );
                    res = cnt ; 
                    cnt = 0;
                }
            }
            ans = Math.max(ans, res + flag + cnt );
            return ans ;
        }
    }
}
