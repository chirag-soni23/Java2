package ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import Runnable.PrintTask;

import java.util.concurrent.ExecutorService;


public class Multithread{
       public static void main(String[] args) throws InterruptedException {
              ExecutorService service = Executors.newFixedThreadPool(3);
              for (int i = 1; i <= 10; i++) {
                     PrintTask task =  new PrintTask((char)i);
                     service.submit(task);

              }

              service.shutdown();
              System.out.println("\n********");
              if(!service.awaitTermination(10,TimeUnit.SECONDS)){
                     service.shutdown();
                     System.out.println("\n********");
              }
              
       }
}