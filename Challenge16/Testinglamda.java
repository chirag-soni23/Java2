import java.util.function.BinaryOperator;

public class Testinglamda{
       public static void main(String[] args) {
              BinaryOperator<Integer> multi = (a,b) -> a * b;
              int sum = multi.apply(4, 5);
              System.out.println(sum);
       }
       
}