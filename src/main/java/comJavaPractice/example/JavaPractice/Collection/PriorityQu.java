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

        pq.offer(30);
        pq.offer(333);
        pq.offer(21);

        System.out.println(pq);

        System.out.println(pq.poll());

    }
}
