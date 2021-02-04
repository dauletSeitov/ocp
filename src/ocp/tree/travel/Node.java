package ocp.tree.travel;

public class Node {

    private String data;
    private String key;
    private Node left;
    private Node right;

    public Node(String key, String data) {
        this.data = data;
        this.key = key;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data='" + data + '\'' +
                ", key='" + key + '\'' +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}




