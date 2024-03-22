import java.util.List;

public class Oddfilter {
       public static void main(String[] args) {
              List<Integer> number = List.of(1,2,3,4,5,6,7,8,9,10);
              number.stream().filter(num -> num % 2 != 0).forEach(num->System.out.println(num));
       }
}
