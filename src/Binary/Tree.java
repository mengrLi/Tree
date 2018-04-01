package Binary;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Tree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    Map<String, Node> nodes = new HashMap<>();

    public Node getorCreateNode(String name) {
        Node node = nodes.get(name);
        if (node != null) {
            return node;
        }
        node = new Node(name);
        nodes.put(name, node);
        return node;
    }

    public void proOrderTraverse() {
        preOrderVisit(root);
    }

    private void preOrderVisit(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.getName());
        preOrderVisit(node.getLeft());
        preOrderVisit(node.getRight());

    }

    public List<Node> preOrderList() {
        LinkedList<Node> nodes = new LinkedList<>();
        preOrderCollect(root, nodes);
        return nodes;

    }

    private void preOrderCollect(Node node, List<Node> collector) {
        if (node == null) {
            return;
        }
        System.out.println(node.getName());
        collector.add(node);
        preOrderCollect(node.getLeft(), collector);
        preOrderCollect(node.getRight(), collector);

    }

    public void preOrderTraverse2() {
        root.preOrderVisit();
    }
}
