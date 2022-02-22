package array.array0019;

public class Array0019 {
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = new ListNode(0,head);
        ListNode p1 = head , p2 = p ;
        for(int i = 0 ; i < n ; ++i){
            p1 = p1.next;
        }
        while( p1 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        p2.next = p2.next.next;

        ListNode ans = p.next;
        return ans;

    }
}