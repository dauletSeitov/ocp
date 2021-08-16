package leet.code;

public class SameTree {


    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null ^ q == null) {
            return false;
        }
        if (p == null) {
            return true;
        }
        if (p.val != q.val) {
            return false;
        }

        boolean left = isSameTree(p.left, q.left);
        boolean righ = isSameTree(p.right, q.right);

        return left && righ;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);


        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        boolean sameTree = isSameTree(root1, root2);
        System.out.println("sameTree = " + sameTree);
    }
}
