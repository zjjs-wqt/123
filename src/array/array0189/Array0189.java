package array.array0189;

public class Array0189 {
}
//class Solution {
//    public void rotate(int[] nums, int k) {
//        int n = nums.length;
//        int []tmp = new int[nums.length];
//        for (int i = 0 ; i < n ; ++i ){
//            tmp[(i + k) % n] = nums[i];
//        }
//        System.arraycopy(tmp,0,nums,0,n);
//    }
//}
class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        remove(nums,0,nums.length-1);
        remove(nums,0,k-1);
        remove(nums,k,nums.length-1);
    }

    private void remove(int[] nums, int k, int i) {
        while(k<i){
            int tmp = nums[k];
            nums[k] = nums[i];
            nums[i]=tmp;
            k++;
            i--;
        }
    }
}