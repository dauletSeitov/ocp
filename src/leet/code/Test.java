package leet.code;

public class Test {
    public static void main(String[] args) {

        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = node;
        node.next.next.next.next = new ListNode(5);
        node.next.next.next.next.next = new ListNode(6);
//        node.next.next.next.next.next = node;
        node.next.next.next.next.next.next = new ListNode(7);


        boolean b = hasCycle(node);

        System.out.println("b = " + b);
    }


    public static boolean hasCycle(ListNode fast) {
        ListNode slow = fast;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            System.out.println("slow = " + slow.val);
            System.out.println("fast = " + fast.val);
            System.out.println("------------------------");
            if (fast == slow) {
                return true;
            }
        }
        return false;

    }
}
