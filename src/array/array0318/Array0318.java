package array.array0318;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Array0318 {
}
class Solution {
    public int maxProduct(String[] words) {
        int wlen = words.length;
        Map<Integer,Integer> hash = new HashMap<>();
        for (int i = 0 ; i < wlen ; ++i){
            String s = words[i] ;
            int len = s.length();
            int mask = 0 ;
            for (int j = 0 ; j < len ; ++j ){
                mask |= 1 << (s.charAt(j) - 'a' );
            }
            if ( len > hash.getOrDefault(mask , 0 )){
                hash.put(mask,len);
            }
        }
        int maxline = 0 ;
        Set<Integer> mark = hash.keySet();
        for (int  mark1 : mark){
            int len1 = hash.get(mark1);
            for( int mark2 : mark ){
                if( (mark1 & mark2) == 0 ){
                    int len2 = hash.get(mark2);
                    maxline=Math.max(maxline,len1*len2);
                }
            }
        }
        return  maxline;
    }
}