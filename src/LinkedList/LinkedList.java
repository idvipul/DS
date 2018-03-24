package LinkedList;

public class LinkedList {
    public static void main(String[] args) {
        List list = new List();

        list.append(20);
        list.append(50);
        list.append(30);
        list.append(60);

        list.printList();
        System.out.println();

        list.prepend(10);

        list.printList();
        System.out.println();

        list.append(80);
        list.prepend(05);

        list.printList();
        System.out.println();

        list.insertAtPosition(2, 15);
        list.printList();
        System.out.println();

        list.insertAtPosition(0,1);
        list.printList();
        System.out.println();

        list.deleteAtHead();
        list.printList();
        System.out.println();

        list.deleteAtTail();
        list.printList();
        System.out.println();

        list.deleteAtPosition(5);
        list.printList();
        System.out.println();

        list.deleteWithValue(15);
        list.printList();
        System.out.println();


    }
}
