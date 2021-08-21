package leet.code;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumNestingDepthoftheParentheses {

    public static void main(String[] args) {
        maxDepth("(1+(2*3)+((8)/4))+1");
    }

    public static int maxDepth(String s) {


        Queue<String> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder(s.length() / 8);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '(' && s.charAt(i) != ')') {
                continue;
            }
            sb.append(s.charAt(i));
        }

        System.out.println("deque = " + sb);
        deque.add(sb.toString());





        return 0;

    }
}
