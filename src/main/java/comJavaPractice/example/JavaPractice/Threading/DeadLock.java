package comJavaPractice.example.JavaPractice.Threading;

class Pen1{}
class Paper1{}

public class DeadLock {

    public static void main(String[] args) {

        Pen1 pen = new Pen1();
        Paper1 paper = new Paper1();

        Thread t1 = new Thread(() -> {

            synchronized (pen) {

                System.out.println("T1 has pen");

                try { Thread.sleep(100); }
                catch(Exception e) {}

                synchronized (paper) {

                    System.out.println("T1 has paper");
                }
            }
        });

        Thread t2 = new Thread(() -> {

            synchronized (paper) {

                System.out.println("T2 has paper");

                try { Thread.sleep(100); }
                catch(Exception e) {}

                synchronized (pen) {

                    System.out.println("T2 has pen");
                }
            }
        });

        t1.start();
        t2.start();
    }
}