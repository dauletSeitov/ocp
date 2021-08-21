package leet.code;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return ""+val;
    }
}

public class MaximumDepthOfBinaryTree {

    public static int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int l = maxDepth(root.left) + 1;
        int r = maxDepth(root.right) + 1;

        return Math.max(l, r);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(15);
        int i = maxDepth(treeNode);
        System.out.println("i = " + i);
    }
}
