package array.array1218;

import java.util.HashMap;
import java.util.Map;

public class Array1218 {
}
class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        int ans = 0 ;
        Map<Integer,Integer> dp =new  HashMap<Integer,Integer>();
        for(int a : arr){
            dp.put( a , dp.getOrDefault(a-difference , 0 )+1);
            ans = Math.max(ans,dp.get(a));
        }
        return ans ;
    }
}