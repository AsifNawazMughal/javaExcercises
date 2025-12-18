class Processor1 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Processor 1 - Count: " + i);
        }
    }
}

class Processor2 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Processor 2 - Count: " + i);
        }
    }
}

public class MultiT {
    public static void main(String[] args) {
        Processor1 p1 = new Processor1();
        Processor2 p2 = new Processor2();


        // Creating threads from Runnable class
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        t1.start();
        t2.start();
    }
}