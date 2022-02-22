package array.array0384;

import java.util.Random;

public class Array0384 {
}
class Solution {

    int[] nums;
    int[] cpy;
    public Solution(int[] nums) {
        this.nums=nums;
        this.cpy=new int[nums.length];
        System.arraycopy(nums,0,cpy,0,nums.length);
    }

    public int[] reset() {
        System.arraycopy(cpy,0,nums,0,nums.length);
        return nums;
    }

    public int[] shuffle() {
        Random random = new Random();
        for (int i = 0; i < nums.length; ++i) {
            int j = i + random.nextInt(nums.length - i);
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return nums;
    }
}