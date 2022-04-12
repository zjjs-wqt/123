package Offer.Offer53;

public class Offer53 {
}
class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==0)return 0;
        int left = 0 , right = nums.length - 1 ;
        int count = 0 ;
        while(left < right){
            int mid = left + (right - left ) / 2 ;
            if(nums[mid] >= target){
                right = mid ;
            }
            else left = mid + 1 ;
        }
        while(nums[left++] == target && left < nums.length ){
             count++;
         }
        return count;
    }
    public int missingNumber(int[] nums) {
        int left = 0 , right = nums.length - 1 ;

        while(left < right ){
            int mid = left + ( right - left ) / 2 ;
            if(nums[mid] == mid ){
                left = mid + 1 ;
            }
            else right = mid ;
        }
        if( nums[left] == left  && left == nums.length - 1 ){
            return nums.length;
        }
        return left;
    }
}