package leet.code;

public class DeepestLeavesSum {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        root.left.left.left = new TreeNode(7);
        root.right.right.right = new TreeNode(8);

        int i = deepestLeavesSum(root);
        System.out.println("i = " + i);
    }

    public static int deepestLeavesSum(TreeNode root) {
        int i = calculateDeepestLeaves(root);
        return calculateSum(root, 0, i);

    }

    private static int calculateSum(TreeNode root, int i, int maxDeepth) {
        if (root == null) {
            return 0;
        }
        i++;
        if (i == maxDeepth) {
            return root.val;
        }
        int leftSum = calculateSum(root.left, i, maxDeepth);
        int rightSum = calculateSum(root.right, i, maxDeepth);

        return leftSum + rightSum;
    }

    public static int calculateDeepestLeaves(TreeNode root) {

        if (root == null) {
            return 0;
        }

        return Math.max(calculateDeepestLeaves(root.left) + 1,
                calculateDeepestLeaves(root.right) + 1);
    }
}
