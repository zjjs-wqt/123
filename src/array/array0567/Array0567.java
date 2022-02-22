package array.array0567;

import java.util.Arrays;

public class Array0567 {
}
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int i1 = s1.length() , i2 = s2.length();
        int[] letter1 = new int[26];
        int[] letter2 = new int[26];
        if(i1 > i2 ) return false ;
        for(int i = 0 ; i < i1 ; ++i ){
            ++letter1[s1.charAt(i)-'a'];
            ++letter2[s2.charAt(i)-'a'];
        }
        if(Arrays.equals(letter1,letter2)){
            return true;
        }
        for(int i = i1 ; i < i2 ; ++i){
            ++letter2[s2.charAt(i)-'a'];
            --letter2[s2.charAt(i-i1)-'a'];
            if(Arrays.equals(letter1,letter2)){
                return true;
            }
        }
        return false;
    }
}