package leet.code;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        Queue<TreeNode> leftQueue = new LinkedList<>();
        Queue<TreeNode> rightQueue = new LinkedList<>();

        leftQueue.offer(root.left);
        rightQueue.offer(root.right);
        while (!leftQueue.isEmpty()) {

            TreeNode leftNode = leftQueue.poll();
            TreeNode rightNode = rightQueue.poll();

            if (leftNode == null ^ rightNode == null) {
                return false;
            }

            if (leftNode == null) {
                continue;
            }

            if (leftNode.val != rightNode.val) {
                return false;
            }

            leftQueue.offer(leftNode.left);
            leftQueue.offer(leftNode.right);

            rightQueue.offer(rightNode.right);
            rightQueue.offer(rightNode.left);
        }

        return rightQueue.isEmpty();
    }

//
//    public static void main(String[] args) {
//
//        TreeNode node = new TreeNode(9);
//        node.left = new TreeNode(-42);
//        //node.left.left = new TreeNode(3);
//        node.left.right = new TreeNode(76);
//        node.left.right.right = new TreeNode(13);
//
//        node.right = new TreeNode(-42);
//        //node.right.right = new TreeNode(3);
//        node.right.left = new TreeNode(76);
//        node.right.left.right = new TreeNode(13);
//
//        boolean symmetric = isSymmetric(node);
//        System.out.println("symmetric = " + symmetric);
//    }
    public static void main(String[] args) {

        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(4);

        node.right = new TreeNode(2);
        node.right.right = new TreeNode(3);
        node.right.left = new TreeNode(4);
        node.right.left .right= new TreeNode(4);

        boolean symmetric = isSymmetric(node);
        System.out.println("symmetric = " + symmetric);
    }
}
