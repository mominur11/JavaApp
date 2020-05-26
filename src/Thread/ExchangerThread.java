package Thread;

import java.util.concurrent.Exchanger;

public class ExchangerThread {

    public static void main(String[] args){
        Exchanger e = new Exchanger();
        Thread t1 = new Thread(new Exchange(e,"Apple"));
        Thread t2 = new Thread(new Exchange(e,"Banana"));

        t1.start();
        t2.start();
    }
}

class Exchange implements Runnable{
    Exchanger e;
    String item;
    Exchange(Exchanger e, String item){
        this.e = e;
        this.item = item;
    }

    public void run(){
        try {
            String previous = item;
            item = (String) e.exchange(item);
            System.out.println(Thread.currentThread().getName()+" exchanged "+previous+ " for "+item);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}