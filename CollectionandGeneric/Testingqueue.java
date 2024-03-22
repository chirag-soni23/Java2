package CollectionandGeneric;

import java.util.LinkedList;
import java.util.Queue;

public class Testingqueue {
       public static void main(String[] args) {
              Queue<Integer> queue = new LinkedList<>();
              queue.add(1);
              queue.add(2);
              queue.add(3);
              queue.add(4);
              queue.offer(5);
              queue.remove(2);
              queue.poll();
              queue.peek();
              Utility.print(queue);

              // For each loop
              for (Integer integer : queue) {
                     System.out.println(integer);
              }
       }
}
