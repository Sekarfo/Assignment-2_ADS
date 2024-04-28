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
        System.out.println("MyArrayList ");
        System.out.println("get size "+ma.size());
        System.out.println("get element index 1: "+ma.get(1));
        System.out.println("get last "+ ma.getLast());
        System.out.println("index of 1: "+ma.indexOf(1));
        System.out.println("get first "+ ma.getFirst());
        System.out.println("array list");
        ma.display();
        ma.remove(1);
        ma.sort();
        System.out.println();
        System.out.println("array list after remove index:1 and sort ");
        ma.display();
        System.out.println(" ");
        System.out.println("Set element at index 2 element 5 amd add first elemt 3");
        ma.set(2,5);
        ma.addFirst(3);
        ma.display();
        System.out.println();
        System.out.println("exist element 5-"+ma.exists(5)+"    last index of 5:"+ma.lastIndexOf(5));
        System.out.println("index Of 1:"+ma.indexOf(1));



        System.out.println("                      ");
        System.out.println("                      ");
        System.out.println("                      ");
        System.out.println("                      ");
        System.out.println("                      ");
        System.out.println("                      ");
        System.out.println("                      ");
        System.out.println("                      ");
        System.out.println("   MyLinkedList       ");
        MyLinkedList<Integer> ml=new MyLinkedList<>();
        ml.add(4);
        ml.add(1);
        ml.add(9);
        ml.add(7);
        ml.add(2);
        ml.add(3);
        ml.add(1,5);
        System.out.println("Linked list : ");
        ml.display();
        System.out.println("  get size "+ml.size());
        System.out.println("get first "+ml.getFirst());
        System.out.println(" get last "+ ml.getLast());

        ml.remove(1);
        System.out.println("remove element at index 1");
        ml.display();
        System.out.println();

        ml.removeFirst();
        System.out.println("remove first element");
        ml.display();

        System.out.println();
        ml.removelast();
        System.out.println("remove last element");
        ml.display();
        System.out.println();

        ml.set(1,3);
        System.out.println("set element index 1 - item 3 ");
        ml.display();
        System.out.println();


        ml.sort();
        System.out.println("sorted linked list ");
        ml.display();

        System.out.println();
        System.out.println("set at index 1 element 2 and add first element 3");
        ml.set(1,2);
        ml.addFirst(3);
        ml.display();


        System.out.println();
        System.out.println("is exist element 3-"+ml.exists(3)+" last index of 3:"+ ml.lastIndexOf(3));
        System.out.println("indexof 1:"+ml.indexOf(1));
    }
}
