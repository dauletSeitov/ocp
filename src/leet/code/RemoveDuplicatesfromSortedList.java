package leet.code;

public class RemoveDuplicatesfromSortedList {
    public static void main(String[] args) {

        ListNode node = new ListNode(1);
        node.next = new ListNode(1);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(2);
        new RemoveDuplicatesfromSortedList().deleteDuplicates(node);
    }

    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummyHead = new ListNode(-1);
        ListNode current = dummyHead;
        int i = 0;
        while (head != null) {

            if (head.val != current.val) {
                i++;
                current.next = head;
                current = current.next;
            }

            head = head.next;

        }
        current = dummyHead.next;
        for (int k = 0; k < i -1; k++) {
            current = current.next;
        }
        current.next = null;
        return dummyHead.next;
    }
}
