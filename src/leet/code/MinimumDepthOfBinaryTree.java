package leet.code;

public class MinimumDepthOfBinaryTree {

    public static int minDepth(TreeNode root) {
        return minDepth(root, 0, Integer.MAX_VALUE);
    }

    public static int minDepth(TreeNode root, int depth, int minDepth) {
        if (root == null) {
            return Math.min(minDepth, depth);
        }
        int leftDistance = minDepth(root.left, depth + 1, minDepth);
        int rightDistance = minDepth(root.right, depth + 1, minDepth);
        return Math.min(leftDistance, rightDistance);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(2);
        node.left = null;
        node.right = new TreeNode(3);

        node.right.left = null;
        node.right.right = new TreeNode(4);
        int i = minDepth(node);
        System.out.println("i = " + i);
    }
//
//    public static void main(String[] args) {
//        TreeNode node = new TreeNode(3);
//        node.left = new TreeNode(9);
//        node.right = new TreeNode(20);
//        node.right.left = new TreeNode(15);
//        node.right.right = new TreeNode(7);
//        int i = minDepth(node);
//        System.out.println("i = " + i);
//    }
}
