package comJavaPractice.example.JavaPractice.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class Queuee {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
 

        // offer()
        q.offer("A");
        q.offer("B");
        q.offer("C");

        System.out.println(q);

        // peek()
        System.out.println("Front : " + q.peek());

        // poll()
        System.out.println("Removed : " + q.poll());

        System.out.println(q);

        // size()
        System.out.println(q.size());

        // for traverse
        while(!q.isEmpty()) {
        System.out.println(q.poll());
    }
}
