package comJavaPractice.example.JavaPractice.Threading;

class Shared {

    volatile boolean running = true;
}

public class Volatilee {

    public static void main(String[] args)
            throws Exception {

        Shared shared = new Shared();

        Thread t1 = new Thread(() -> {

            System.out.println("Thread started");

            while(shared.running) {

            }

            System.out.println("Stopped");
        });

        Thread t2 = new Thread(() -> {

            try {
                Thread.sleep(3000);
            }
            catch(Exception e) {}

            shared.running = false;

            System.out.println("Changed running to false");
        });

        t1.start();
        t2.start();
    }
}
