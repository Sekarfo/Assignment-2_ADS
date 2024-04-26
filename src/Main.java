import Lists.MyArrayList;
import Lists.MyLinkedList;
public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> ma= new MyArrayList<>();
        ma.add(10);
        ma.add(2);
        ma.add(65);
        ma.add(8);
        ma.add(1);
        ma.sort();
        ma.display();

    }
}