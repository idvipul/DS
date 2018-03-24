package DoublyLinkedList;

public class List {

    public class Node {
        Node previous;
        int data;
        Node next;
    }

    Node head;

    public void prepend(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (head == null) {
            head = newNode;
        } else {
            newNode.previous = null;
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

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
            newNode.previous = currentNode;
            currentNode.next = newNode;
            newNode.next = null;
            currentNode = newNode;
        }
    }

    public void deleteWithValue(int data) {
        if(head == null) {
            System.out.println("Doubly Linked is empty");
        }

        if(head.data == data) {
            head = head.next;
        } else {
            Node currentNode = head;

            while(currentNode.next != null){
                if(currentNode.next.data == data) {
                    currentNode.next = currentNode.next.next;
                }
                currentNode = currentNode.next;
            }
        }
    }

    public void insertAtPosition(int position, int data) {
        Node newNode = new Node();
        newNode.data = data;

        if(position == 0) {
            prepend(data);
        } else {
            Node currentNode = head;

            for (int i = 0; i < position - 1; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
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

