import java.util.List;

public class Testingmethodrefrence{
     public static void main(String[] args) {
       List<Integer> numbers = List.of(1,2,3,4,5);
       numbers.stream().filter(num -> num % 2!=0).forEach(System.out::println);

       int sum = numbers.stream().reduce(0,Integer::sum);
       System.out.printf("Sum of list is %d",sum);
     }
}