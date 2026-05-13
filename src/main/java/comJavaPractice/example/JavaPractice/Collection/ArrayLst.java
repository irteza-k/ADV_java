package comJavaPractice.example.JavaPractice.Collection;

import java.util.ArrayList;


public class ArrayLst {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        // add()
        names.add("Irteza");
        names.add("Zafeer");
        names.add("Khan");

        System.out.println("Original List : " + names);

        // get()
        System.out.println("Element at index 1 : " + names.get(1));

        // set()
        names.set(1, "Ahmed");
        System.out.println("After set() : " + names);

        // remove()
        names.remove(2);
        System.out.println("After remove() : " + names);

        // size()
        System.out.println("Size : " + names.size());

        // contains()
        System.out.println("Contains Irteza ? " + names.contains("Irteza"));

        // isEmpty()
        System.out.println("Is list empty ? " + names.isEmpty());

        // add using index
        names.add(1, "Ali");
        System.out.println("After adding at index : " + names);

        // clear()
        names.clear();
        System.out.println("After clear() : " + names);

        // For traverse
        
        for(String s : names) {
            System.out.println(s);
    }
}
