package FunctionalProgramming;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingReduce {
       public static void main(String[] args) {
              List<Integer> number = List.of(1, 2, 3, 4, 5);

              System.out.println("For Each");
              int sum = 0;
              for (Integer i : number) {
                     sum += i;                        
              }
              System.out.println(sum);




              int newSum = number.stream().reduce(0, new BinaryOperator<Integer>() {
                     @Override
                     public Integer apply(Integer integer1, Integer integer2) {
                            return integer1 + integer2;
                     }
              });
              System.out.println(newSum);

              System.out.println("Printing reduce method");
              int newSum2 = number.stream().reduce(0, (a,b)->a+b);
              System.out.println(newSum2);

              System.out.println("Get max value");
              int max = number.stream().reduce(Integer.MIN_VALUE,(a,b)-> a>b ? a:b);
              System.out.println(max);

       }
}
