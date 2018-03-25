package Trees;

public class Node {

    Node left;
    Node right;
    int value;

    public Node(int data) {
        this.value = data;
    }

    public void insert(int data) {
        if (value <= data) {
            if (left == null) {
                left = new Node(data);
            } else {
                left.insert(data);
            }
        } else {
            if (right == null) {
                right = new Node(data);
            } else {
                right.insert(data);
            }
        }
    }

    public boolean contains(int data) {
        if (value == data) {
            return true;
        } else if (value < data) {
            if (left == null) {
                return false;
            } else {
                left.contains(data);
                return  true;
            }
        } else {
            if (right == null) {
                return false;
            } else {
                right.contains(data);
                return true;
            }
        }
    }

    public void printInOrderTraversal() {
        if (left != null) {
            left.printInOrderTraversal();
        }
        System.out.print(value + "\t");
        if (right != null) {
            right.printInOrderTraversal();
        }
    }

    public void printPreOrderTraversal() {
        System.out.print(value + "\t");
        if (left != null) {
            left.printPreOrderTraversal();
        }
        if (right != null) {
            right.printPreOrderTraversal();
        }
    }

    public void printPostOrderTraversal() {
        if (left != null) {
            left.printPostOrderTraversal();
        }
        if (right != null) {
            right.printPostOrderTraversal();
        }
        System.out.print(value + "\t");
    }
}
