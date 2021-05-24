package ocp.postfix;

import java.util.LinkedList;
import java.util.Queue;

public class InfixToPostfixConvertor {
    Queue<Character> theStack = new LinkedList<>();
    String input = "a+b+c+d";
    String output = "";

    public static void main(String[] args) {
        InfixToPostfixConvertor obj = new InfixToPostfixConvertor();
        String s = obj.doTrans();
        System.out.println("s = " + s);
    }

    public String doTrans() {

        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            System.out.println("For " + theStack + "" + ch + " ");
            switch (ch) {
                case '+':
                case '-':
                    gotOper(ch, 1);
                    break;
                case '*':
                case '/':
                    gotOper(ch, 2);
                    break;
                case '(':
                    theStack.offer(ch);
                    break;
                case ')':
                    gotParen(ch);
                    break;
                default:
                    output = output + ch; // write it to output
                    break;
            }
        }
        while (!theStack.isEmpty()) {
            output = output + theStack.poll(); // write to output
        }
        return output;
    }

    public void gotParen(char ch) {

        while (!theStack.isEmpty()) {
            char chx = theStack.poll();
            if (chx == '(')
                break;
            else
                output = output + chx;
        }
    }

    public void gotOper(char opThis, int prec1) {

        while (!theStack.isEmpty()) {
            char opTop = theStack.poll();

            if (opTop == '(') {
                theStack.offer(opTop);
                break;
            } else {
                int prec2;

                if (opTop == '+' || opTop == '-')
                    prec2 = 1;
                else
                    prec2 = 2;
                if (prec2 < prec1) {
                    theStack.offer(opTop);
                    break;
                } else
                    output = output + opTop;
            }
        }
        theStack.offer(opThis);
    }
}