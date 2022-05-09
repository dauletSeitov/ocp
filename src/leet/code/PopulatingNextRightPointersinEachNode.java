package leet.code;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersinEachNode {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);

        node.left.left = new Node(4);
        node.left.right = new Node(5);

        node.right.left = new Node(6);
        node.right.right = new Node(7);

        new PopulatingNextRightPointersinEachNode().connect(node);
        System.out.println();
    }
    public Node connect(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int layerNodeCount = 1;
        int nodeCount = 0;
        Node prev = null;
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node == null) {
                break;
            }
            System.out.println(node.val);
            nodeCount++;


            node.next = prev;
            prev = node;

            if (nodeCount == Math.pow(2, layerNodeCount - 1)) {
                prev = null;
                layerNodeCount++;
                nodeCount = 0;
            }


            queue.add(node.right);
            queue.add(node.left);
        }


        return null;

    }

}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};