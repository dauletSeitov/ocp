package leet.code;

import java.util.LinkedList;
import java.util.Queue;

public class RangeSumofBST {
    public static void main(String[] args) {

    }

    public int rangeSumBST(TreeNode root, int low, int high) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int sum = 0;
        while (!queue.isEmpty()) {

            TreeNode node = queue.poll();
            if (low - 1 < node.val && node.val < high + 1) {
                sum += node.val;
            }
            if (low - 1 < node.val && node.left != null) {
                queue.add(node.left);
            }
            if (node.val < high + 1 && node.right != null) {
                queue.add(node.right);
            }
        }
        return sum;
    }
}
