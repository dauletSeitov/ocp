package leet.code;

public class ValidateBinarySearchTree {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right =  new TreeNode(7);
        root.right.left =  new TreeNode(4);
        root.right.right =  new TreeNode(8);


        boolean validBST = new ValidateBinarySearchTree().isValidBST(root);
        System.out.println("validBST = " + validBST);
    }

    public boolean isValidBST(TreeNode root) {

        return dodo(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }


    public boolean dodo(TreeNode root, int left, int right) {
//                                          5       max
        if (root == null) {
            return true;
        }
        if (!(left < root.val && root.val < right)) {
            return false;
        }

        return dodo(root.left, left, root.val) && dodo(root.right, root.val, right);

    }
}
