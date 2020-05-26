package Thread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class DrivingThread {

    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();

        ProducerThread producer = new ProducerThread(q,"Producer");
        ProducerThread Newproducer = new ProducerThread(q,"New Producer");
        ConsumerThread consumer = new ConsumerThread(q);

        producer.start();
        Newproducer.start();
        consumer.start();
    }
}

class ProducerThread extends Thread{

    Queue<Integer>q;
    ProducerThread(Queue<Integer> q, String name){
        super(name);
        this.q = q;
    }
    public void run(){
        while (true) {
            synchronized (q) {
                while (q.size() == 3) {
                    try {
                        System.out.println(Thread.currentThread().getName()+" :q is full .... for consumer to consume");
                        q.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Random r = new Random();
                int i = r.nextInt();
                q.add(i);
                System.out.println(Thread.currentThread().getName()+"item produced: " +i);
                q.notifyAll();
            }
        }
    }
}

class ConsumerThread extends Thread{

    Queue<Integer>q;
    ConsumerThread(Queue<Integer> q){
        this.q = q;

    }

    public void run(){
        while (true) {
            synchronized (q) {
                while (q.isEmpty()) {
                    try {
                        System.out.println("q is empty....waiting for producer to produce");
                        q.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
               System.out.println("Item consumed:"+ q.remove());
                q.notifyAll();
            }
        }
    }
}