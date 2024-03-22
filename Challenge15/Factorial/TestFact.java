import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class TestFact {
       public static void main(String[] args) throws InterruptedException, ExecutionException {
              ExecutorService service = Executors.newFixedThreadPool(3);
              List<Future<Integer>> list = new ArrayList<>();
              for (int i = 1; i <=10; i++) {
                     ThreadFact task = new ThreadFact(i);  
                     list.add(service.submit(task));                  
              }
             for (Future<Integer> future : list) {
              System.out.println(future.get());              
             }
             service.shutdown();
             if(!service.awaitTermination(10, TimeUnit.SECONDS)){
              System.out.println("EMERGENCY SHUT DOWN");
              service.shutdown();
             }


       }
       
}
