package leet.code;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {

        if(head == null)return false;
        Set<ListNode> set = new HashSet<>();
        set.add(head);
        while (head.next != null) {
            head = head.next;

            if (set.contains(head)) {
                return true;
            } else {
                set.add(head);
            }
        }
        return false;
    }

    public static void main(String[] args) {

        ListNode node = new ListNode(1);
      //  node.next = new ListNode(2);
//        node.next.next = new ListNode(3);
//        node.next.next.next = node;
        boolean b = hasCycle(node);
        System.out.println(b);

    }
}
