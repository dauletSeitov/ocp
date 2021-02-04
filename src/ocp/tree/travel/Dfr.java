package ocp.tree.travel;

public class Dfr {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.setRoot(new Node("1", "one"));

        tree.getRoot().setLeft(new Node("2", "two"));
        tree.getRoot().setRight(new Node("3", "three"));

        tree.getRoot().getLeft().setLeft(new Node("4", "four"));
        tree.getRoot().getLeft().setRight(new Node("5", "five"));

        tree.getRoot().getRight().setLeft(new Node("6", "six"));
        tree.getRoot().getRight().setRight(new Node("7", "seven"));


        String found = get(tree, "3");
        System.out.println("found = " + found);
    }

    private static String get(BinaryTree tree, String key) {
        if (tree == null || tree.getRoot() == null) {
            return null;
        }
        return dfr(tree.getRoot(), key);
    }

    private static String dfr(Node node, String key) {

        System.out.println("node.getKey() = " + node.getKey());
        if (key.equals(node.getKey())) {
            return node.getData();
        }

        if (node.getLeft() != null) {
            String found = dfr(node.getLeft(), key);
            if (found != null) {
                return found;
            }
        }
        if (node.getRight() != null) {
            String found = dfr(node.getRight(), key);
            if (found != null) {
                return found;
            }
        }
        return null;
    }

}
