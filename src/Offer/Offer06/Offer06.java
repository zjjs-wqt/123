package Offer.Offer06;

import java.util.Stack;
import java.util.Vector;

public class Offer06 {
}
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}

class Solution {

    Vector<Integer> vec = new Vector<>();
    public void dfs(ListNode head){
        if(head!=null){
            dfs(head.next);
            vec.add(head.val);
        }
    }
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        dfs(head);
        int tmp[] = new int[vec.size()];
        for (int i = 0 ; i < vec.size() ; ++i ){
            tmp[i] = vec.get(i);
        }
        return tmp;

    }
}
