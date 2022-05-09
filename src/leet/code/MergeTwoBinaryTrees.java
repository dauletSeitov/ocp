package leet.code;

public class MergeTwoBinaryTrees {
    public static void main(String[] args) {

        TreeNode left = new TreeNode(1);
        left.left = new TreeNode(3);
        left.right = new TreeNode(2);
        left.left.left = new TreeNode(5);

        TreeNode right = new TreeNode(2);
        right.left = new TreeNode(1);
        right.right = new TreeNode(3);
        right.left.right = new TreeNode(4);
        right.right.right  = new TreeNode(7);

        TreeNode treeNode = new MergeTwoBinaryTrees().mergeTrees(null, new TreeNode(5));
        System.out.println(treeNode);
    }

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode l = new TreeNode(0);
        l.left = root1;

        TreeNode r = new TreeNode(0);
        r.left = root2;

        mergeTreesInner(l, r);
        return root1;
    }

    public TreeNode mergeTreesInner(TreeNode root1, TreeNode root2) {

        if (root1 == null && root2 == null) {
            return null;
        }

        if (root2 != null) {
            if (root1.left == null && root2.left != null) {
                root1.left = new TreeNode(root2.left.val);
            } else if (root1.left != null && root2.left != null) {
                root1.left.val += root2.left.val;
            }

            if (root1.right == null && root2.right != null) {
                root1.right = new TreeNode(root2.right.val);
            } else if (root1.right != null && root2.right != null) {
                root1.right.val += root2.right.val;
            }


            mergeTreesInner(root1.left, root2.left);
            mergeTreesInner(root1.right, root2.right);

        }
        return root1;

    }
}
