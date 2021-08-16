package leet.code;

public class RemoveLinkedListElements {

    public static ListNode removeElements(ListNode current, int val) {

        while (current != null) {
            if (current.val == val) {
                current = current.next;
            } else {
                break;
            }
        }

        if(current == null){
            return null;
        }
        ListNode node = new ListNode(current.val);
        ListNode newCurrent = node;
        while (current != null) {
            if (current.val != val) {
                newCurrent.next = current;
                newCurrent = newCurrent.next;
            }
            current = current.next;
        }

        return node;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(2);
        node1.next.next.next = new ListNode(1);
//        node1.next.next.next.next = new ListNode(1);
//        node1.next.next.next.next.next = new ListNode(4);
//        node1.next.next.next.next.next.next = new ListNode(1);

        ListNode node = removeElements(node1, 2);
        System.out.println("node = " + node);
    }

}

