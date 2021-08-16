package leet.code;

public class BalancedBinaryTree {
    public static boolean isBalanced(TreeNode root) {
        int i = maxDepth(root);
        return checkDepth(root, 0, i);
    }

    private static int maxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftMaxDepth = maxDepth(node.left) + 1;
        int rightMaxDepth = maxDepth(node.right) + 1;
        return Math.max(leftMaxDepth, rightMaxDepth);
    }

    private static boolean checkDepth(TreeNode node, int depth, int maxDepth) {
        if (node == null) {
            return Math.abs(maxDepth - depth) <= 1;
        }
        boolean b = checkDepth(node.left, depth + 1, maxDepth);
        boolean b1 = checkDepth(node.right, depth + 1, maxDepth);
        return b && b1;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);

        node.right.left = new TreeNode(6);

        node.left.left.left = new TreeNode(8);

        boolean balanced = isBalanced(node);
        System.out.println("i = " + balanced);

    }
}
