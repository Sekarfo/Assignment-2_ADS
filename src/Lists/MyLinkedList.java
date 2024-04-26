package Lists;

import Lists.MyList;

import java.util.Iterator;




public class MyLinkedList<T extends Object & Comparable<T>> implements MyList<T> {
    private Node<T> head;
    private int size;
    private Node<T> tail;



    public MyLinkedList() {
        head = null;
        size = 0;
        tail=null;
    }

    @Override
    public void add(T data) {
        size++;


        Node node = new Node(data);
        if (head == null) {
            head =tail= node;
            return;
        }

        tail.next= node;
        node.prev=  tail;
        tail=node;




    }
    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("index not correct");
    }

    @Override
    public void set(int index, T item) {
        checkIndex(index);
        Node<T> currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        currentNode.data = item;

    }

    @Override
    public void add(int index, T item) {
        checkIndex(index);  
        Node<T> newNode = new Node<>(item);
        Node<T> currentNode = head;
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        size++;


    }

    @Override
    public void addFirst(T item) {
        add(0, item);

    }

    @Override
    public void addLast(T item) {
        add(size-1,item);

    }

    @Override
    public T get(int index) {
        checkIndex(index);
        Node<T> currentNode = head;
        if (index == 0)
            return currentNode.data;
        else {
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
        }
        return currentNode.data;
    }

    @Override
    public T getFirst() {
        return get(0);
    }

    @Override
    public T getLast() {
        return get(size-1);
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        if (index == 0) {
            head = head.next;
        }
        else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }


    @Override
    public void removeFirst() {
        remove(0);

    }

    @Override
    public void removelast() {
        remove(size-1);

    }

    @Override
    public void sort() {
        if (head == null || head.next == null) {
            return;
        }
            boolean swapped;
            Node<T> node;

            if (head == null)
                return;

            do {
                swapped = false;
                node = head;

                while (node.next != null) {
                    if (node.data.compareTo(node.next.data) > 0) {
                        T t = node.next.data;
                        node.next.data = node.data;
                        node.data = t;
                        swapped = true;
                    }
                    node = node.next;
                }
            } while (swapped);
        }



    @Override
    public int indexOf(T item) {
        Node<T> node = head;
        int i =0;
        while(node.next!=null){
            i++;
            if(node.data==item){
                return i;
            }


        }
      return -1;
    }

    @Override
    public int lastIndexOf(T item) {
        return 0;
    }

    @Override
    public boolean exists(T item) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public void display() {
        Node<T> node = head;
        while(node.next!=null){
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.print(node.data);

    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }
    @Override
    public int size() {
        return size ;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
    private static class Node<T> {
        T data;
        Node<T> prev;
        Node<T> next;

        public Node(T item) {
            this.data = item;
            prev = null;
            next = null;
        }

        public Node(T item, Node<T> prev, Node<T> next) {
            this.data = item;
            this.prev = prev;
            this.next = next;
        }
    }


}
