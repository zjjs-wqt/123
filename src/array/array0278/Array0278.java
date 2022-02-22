package array.array0278;

public class Array0278 {
}
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int i = 1 , j = n ;
        int mid = ( j - i ) / 2 + i ;
        while( i < j ){
            if(isBadVersion(mid)){
                j = mid - 1 ;
            }
            else {
                i = mid + 1;
            }

        }
        return j;
    }
}
