package comJavaPractice.example.JavaPractice.Collection;

import java.util.HashMap;

public class HashSt {
    public static void main(String[] args) {
        HashMap<Integer, String> student = new HashMap<>();

        student.put(1,"aaa");
        student.put(2,"asdsad");
        System.out.println(student);

    for(Map.Entry<Integer, String> e : student.entrySet()) {
    System.out.println(e.getKey() + " " + e.getValue());
    }
}
