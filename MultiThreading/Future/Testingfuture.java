package Future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Testingfuture {
       public static void main(String[] args) throws InterruptedException, ExecutionException {
              ExecutorService service = Executors.newFixedThreadPool(4);

              FetchName task1 = new FetchName("Chirag");
              FetchName task2 = new FetchName("Kartik");
              FetchName task3 = new FetchName("Ravindra");
              FetchName task4 = new FetchName("Abhishek");

              Future<String> name1 = service.submit(task1);
              Future<String> name2 = service.submit(task2);
              Future<String> name3 = service.submit(task3);
              Future<String> name4 = service.submit(task4);

              System.out.printf("Full name is %s\n",name1.get());
              System.out.printf("Full name is %s\n",name2.get());
              System.out.printf("Full name is %s\n",name3.get());
              System.out.printf("Full name is %s\n",name4.get());

              service.shutdown();
       }
}
