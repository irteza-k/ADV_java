package comJavaPractice.example.JavaPractice.Collection;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQu {
    public static void main(String[] args) {
        //priorityqueue be default, its ascending order
        //PriorityQueue<Integer> pq = new PriorityQueue<>();

        // to make it descending order do it
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.offer(40);
        pq.offer(10);
        pq.offer(30);
        pq.offer(20);

        System.out.println(pq);

        // peek()
        System.out.println("Top : " + pq.peek());

        // poll()
        System.out.println("Removed : " + pq.poll());

        System.out.println(pq);

    }
}
