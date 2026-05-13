package comJavaPractice.example.JavaPractice.Threading;

// Multiple threads running, accessing the obj, and changing the value, so the final result will get courrupted
// internally they are doing -= read count , increment ,read count
// so it become the race condiition
//Race Condition?
//When multiple threads access shared data simultaneously and result depends on execution order.
//So the Soln is  -= Synchronization
//Synchronization means:
//Only one thread can access critical section at a time.
//----------------------
//run this program without the Synchronization keyword to get the race condition
//----------------------

class Counter{
    int count =0;
     synchronized void increment(){
        count++;
    }
}
public class Synchronization {
    public static void main(String[] args) throws Exception {
        Counter c=  new Counter();

        Thread t1 = new Thread(() -> {
            for(int i=1; i<=1000; i++){
                c.increment();
            }
        });

        Thread t2 = new Thread(() -> {
           for(int i=1; i<=1000; i++){
               c.increment();
           }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}
