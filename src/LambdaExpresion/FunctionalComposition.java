package LambdaExpresion;

import java.util.function.Function;

public class FunctionalComposition {

    public static void main(String[] args){
        Function<Integer,Integer> multiply= (value)->value*2;
        Function<Integer,Integer> add= (value)->value+3;

        // use function
        Function<Integer,Integer> multiplyThenAdd= multiply.andThen(add);
        Integer result = multiplyThenAdd.apply(4);   // value = 4
        System.out.println(result);
    }
}
