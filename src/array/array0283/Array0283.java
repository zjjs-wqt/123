package array.array0283;

public class Array0283 {
}
class Solution {
    public void moveZeroes(int[] nums) {
        int cnt = 0 ;
        for(int i = 0 ; i < nums.length ; ++i){
            if( nums[i] != 0){
                nums[cnt++] = nums[i];
            }
        }
        while (cnt < nums.length){
            nums[cnt++]=0;
        }
    }
}
class Solution1 {
    public void moveZeroes(int[] nums) {
        int i = 0 , j = 1 ;
        while(j < nums.length){
            if( nums[i] == 0 ){
                if ( nums[j] == 0){
                    j++;
                }
                else {
                    int tmp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=tmp;
                }
            }
            else{
                i++;
                j++;
            }
        }
    }
}
