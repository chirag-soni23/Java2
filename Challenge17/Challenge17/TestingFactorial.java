package Challenge17;
import java.util.stream.IntStream;
public class TestingFactorial {
       public static void main(String[] args) {
              System.out.println("Welcome to Factorial");
              int num = 10;
              long result = isFactorial(num);
              System.out.printf("Factorial of %d is: %d\n",num,result);
              IntStream.range(2, num).reduce((a,b)->a*b).ifPresent(System.out::println);
              
       }
       public static long isFactorial(int num){
              if(num == 0 || num == 1){
                     return 1;
              }
              long fact = 1;
              for (int i = 2; i <= num; i++) {
                     fact *= i;                   
              }
              return fact;
       }
}
