package array.array0001;

import java.util.HashMap;
import java.util.Map;

public class Array0001 {

}
class Solution{
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for (int i = 0 ; i < nums.length ; ++i ){
            if(hash.containsKey(target - nums[i])){
                return new int[] {hash.get(target - nums[i]) , i };
            }
            hash.put(nums[i],i);
        }
        return new int[0];

    }
}
