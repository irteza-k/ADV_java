package comJavaPractice.example.JavaPractice.Collection;

import java.util.LinkedList;

public class LinkedLst {
    public static void main(String[] args) {


        LinkedList<String> list = new LinkedList<>();

        list.add("B");
        list.add("C");

        list.addFirst("A");
        list.addLast("D");

        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.removeFirst();

        System.out.println(list);
    }
}
