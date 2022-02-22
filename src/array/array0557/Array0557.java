package array.array0557;

public class Array0557 {
}
class Solution {
    public String reverseWords(String s) {
        StringBuffer res = new StringBuffer();
        int len = s.length();
        int i = 0 ;
        while ( i < len ){
            int start = i ;
            while(i < len && s.charAt(i)!=' '){
                i++;
            }
            for(int j = start ; j < i ; ++j){
                res.append(s.charAt(start + i - j - 1));
            }
            while (i < len && s.charAt(i)==' '){
                i++;
                res.append(' ');
            }
        }
        return res.toString();
    }
}
