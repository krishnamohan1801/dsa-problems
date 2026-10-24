//import java.util.ArrayList;
//import java.util.List;
/* 

implementation of stack methods using ArrayList
class MyStack 
{
    List<Integer> list;

    public MyStack() {
        list = new ArrayList<Integer>();
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public void push(int x) {
        list.add(x);
    }

    public boolean pop() {
        if (isEmpty()) return false;

        list.remove(list.size() - 1);
        return true;
    }

    public int size() {
        return list.size();
    }
}

class Main 
{
    public static void main(String[] args) 
    {

        MyStack stack = new MyStack();

        stack.push(100);
        stack.push(200);
        stack.push(300);

        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.top());

        System.out.println(stack.isEmpty());

        System.out.println(stack.size());

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.isEmpty());

        System.out.println(stack.pop());
    }
}

*/


// stack in Java
import java.util.Stack;

class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(100);
        stack.push(200);
        stack.push(300);

        System.out.println(stack.peek());

        System.out.println(stack.isEmpty());

        System.out.println(stack.size());

        System.out.println(stack.pop());

        System.out.println(stack.peek()); // 200

        System.out.println(stack.isEmpty()); // false

        System.out.println(stack.size()); // 2

        System.out.println(stack.pop());

        System.out.println(stack.pop());

        System.out.println(stack.isEmpty());
    }
}