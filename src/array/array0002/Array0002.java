package array.array0002;

public class Array0002 {
}
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode k1 = null , k2 = null;
        int k = 0 ;
        while( l1 != null || l2 != null){
            int n1 = l1 != null ? l1.val : 0 ;
            int n2 = l2 != null ? l2.val : 0 ;
            int sum = n1 + n2 +k ;
            if(k1 == null ){
                k1 = k2 = new ListNode(sum%10);
            }
            else{
                 k2.next = new ListNode(sum%10);
                 k2 = k2.next;
            }
            k = sum / 10 ;
            if(l1 != null ){
                l1=l1.next;
            }
            if(l2 != null ){
                l2=l2.next;
            }
        }
        if ( k != 0)
            k2.next=new ListNode(k);
        return k2;
    }
}
