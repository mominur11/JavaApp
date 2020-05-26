package Exception;

public class ThrowsException {

    int division(int a, int b) throws ArithmeticException{
        int t = a/b;
        return t;
    }


    public static void main(String args[]){
        ThrowsException obj = new ThrowsException();
        try {
            System.out.println(obj.division(15,0));
        }
        catch (ArithmeticException e){
            System.out.println("You should't divid number by zero");
        }

    }
}
