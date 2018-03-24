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

    public void prepend(int data) {
        Node newNode = new Node();
        newNode.data = data;

        newNode.next = head;
        head = newNode;
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

    public void deleteAtHead() {
        if(head == null) {
            System.out.println("Linked List is empty");
        } else {
            head = head.next;
        }
    }

    public void deleteAtTail() {
        if(head == null || head.next == null) {
            System.out.println("No element present");
        } else {
            Node currentNode = head;
            Node previousNode = null;

            while(currentNode.next != null) {
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
            previousNode.next = null;
        }
    }

    public void deleteAtPosition(int position) {
        if(position == 0) {
            deleteAtHead();
        } else {
            Node currentNode = head;
            Node previousNode = null;

            for(int i = 0; i < position - 1; i++) {
                currentNode = currentNode.next;
            }
            previousNode = currentNode.next;
            currentNode.next = previousNode.next;
        }
    }

    public void deleteWithValue(int data) {
        if(head == null) {
            System.out.println("Linked list is empty");
        }

        if(head.data == data) {
            head = head.next;
        } else {
         Node currentNode = head;

         while(currentNode.next != null) {
             if(currentNode.next.data == data) {
                 currentNode.next = currentNode.next.next;
             }
             currentNode = currentNode.next;
         }
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
