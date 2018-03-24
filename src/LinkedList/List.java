package LinkedList;

public class List {

    public class Node {
        int data;
        Node next;
    }

    Node head;

    public void append(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void printList() {
        Node newNode = head;
        while(newNode.next != null) {
            System.out.print(newNode.data + " \t");
            newNode = newNode.next;
        }
        System.out.print(newNode.data + " \t");
    }
}
