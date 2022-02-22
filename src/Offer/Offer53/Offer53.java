package Offer.Offer53;

public class Offer53 {
}
class Solution {
    public int search(int[] nums, int target) {
        int left = 0 , right = nums.length - 1 ;
        int count = 0 ;

        while(left < right){
            int mid = left + (right - left ) / 2 ;
            if(nums[mid] >= target){
                right = mid ;
            }
            else left = mid + 1 ;
        }


    }
}