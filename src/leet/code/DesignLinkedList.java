package leet.code;

import java.util.ArrayList;
import java.util.List;

public class DesignLinkedList {
    public static void main(String[] args) {

        MyLinkedList var = new MyLinkedList();

        String commandsString = "[\"MyLinkedList\",\"addAtHead\",\"addAtTail\",\"addAtTail\",\"get\",\"get\",\"addAtTail\",\"addAtIndex\",\"addAtHead\",\"addAtHead\",\"addAtTail\",\"addAtTail\",\"addAtTail\",\"addAtTail\",\"get\",\"addAtHead\",\"addAtHead\",\"addAtIndex\",\"addAtIndex\",\"addAtHead\",\"addAtTail\",\"deleteAtIndex\",\"addAtHead\",\"addAtHead\",\"addAtIndex\",\"addAtTail\",\"get\",\"addAtIndex\",\"addAtTail\",\"addAtHead\",\"addAtHead\",\"addAtIndex\",\"addAtTail\",\"addAtHead\",\"addAtHead\",\"get\",\"deleteAtIndex\",\"addAtTail\",\"addAtTail\",\"addAtHead\",\"addAtTail\",\"get\",\"deleteAtIndex\",\"addAtTail\",\"addAtHead\",\"addAtTail\",\"deleteAtIndex\",\"addAtTail\",\"deleteAtIndex\",\"addAtIndex\",\"deleteAtIndex\",\"addAtTail\",\"addAtHead\",\"addAtIndex\",\"addAtHead\",\"addAtHead\",\"get\",\"addAtHead\",\"get\",\"addAtHead\",\"deleteAtIndex\",\"get\",\"addAtHead\",\"addAtTail\",\"get\",\"addAtHead\",\"get\",\"addAtTail\",\"get\",\"addAtTail\",\"addAtHead\",\"addAtIndex\",\"addAtIndex\",\"addAtHead\",\"addAtHead\",\"deleteAtIndex\",\"get\",\"addAtHead\",\"addAtIndex\",\"addAtTail\",\"get\",\"addAtIndex\",\"get\",\"addAtIndex\",\"get\",\"addAtIndex\",\"addAtIndex\",\"addAtHead\",\"addAtHead\",\"addAtTail\",\"addAtIndex\",\"get\",\"addAtHead\",\"addAtTail\",\"addAtTail\",\"addAtHead\",\"get\",\"addAtTail\",\"addAtHead\",\"addAtTail\",\"get\",\"addAtIndex\"]\n";
        String operandsString = "[[],[84],[2],[39],[3],[1],[42],[1,80],[14],[1],[53],[98],[19],[12],[2],[16],[33],[4,17],[6,8],[37],[43],[11],[80],[31],[13,23],[17],[4],[10,0],[21],[73],[22],[24,37],[14],[97],[8],[6],[17],[50],[28],[76],[79],[18],[30],[5],[9],[83],[3],[40],[26],[20,90],[30],[40],[56],[15,23],[51],[21],[26],[83],[30],[12],[8],[4],[20],[45],[10],[56],[18],[33],[2],[70],[57],[31,24],[16,92],[40],[23],[26],[1],[92],[3,78],[42],[18],[39,9],[13],[33,17],[51],[18,95],[18,33],[80],[21],[7],[17,46],[33],[60],[26],[4],[9],[45],[38],[95],[78],[54],[42,86]]";

        String[] commands = commandsString.replace("[", "").replace("]", "").replace("\"", "").split(",");
        List<List<Integer>> operands = new ArrayList<>();
        for (String str : operandsString.split("\\],\\[")) {
            str = str.replace("[", "").replace("]", "");
            String[] split = str.split(",");
            if (str.length() == 0) {
                operands.add(List.of());
            } else if (split.length == 1) {
                operands.add(List.of(Integer.valueOf(split[0])));
            } else {
                operands.add(List.of(Integer.valueOf(split[0]), Integer.valueOf(split[1])));
            }
        }


        for (int i = 0; i < commands.length; i++) {
            List<Integer> operand = operands.get(i);
            switch (commands[i]) {
                case "addAtHead":
                    var.addAtHead(operand.get(0));
                    break;
                case "addAtTail":
                    var.addAtTail(operand.get(0));
                    break;
                case "get":
                    System.out.println(var.get(operand.get(0)));
                    break;
                case "addAtIndex":
                    var.addAtIndex(operand.get(0), operand.get(1));
                    break;
                case "deleteAtIndex":
                    var.deleteAtIndex(operand.get(0));
                    break;
            }
        }
    }
}
//6 5 7 8
//6 5 99 7 8


class MyLinkedList {

    private Nodee head;
    private Nodee tail;
    private int size = 0;

    public int get(int index) {
        System.out.println("var.get(" + index + ");");
        if (index >= size || index < 0) {
            return -1;
        }
        Nodee current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.val;
    }

    public void addAtHead(int val) {
        System.out.println("var.addAtHead(" + val + ");");
        size++;
        if (head == null) {
            head = new Nodee(val);
            tail = head;
        } else {
            Nodee temp = head;
            head = new Nodee(val);
            head.next = temp;
        }

    }

    public void addAtTail(int val) {
        System.out.println("var.addAtTail(" + val + ");");
        size++;
        if (tail == null) {
            tail = new Nodee(val);
            head = tail;
        } else {
            tail.next = new Nodee(val);
            tail = tail.next;
        }

    }

    public void addAtIndex(int index, int val) {

        System.out.println("var.addAtIndex(" + index + ", " + val + ");");
        if (index > size || index < 0) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }


        size++;

        Nodee current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        Nodee tmp = current.next;
        current.next = new Nodee(val);
        current.next.next = tmp;

    }

    public void deleteAtIndex(int index) {
        System.out.println("var.deleteAtIndex(" + index + ");");
        if (index >= size || index < 0) {
            return;
        }
        size--;
        if (index == 0) {
            head = head.next;
            if (size == 0) {
                tail = null;
            }
            return;
        }

        Nodee current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        if (index == size) {
            tail = current;
            current.next = null;
        } else {
            current.next = current.next.next;
        }
    }
}


class Nodee {


    int val;
    Nodee next;

    Nodee(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Nodee{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}