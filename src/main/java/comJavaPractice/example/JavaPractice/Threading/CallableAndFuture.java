package comJavaPractice.example.JavaPractice.Threading;

import java.util.concurrent.*;

public class CallableAndFuture {
    public static void main(String[] args) throws Exception{

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<Integer> task = () ->{
            int sum =0;

            for(int i=1; i<=5; i++){
                sum+=1;

            }
            return sum;
        };
        Future<Integer> future = executor.submit(task);

        System.out.println(future.get());
        executor.shutdown();
    }
}
