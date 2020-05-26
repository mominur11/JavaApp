package Thread;

public class JoinThread {
    public static void main(String[] args) throws InterruptedException {

        Worker1 w1 = new Worker1();
        Thread t1 = new Thread(w1);
        Worker2 w2 = new Worker2();
        Thread t2 = new Thread(w2);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Supervisor: let them and build final block");
    }
}

class Worker1 implements Runnable{
    public void run(){
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Worker 1: Built a block");
    }
}



class Worker2 implements Runnable{
    public void run(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Worker 2: Built a block");
    }
}