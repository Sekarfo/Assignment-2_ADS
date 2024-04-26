package Lists;

public class MainLists {
    public static void main(String[] args) {
        MyArrayList<Integer> ma= new MyArrayList<>();
        ma.add(8);
        ma.add(1);
        ma.add(3);
        ma.add(2);
        ma.add(5);
        ma.add(1,48);
        System.out.println("get size "+ma.size());
        System.out.println("get element index 1: "+ma.get(1));
        System.out.println("get last "+ ma.getLast());
        System.out.println("get first "+ ma.getFirst());
        System.out.println("array list");
        ma.display();
        ma.remove(1);
        ma.sort();
        System.out.println();
        System.out.println("array list after remove index:1 and sort ");
        ma.display();


    }
}
