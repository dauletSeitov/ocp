package leet.code;

public class ConvertBinaryNumberinaLinkedListtoInteger {

    public int getDecimalValue(ListNode head) {

        StringBuilder sb = new StringBuilder();
        do {
            sb.append(head.val);
            head = head.next;
        } while (head != null);

        System.out.println(sb);
        return Integer.valueOf(sb.toString(),2);
    }
}
