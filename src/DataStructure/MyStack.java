package DataStructure;

import Lists.MyLinkedList;
import Lists.MyList;

import java.util.EmptyStackException;


public class MyStack<T extends Comparable<T>> {
    private MyLinkedList<T> stack;

    public MyStack() {
        stack = new MyLinkedList<T>();
    }

    public boolean empty() {
        return stack.size() == 0;
    }

    public int size() {
        return stack.size();
    }

    public T peek() {
        if (empty()) {
            throw new EmptyStackException();
        }
        return stack.getLast();
    }

    public T push(T element) {
        if (stack.size()==0){
            stack.add(element);
        }
        else {
            stack.addLast(element);
        }

        return element;
    }

    public T pop() {
        if (empty()) {
            throw new EmptyStackException();
        }
        else {
            stack.removelast();
            return stack.getLast();
        }

    }
}
