package Trees;

public class BinaryTree {
    public static void main(String[] args) {
        Node tree = new Node(10);

        tree.insert(15);
        tree.insert(5);
        tree.insert(8);

        tree.printInOrderTraversal();
        System.out.println();

        tree.printPreOrderTraversal();
        System.out.println();

        tree.printPostOrderTraversal();

    }
}
