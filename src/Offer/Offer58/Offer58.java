package Offer.Offer58;

public class Offer58 {

}
class Solution {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n,s.length())+s.substring(0,n);
    }
}