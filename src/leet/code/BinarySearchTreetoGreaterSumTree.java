package leet.code;

public class BinarySearchTreetoGreaterSumTree {
    public static void main(String[] args) {


        TreeNode root = new TreeNode(0);
        root.right = new TreeNode(1);
        //root.right = new TreeNode(6);
        TreeNode node = bstToGst(root);
        System.out.println("node = " + node);
    }

    static int sum = 0;

    public static TreeNode bstToGst(TreeNode root) {


        if (root == null) {
            return null;
        }
        System.out.println(root.val);
        bstToGst(root.right);


        root.val = sum + root.val;
        sum = root.val;


        bstToGst(root.left);

        return root;
    }
}
