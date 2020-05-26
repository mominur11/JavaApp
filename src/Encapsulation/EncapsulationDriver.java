package Encapsulation;

public class EncapsulationDriver {

    public static void main(String[] args){

        // ebvoke method
        Account acc = new Account();
        acc.setBalance(1200);

       System.out.println(acc.getBalance());
    }
}
