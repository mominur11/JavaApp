package Exception;

public class ThrowException {

    public static void main(String[] args){
        ThrowException obj = new ThrowException();
        obj.validateAge(30);
        System.out.println("End of Program");
    }

    void validateAge(int age){
        if(age <18)
            throw new IllegalArgumentException("Not Eligible for votion");
        else
            System.out.println("Eligible for voting");
    }
}
