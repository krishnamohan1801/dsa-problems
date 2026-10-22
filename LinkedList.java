class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class MyLinkedList {
    ListNode head;
    int size;

    public MyLinkedList() {
        head = new ListNode(0);   // dummy node
        size = 0;
    }
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    // Get value at index
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        ListNode curr = head;

        // move to the actual node at given index
        for (int i = 0; i <= index; i++) {
            curr = curr.next;
        }

        return curr.val;
    }
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    // Add node at head
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    // Add node at tail
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    // Add node at a specific index
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }

        ListNode curr = head;

        // move to node before the target index
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        ListNode newNode = new ListNode(val);
        newNode.next = curr.next;
        curr.next = newNode;

        size++;
    }
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    // Delete node at a specific index
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }

        ListNode curr = head;

        // move to node before the target index
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;
        size--;
    }
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    // Print the linked list
    public void printList() {
        ListNode curr = head.next;   // skip dummy node

        if (curr == null) {
            System.out.println("Linked List is empty");
            return;
        }

        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        } 

        System.out.println("null");
    }
}
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public class LinkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        // Initially empty
        System.out.println("Initial Linked List:");
        list.printList();

        // addAtHead
        list.addAtHead(10);
        System.out.println("\nAfter addAtHead(10):");
        list.printList();

        // addAtTail
        list.addAtTail(20);
        System.out.println("\nAfter addAtTail(20):");
        list.printList();

        // addAtTail again
        list.addAtTail(30);
        System.out.println("\nAfter addAtTail(30):");
        list.printList();

        // addAtHead again
        list.addAtHead(5);
        System.out.println("\nAfter addAtHead(5):");
        list.printList();

        // addAtIndex
        list.addAtIndex(2, 15);   // insert 15 at index 2
        System.out.println("\nAfter addAtIndex(2, 15):");
        list.printList();

        // get values
        System.out.println("\nValue at index 0: " + list.get(0));
        System.out.println("Value at index 1: " + list.get(1));
        System.out.println("Value at index 2: " + list.get(2));
        System.out.println("Value at index 3: " + list.get(3));
        System.out.println("Value at index 4: " + list.get(4));

        // deleteAtIndex
        list.deleteAtIndex(2);   // delete element at index 2
        System.out.println("\nAfter deleteAtIndex(2):");
        list.printList();

        // delete head
        list.deleteAtIndex(0);
        System.out.println("\nAfter deleteAtIndex(0):");
        list.printList();

        // get invalid index
        System.out.println("\nTrying get(10): " + list.get(10));
    }
}