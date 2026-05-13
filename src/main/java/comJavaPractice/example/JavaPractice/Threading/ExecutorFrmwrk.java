package comJavaPractice.example.JavaPractice.Threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFrmwrk {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for(int i=1; i<=1000; i++){
            int taskID =i;

            executor.execute(()->{
                System.out.println(Thread.currentThread().getName() +"executing task " + taskID);
            });
        }
        executor.shutdown();
    }
}
