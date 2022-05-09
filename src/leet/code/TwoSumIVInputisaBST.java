package leet.code;

public class TwoSumIVInputisaBST {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.right.right = new TreeNode(7);

        boolean target = new TwoSumIVInputisaBST().findTarget(new TreeNode(1), 9);
        System.out.println("target = " + target);
    }

    public boolean findTarget(TreeNode root, int k) {

        return dfs(root, k, root);

    }


    public boolean dfs(TreeNode current, int k, TreeNode root) {

        if (current == null) {
            return false;
        }
        if (find(root, k - current.val)) {
            return true;
        }
        if (dfs(current.left, k, root)) {
            return true;
        }
        if (dfs(current.right, k, root)) {
            return true;
        }
        return false;

    }


    private boolean find(TreeNode root, int val) {

        if (root == null) {
            return false;
        }
        if (root.val == val) {
            return true;
        }
        if (root.val > val) {
            return find(root.left, val);
        } else {
            return find(root.right, val);
        }

    }
}
