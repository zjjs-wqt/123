package array.array0004;

public class Array0004 {

    public static void main(String[] args) {
        int[] array1 = {1, 3};
        int[] array2 = {2};

        System.out.println(new Solution().findMedianSortedArrays(array1,array2));

    }
}

class Solution {
    public double findMedianSortedArrays(int[] array1, int[] array2) {
        int num1 = array1.length;
        int num2 = array2.length;

        int totalnum = num1 + num2;

        if (totalnum % 2 != 0) {
            int key = totalnum / 2;
            double median = findmedian(array1, array2, key + 1);
            return median;
        } else {
            int key1 = totalnum / 2 - 1;
            int key2 = totalnum / 2;
            double median = (findmedian(array1, array2, key1 + 1) + findmedian(array1,
                    array2, key2 + 1)) / 2;
            return median;
        }
    }

    public double findmedian(int[] array1, int[] array2, int key) {
        int len1 = array1.length;
        int len2 = array2.length;
        int index1 = 0, index2 = 0;
        int kk = 0;

        while (true) {
            if (index1 == len1) {
                return array2[index2 + key - 1];
            }
            if (index2 == len2) {
                return array1[index1 + key - 1];
            }
            if (key == 1) {
                return Math.min(array1[index1], array2[index2]);
            }
            int half = key / 2;
            int newindex1 = Math.min(len1, index1 + half) - 1;
            int newindex2 = Math.min(len2, index2 + half) - 1;
            int p1 = array1[newindex1], p2 = array2[newindex2];

            if (p1 <= p2) {
                key -= (newindex1 - index1 + 1);
                index1 = newindex1 + 1;
            } else {
                key -= (newindex2 - index2 + 1);
                index2 = newindex2 + 1;
            }
        }
    }

}