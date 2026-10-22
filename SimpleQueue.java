import java.util.ArrayList;
import java.util.List;

class MySimpleQueue {

    List<Integer> list;
    int ptr;

    public MySimpleQueue() {
        list = new ArrayList<>();
        ptr = 0;
    }

    public void enqueue(int x) {
        list.add(x);
    }
    
    public boolean isEmpty() {
        return ptr >= list.size();
    }

    public boolean dequeue() {
        if (isEmpty()) {
            return false;
        }

        ptr = ptr + 1;
        return true;
    }

    public int front() {
        return list.get(ptr);
    }

}

class Main {
    public static void main(String[] args) {

        MySimpleQueue queue = new MySimpleQueue();

        queue.enqueue(10);
        System.out.println(queue.front());

        queue.enqueue(20);
        System.out.println(queue.front());

        queue.enqueue(30);
        System.out.println(queue.front());

        queue.dequeue();
        System.out.println(queue.front());
    }
}







