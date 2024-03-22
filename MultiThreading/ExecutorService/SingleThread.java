package ExecutorService;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import Runnable.PrintTask;

public class SingleThread {
       public static void main(String[] args) {
              ExecutorService service = Executors.newSingleThreadExecutor();
              PrintTask task1 = new PrintTask('*');
              PrintTask task2 = new PrintTask('#');
              PrintTask task3 = new PrintTask('$');

              service.submit(task1);
              service.submit(task2);
              service.submit(task3);
              service.shutdown();
       }
}
