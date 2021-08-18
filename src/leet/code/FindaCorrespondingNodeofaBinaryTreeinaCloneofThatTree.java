package leet.code;

public class FindaCorrespondingNodeofaBinaryTreeinaCloneofThatTree {
    public static void main(String[] args) {

    }

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return  search(cloned, target);
    }

    private TreeNode search(TreeNode root, TreeNode target) {
        if (root == null) {
            return null;
        }
        if (root.val == target.val) {
            return root;
        }
        TreeNode leftResult = search(root.left, target);
        if (leftResult != null) {
            return leftResult;
        }
        TreeNode rightResult = search(root.right, target);

        if (rightResult != null) {
            return rightResult;
        }

        return null;
    }

}
