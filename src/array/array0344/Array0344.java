package array.array0344;

public class Array0344 {
}
class Solution {
    public void reverseString(char[] s) {
        char tmp ;
        for(int i = 0 ; i < s.length / 2 + 1 ; ++i){
            tmp = s[i];
            s[i]=s[s.length-i-1];
            s[s.length - i - 1 ] = tmp;
        }

    }
}