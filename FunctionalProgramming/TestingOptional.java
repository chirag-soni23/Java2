import java.util.List;
import java.util.Optional;

public class TestingOptional {
       public static void main(String[] args) {
              List<Integer> numbers = List.of(1,2,3,4,5);
              Optional<Integer> sum = numbers.stream().reduce((a,b)->a+b);
              if(sum.isPresent()){
                     System.out.println(sum.get());
              }else{
                     System.out.println("List is empty");
              }
       }
}
