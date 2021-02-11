package leet.code;

public class MergeTwoLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode current = null;
        ListNode resultHead = null;
        while (l1 != null && l2 != null) {

            if (l1.val > l2.val) {
                if (resultHead == null) {
                    current = l2;
                    resultHead = l2;
                    l2 = l2.next;
                } else {
                    current.next = l2;
                    current = current.next;
                    l2 = l2.next;
                }
            } else if (resultHead == null) {
                current = l1;
                resultHead = l1;
                l1 = l1.next;
            } else {
                current.next = l1;
                current = current.next;
                l1 = l1.next;
            }
        }

        while (l2 != null) {
            if (current == null) {
                current = l2;
                resultHead = l2;
                l2 = l2.next;
            } else {
                current.next = l2;
                l2 = l2.next;
                current = current.next;
            }
        }

        while (l1 != null) {
            if (current == null) {
                current = l1;
                resultHead = l1;
                l1 = l1.next;
            } else {
                current.next = l1;
                l1 = l1.next;
                current = current.next;
            }
        }

        return resultHead;
    }

    private void fillRest(){

    }

    public static void main(String[] args) {

        ListNode first = new ListNode(1);
        first.next = new ListNode(2);
        first.next.next = new ListNode(4);


        ListNode second = new ListNode(1);
        second.next = new ListNode(3);
        second.next.next = new ListNode(4);

        mergeTwoLists(first, second);
    }
}


class ListNode {
    int val;
    ListNode next;


    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}