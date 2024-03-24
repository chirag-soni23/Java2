import java.util.List;
import java.util.stream.Collectors;
public class Testingdistinct{
       public static void main(String[] args) {
              List<Integer> numbers = List.of(1,2,3,3,2,4,5,6,6,7,8,8);
              List<Integer> distinct = numbers.stream().distinct().collect(Collectors.toList());
              System.out.println(numbers);
              System.out.println(distinct);


       }
}