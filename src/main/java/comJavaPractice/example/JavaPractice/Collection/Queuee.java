package comJavaPractice.example.JavaPractice.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class Queuee {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(10);
        q.offer(20);

        System.out.println(q);
        System.out.println(q.poll());
    }
}
