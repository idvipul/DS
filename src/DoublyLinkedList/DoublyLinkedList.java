package DoublyLinkedList;

public class DoublyLinkedList {
    public static void main(String[] args) {
        List list = new List();

        list.prepend(10);
        list.prepend(20);
        list.printList();
        System.out.println();

        list.append(30);
        list.printList();
        System.out.println();

        list.append(50);
        list.printList();
        System.out.println();

        list.deleteWithValue(20);
        list.printList();
        System.out.println();

        list.deleteWithValue(30);
        list.printList();
        System.out.println();

        list.insertAtPosition(2,30);
        list.printList();
        System.out.println();
    }
}
