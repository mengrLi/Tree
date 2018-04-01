package Binary;

import Binary.Tree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("/Users/mengranli/Documents/GitHub/Tree/src/data/T2"));

        Tree tree = new Tree();
        while (scanner.hasNext()) {
            String parentName = scanner.next();
            String leftName = scanner.next();
            String rightName = scanner.next();


            Node parent = tree.getorCreateNode(parentName);
            if (tree.getRoot() == null) {
                tree.setRoot(parent);

            }

            if (!leftName.equals("0")) {
                Node left = tree.getorCreateNode(leftName);
                parent.setLeft(left, true);
            }
            if (!rightName.equals("0")) {
                Node right = tree.getorCreateNode(rightName);
                parent.setRight(right, true);
            }

        }
        // tree.preOrderTraverse2();
        List<Node> nodes = tree.preOrderList();
        for (Node node : nodes) {
            System.out.println(node.getName());
        }

    }

}
