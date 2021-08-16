package leet.code;

public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {


    }

    public ListNode removeNthFromEnd(ListNode current, int n) {
        ListNode head = current;
        int length = 0;
        while (current != null) {
            length++;
            current = current.next;
        }
        System.out.println(length);
        if (length == n) {
            return head.next;
        }
        current = head;
        for (int i = 0; i < length; i++) {
            if (i == length - n - 1) {
                current.next = current.next.next;
                break;
            }
            current = current.next;
        }

        return head;
    }
}
