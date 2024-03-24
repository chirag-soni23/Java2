import java.util.List;

public class FinalTest {
       public static void main(String[] args) {
              List<String> str = List.of("1","2","3","4","5");
              str.stream().map(Integer::parseInt).map(num -> Math.pow(num, 2)).reduce(Double::sum).ifPresent(System.out::println);
              
       }
}
