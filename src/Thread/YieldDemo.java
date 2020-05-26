package Thread;

public class YieldDemo {
    public static void main(String[] args){
        PsRunnable r = new PsRunnable();
        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i<10; i++){
            System.out.println("Main Thread");
        }

    }
}

class PsRunnable implements Runnable{
    public void run(){
        for(int i = 0; i <10; i++){
            System.out.println("Sub Thread");
            Thread.yield();
        }
    }
}
