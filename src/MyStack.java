import Lists.MyList;

public class MyStack<T>  {
    private final MyList<T> list;

    public MyStack(MyList<T> list) {
        this.list = list;
    }

    public void push(T t) {
        list.addLast(t);
    }

    public T pop() {
        T t = list.getLast();
        list.removelast();
        return t;
    }

    public T get() {
        return list.getLast();
    }

    public int size() {
        return list.size();
    }
}
}
