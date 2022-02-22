package array.array0003;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Array0003 {
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> occ = new HashSet<Character>();
        int slen = s.length();
        int rk = -1 , ans = 0 ;
        for(int i = 0 ; i < slen ; ++i){
            if(i != 0 ){
                occ.remove(s.charAt(i-1));
            }
            while( rk+1 < slen && !occ.contains(s.charAt(rk+1))){
                occ.add(s.charAt(rk+1));
                ++rk;
            }
            ans = Math.max(ans,rk-i+1);
        }
        return ans;
    }
}
