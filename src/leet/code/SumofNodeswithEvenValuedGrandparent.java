package leet.code;

import java.util.LinkedList;
import java.util.Queue;

public class SumofNodeswithEvenValuedGrandparent {
    public int sumEvenGrandparent(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int result = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node.val % 2 == 0) {
                if (node.left != null) {
                    if (node.left.left != null) {
                        result += node.left.left.val;
                    }
                    if (node.left.right != null) {
                        result += node.left.right.val;
                    }
                }

                if (node.right != null) {
                    if (node.right.left != null) {
                        result += node.right.left.val;
                    }

                    if (node.right.right != null) {
                        result += node.right.right.val;
                    }
                }

            }


            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }


        }
        return result;
    }


}
