package Challenge15.MultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Testsleep{
       public static void main(String[] args) throws InterruptedException{
              ExecutorService service = Executors.newFixedThreadPool(30);
              for (int i = 0; i <= 10; i++) {
                     Sleep task = new Sleep(i);
                     service.submit(task);
              }
              service.shutdown();

              if(!service.awaitTermination(10, TimeUnit.SECONDS)){
                     System.out.println("EMERGENCY SHUTDOWN");
                     service.shutdown();
              }

       }
}
