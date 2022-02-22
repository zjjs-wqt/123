package array.array0704;

public class Array0704 {
}
class Solution {
    public int search(int[] nums, int target) {
        int i = 0 , j = nums.length - 1 ;
        while ( i < j ){
            int mid = ( i + j ) / 2 ;
            int sc = nums[mid] ;
            if ( sc < target )
                i = mid + 1 ;
            else if ( sc == target) return mid;
            else j = mid - 1 ;
        }
        return -1;
    }
}