package comJavaPractice.example.JavaPractice.Threading;


class MyThread extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName() + " : "+ i );

        try{
            Thread.sleep(1000);
        }
        catch (Exception e) {
            System.out.println(e);
        }

        }
    }
}



public class Threadd {
    public static void main(String[] args) {
        MyThread t0 = new MyThread();
        MyThread t1 = new MyThread();
        t0.start();
        t1.start();
    }
}
