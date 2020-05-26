package DesignPatterns;

class EagerSingletonMain {
    public static void main(String args[]){
        EagerSingleton obj = EagerSingleton.getInstance();
    }
}

public class EagerSingleton {
    private static final EagerSingleton singleton = new EagerSingleton();

    private EagerSingleton(){
        System.out.println("Singleton Created");
    }

    public static EagerSingleton getInstance(){
       return singleton;
    }
}
