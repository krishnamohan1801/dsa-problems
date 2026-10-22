class MyCircularQueue {
    int[] arr;
    int count;
    int maxSize;
    int head;


    public MyCircularQueue(int k) {
        arr = new int[k] ;
        count = 0;
        maxSize = k;
        head = 0;
    }
    
    public boolean enQueue(int value) {
       if ( isFull() ) return false;
       arr[ (head + count) % maxSize ] = value;
       count++ ;
       return true;  
    }
    
    public boolean deQueue() {
        if ( isEmpty() ) return false;
        head = (head + 1) % maxSize;
        count-- ; 
        return true;
    }
    
    public int Front() {
        if ( isEmpty() ) return -1 ;
        return arr[head];
    }
    
    public int Rear() {
        if ( isEmpty() ) return -1 ;
        return arr[ (head + count - 1) % maxSize ] ;
    }
    
    public boolean isEmpty() {
        return count == 0;
    }
    
    public boolean isFull() {
        return count == maxSize;
    }
}

//----------------------------------------------------------------------------------------------------------------------------------------------
/*

class MyCircularQueue {

    int[] queue;
    int front;
    int rear;
    int size;
    int capacity;

    public MyCircularQueue(int k) {
        queue = new int[k];
        capacity = k;
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean enQueue(int value) {

        if (isFull())
            return false;

        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;

        return true;
    }

    public boolean deQueue() {

        if (isEmpty())
            return false;

        front = (front + 1) % capacity;
        size--;

        return true;
    }

    public int Front() {

        if (isEmpty())
            return -1;

        return queue[front];
    }

    public int Rear() {

        if (isEmpty())
            return -1;

        return queue[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}

*/

//----------------------------------------------------------------------------------------------------------------------------------------------------
/* 
class Node {
    int val;
    Node next;

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

class MyCircularQueue {
    Node head, tail;
    int count;
    int maxSize;

    public MyCircularQueue(int k) {
        count = 0;
        maxSize = k;
        head = null;
        tail = null;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }

        Node node = new Node(value, null);

        if (count == 0) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }

        count++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }

        head = head.next;
        count--;

        if (count == 0) {
            tail = null;
        }

        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }

        return head.val;
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }

        return tail.val;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == maxSize;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        MyCircularQueue queue = new MyCircularQueue(5);

        System.out.println("Is Empty: " + queue.isEmpty());

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);

        System.out.print("Queue: ");
        queue.display();

        System.out.println("Front: " + queue.Front());
        System.out.println("Rear: " + queue.Rear());

        queue.deQueue();

        System.out.print("After deQueue: ");
        queue.display();

        System.out.println("Front: " + queue.Front());
        System.out.println("Rear: " + queue.Rear());

        queue.enQueue(40);
        queue.enQueue(50);
        queue.enQueue(60);

        System.out.print("Queue: ");
        queue.display();

        System.out.println("Is Full: " + queue.isFull());

        System.out.println("Trying to insert 70: " + queue.enQueue(70));

        while (!queue.isEmpty()) {
            System.out.println("Removed: " + queue.Front());
            queue.deQueue();
        }

        System.out.println("Is Empty: " + queue.isEmpty());
    }
}



Important Note

Although the class is named MyCircularQueue, this implementation is not actually a circular queue.

A true circular queue:

uses a circular array (or makes the last node point back to the first in a circular linked list),
reuses freed positions after dequeues.

This code is actually a bounded queue implemented using a singly linked list. The maxSize variable simply limits how many elements can be stored, but there is no circular linking of nodes. This distinction is important for interviews and DSA concepts.
*/