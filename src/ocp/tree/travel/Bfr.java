package ocp.tree.travel;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Bfr {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.setRoot(new Node("1", "one"));

        tree.getRoot().setLeft(new Node("2", "two"));
        tree.getRoot().setRight(new Node("3", "three"));

        tree.getRoot().getLeft().setLeft(new Node("4", "four"));
        tree.getRoot().getLeft().setRight(new Node("5", "five"));

        tree.getRoot().getRight().setLeft(new Node("6", "six"));
        tree.getRoot().getRight().setRight(new Node("7", "seven"));


        String found = get(tree, "3");
        System.out.println("found = " + found);
    }

    private static String get(BinaryTree tree, String key) {
        Node root = tree.getRoot();
        Queue<Node> stack = new LinkedList<>();
        stack.offer(root);

        for (; ; ) {
            Node last = stack.poll();
            if (last == null) {
                break;
            }
            System.out.println("last.getKey() = " + last.getKey());
            stack.offer(last.getLeft());
            stack.offer(last.getRight());

        }
        return "ok";
    }

}
