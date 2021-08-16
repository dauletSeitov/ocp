package leet.code;

import java.util.Deque;
import java.util.LinkedList;

public class ValidParentheses {

    public static boolean isValid(String s) {

        Deque<Character> queue = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                queue.offer(c);
            } else {
                Character character = queue.pollLast();
                if(character == null ||  c != getOpositeParentheses(character)){
                    return false;
                }
            }
        }
        return queue.isEmpty();
    }


    private static char getOpositeParentheses(Character character){

        switch (character){
            case '{': return '}';
            case '[': return ']';
            case '(': return ')';
        }
        throw new RuntimeException("not acceptable symbol:" + character);
    }



    public static void main(String[] args) {
        System.out.println(isValid("([])"));
        System.out.println(isValid("([][])"));
        System.out.println(isValid("([]{})"));
        System.out.println(isValid("([]())"));
        System.out.println(isValid("([]()[()])"));



        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("{[]}"));
    }
}
