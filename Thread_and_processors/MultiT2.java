
// here don't need to make object of thread class 
//because we are inheriting thread class

class Processor1 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Processor 1 - Count: " + i);
        }
    }
}

class Processor2 extends  Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Processor 2 - Count: " + i);
        }
    }
}

public class MultiT2 {
    public static void main(String []args){
        Processor1 p1 = new Processor1();
        Processor2 p2 = new Processor2();


        p1.start();
        p2.start();
    }
}