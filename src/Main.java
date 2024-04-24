import Lists.MyLinkedList;
public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> ml=new MyLinkedList();
        ml.add(1);
        ml.add(2);
        ml.add(3);
        ml.add(4);
        ml.add(5);
        ml.add(1,150);
        ml.get(1);
        ml.getFirst();
        ml.display();
    }
}
