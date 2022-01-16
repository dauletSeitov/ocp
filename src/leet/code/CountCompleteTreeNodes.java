package leet.code;

public class CountCompleteTreeNodes {

    public static void main(String[] args) {


        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);


        int i = countNodes(root);
        System.out.println("i = " + i);
    }

    public static int countNodes(TreeNode root) {

        if (root == null) {
            return 0;
        }
        int depth = getDepth(root);
        System.out.println(depth);

        int noNodeCount = dfs(root, 1, depth);
        System.out.println(noNodeCount);

        return (int) Math.pow(2, depth - 1) * 2 - 1 - noNodeCount;
    }

    private static int dfs(TreeNode node, int l, int depth) {
        if (node == null) {
            return 0;
        }
        if (l == depth - 1) {
            int val = 0;
            if (node.right == null) {
                val++;
            }

            if (node.left == null) {
                val++;
            }
            return val;
        }

        int val = 0;
        val = val + dfs(node.right, l + 1, depth);
        val = val + dfs(node.left, l + 1, depth);
        return val;

    }


    private static int getDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return getDepth(node.left) + 1;
    }
}
