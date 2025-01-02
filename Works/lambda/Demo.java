import java.util.function.*;
public class Demo {
    public static void main(String[] args) {
        //without using lambda function
        // Operation prod= new Multiplication();
        // System.out.println(prod.operate(5, 7));
        
        //Using lambda function for implementing functional interface operation
        Operation prodLambda=( num1,num2) -> num1*num2;
        System.out.println(prodLambda.operate(5, 7));


        //inbuilt
        BiFunction<Integer, Integer,Integer> prod3=(no1,no2)->no1*no2;
        System.out.println(prod3.apply(5, 7));
    }
}
