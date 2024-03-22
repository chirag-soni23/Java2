import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency {
       public static void main(String[] args) {
              List<Integer> list = Arrays.asList(1,2,3,3,4,5,5,6);
              System.out.println(Collections.frequency(list, 1));
              System.out.println(Collections.frequency(list, 5));
              System.out.println(Collections.frequency(list, 3));
       }
}
