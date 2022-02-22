package Offer.Offer03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Offer03 {
}
class Solution {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> dic = new HashSet<>();
        for(int num : nums ){
            if(dic.contains(num))return num;
            dic.add(num);
        }
        return -1;

    }
}