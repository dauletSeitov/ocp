package leet.code;

public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {

        if (root == null) {
            return true;
        }

        if (root.left != null) {
            if (root.val <= root.left.val) {
                return false;
            }
        }

        if (root.right != null) {
            if (root.val >= root.right.val) {
                return false;
            }
        }


        boolean validBST = isValidBST(root.left);

        boolean validBST1 = isValidBST(root.right);
        return validBST && validBST1;
    }
}
