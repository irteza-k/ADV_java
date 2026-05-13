package comJavaPractice.example.JavaPractice.Threading;

class MyTask implements Runnable{
    public void run(){
        System.out.println("Running..........");
    }
}



public class RunnableIntface {
    public static void main(String[] args) {
        //MyTask task = new MyTask();

        Thread t0=  new Thread();
        Thread t1 = new Thread();

        t0.start();
        t1.start();
        System.out.println(t0);
        System.out.println(t1);

        // why create task var
        // coz sometime we need to resue task or access the task data
        //or share same task among thread
        //used in synchronization
        MyTask task = new MyTask();

        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

    }
}
