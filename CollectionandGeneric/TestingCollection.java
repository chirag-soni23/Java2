package CollectionandGeneric;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestingCollection {
       public static void main(String[] args) {
              List<Integer> integer = new ArrayList<>();
              integer.add(30);
              integer.add(50);
              integer.add(40);
              integer.add(10);
              integer.add(20);
              Collections.sort(integer);
              Collections.reverse(integer);
              Collections.shuffle(integer);
              Utility.print(integer);

              // Unmodifed List

              // List<Integer> unmodified = Collections.unmodifiableList(integer);
              // unmodified.add(22);

             
       }
}
