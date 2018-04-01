package Binary;

public class Node {
    private String name;

    public Node(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private Node left;
    private Node right;
    private Node parent;


    public Node getLeft() {
        return left;

    }

    public Node getParent() {
        return parent;
    }

    public Node getRight() {
        return right;
    }

    public void setLeft(Node node, boolean reverse) {
        left = node;
        if (reverse) {
            node.parent = this;
        }
    }

    public void setRight(Node node, boolean reverse) {
        left = node;
        if (reverse) {
            node.parent = this;
        }
    }

    public void preOrderVisit() {
        System.out.println(name);
        if (left != null) {
            left.preOrderVisit();
        }

        if (right != null) {
            right.preOrderVisit();
        }
    }
}
