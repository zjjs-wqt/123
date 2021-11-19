package array.array0397;
import java.util.Scanner;

public class Arrayy0397 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(new Solution().integerReplacement(n));
    }
}
class Solution{
    public int integerReplacement(int n) {
        if( n == 1 ){
            return 0;
        }
        if( n % 2 == 0 ) {
            return 1 + integerReplacement(n / 2);
        }
        return 2 + Math.min(integerReplacement(n / 2 ),integerReplacement(n / 2 + 1 ));
    }
}
