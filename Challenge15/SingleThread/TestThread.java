import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
      ExecutorService service = Executors.newSingleThreadExecutor();
          PrintNumber task = new PrintNumber();
          service.submit(task);  
          service.shutdown();

    }
}
