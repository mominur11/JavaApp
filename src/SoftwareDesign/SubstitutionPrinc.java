package SoftwareDesign;

public class SubstitutionPrinc {

    public static void main(String[] args) {

        Ostrich bird = new Ostrich();
        bird.fly();
    }
}

    class Bird{
        // Base functionality link to Bird
        public void fly(){
            System.out.println("Flying Bird");
        }
    }

    class Sparrow extends Bird{

    }

    class Ostrich extends Bird{

    }