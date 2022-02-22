package array.array0997;

public class Array0997 {
}
class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0 , n = nums.length;
        int []pos = new int[n];
        int ans = n - 1 ;
        int j = n - 1 ;
        while( i <= j){
            if( nums[i]*nums[i] < nums[j]*nums[j] ){
                pos[ans] = nums[j]*nums[j];
                j--;
            }
            else {
                pos[ans] = nums[i]*nums[i];
                i++;
            }
            ans--;
        }
        return pos;
    }
}
