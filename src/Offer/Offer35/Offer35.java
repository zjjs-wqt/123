package Offer.Offer35;

import java.util.HashMap;
import java.util.Map;

public class Offer35 {
}
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class Solution {
    Map<Node, Node> map = new HashMap<Node,Node>();
    public Node copyRandomList(Node head) {
        if(head == null ){
            return null;
        }
        if(!map.containsKey(head)){
            Node headmap = new Node(head.val);
            map.put(head,headmap);
            headmap.next=copyRandomList(head.next);
            headmap.random=copyRandomList(head.random);
        }
        return map.get(head);
    }
}

//        if(head == null ){
//            return null ;
//        }
//        Node cur = head ;
//
//        while (cur != null ){
//            Node copynode = new Node(cur.val);
//            copynode.next=cur.next;
//            cur.next=copynode;
//            cur=cur.next.next;
//        }
//
//        cur = head;
//        while (cur != null ){
//            if(cur.random != null ){
//                cur.next.random = cur.random.next;
//            }
//            cur= cur.next.next;
//        }
//
//        Node cop = head.next;
//        cur = head;
//        Node line = head.next;
//        while(cur != null ) {
//            cur.next = cur.next.next;
//            cur = cur.next;
//            if(line.next != null){
//                line.next = line.next.next;
//                line=line.next;
//            }
//        }
//        return cop;