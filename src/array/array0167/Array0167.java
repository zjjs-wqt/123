package array.array0167;

import java.util.HashMap;
import java.util.Map;

public class Array0167 {
}
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> hs = new HashMap<Integer, Integer>();
        for (int i = 0 ; i < numbers.length ; ++i){
            if(  hs.containsKey(target - numbers[i])    ){
                return new int[] {hs.get(target - numbers[i]), i + 1};
            }
            hs.put(numbers[i],i);
        }
        return new int[0] ;
    }
}