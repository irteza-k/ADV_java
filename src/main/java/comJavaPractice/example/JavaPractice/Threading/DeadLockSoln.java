package comJavaPractice.example.JavaPractice.Threading;



class Pen {}

class Paper {}

public class DeadLockSoln {

    public static void main(String[] args) {

        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread t1 = new Thread(() -> {

            synchronized (pen) {

                System.out.println("T1 has pen");

                try {
                    Thread.sleep(100);
                }
                catch(Exception e) {}

                synchronized (paper) {

                    System.out.println("T1 has paper");
                }
            }
        });

        Thread t2 = new Thread(() -> {

            synchronized (pen) {

                System.out.println("T2 has pen");

                try {
                    Thread.sleep(100);
                }
                catch(Exception e) {}

                synchronized (paper) {

                    System.out.println("T2 has paper");
                }
            }
        });

        t1.start();
        t2.start();
    }
}