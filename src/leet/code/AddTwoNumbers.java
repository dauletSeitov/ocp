package leet.code;

import java.util.Arrays;

public class AddTwoNumbers {
    public static void main(String[] args) {

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode current = result;
        int carry = 0;
        while (l1 != null || l2 != null) {

            int firstNumber = 0;
            int secondNumber = 0;

            if (l1 != null) {
                firstNumber = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                secondNumber = l2.val;
                l2 = l2.next;
            }

            int i = firstNumber + secondNumber + carry;

            if (i > 9) {
                carry = 1;
                i = i % 10;
            }else {
                carry = 0;
            }

            current.next = new ListNode(i);
            current = current.next;

        }
        if(carry > 0){
            current.next = new ListNode(carry);
        }
        return result.next;
    }

}
