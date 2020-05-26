package SoftwareDesign;

public class SubstitutionPrincMain {

    public static void main(String[] args) {

        Ostrichs birds = new Ostrichs();
        birds.info();
    }
}

class Birds{
    // Base functionality link to Bird
    public void info(){
        System.out.println("Bird");
    }
}

class FlyingBird extends Birds{
    public void fly(){
        System.out.println("Flying Bird");
    }
}

class Sparrows extends FlyingBird{

}

class Ostrichs extends Birds{

}
