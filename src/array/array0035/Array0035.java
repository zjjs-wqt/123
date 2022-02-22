package array.array0035;

public class Array0035 {
}
class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0 , j = nums.length - 1 ;
        int ans = nums.length ;
        while( i <= j ){
            int mid = ( j - i ) / 2 + i ;
            if( target <= nums[mid]){
                ans = mid ;
                j = mid - 1 ;
            }
            else
                i = mid + 1 ;
        }
        return ans ;
    }
}