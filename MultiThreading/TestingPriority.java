import Runnable.PrintTask;

public class TestingPriority{
       public static void main(String[] args) {
              PrintTask p1 = new PrintTask('*');
              PrintTask p2 = new PrintTask('$');
              PrintTask p3 = new PrintTask('#');

              Thread t1 = new Thread(p1);
              t1.setPriority(Thread.MIN_PRIORITY);
              System.out.println("Thread 1 start");
              t1.start();

              Thread t2 = new Thread(p2);
              t2.setPriority(Thread.NORM_PRIORITY);
              System.out.println("Thread 2 start");
              t2.start();

              Thread t3 = new Thread(p3);
              t3.setPriority(Thread.MAX_PRIORITY);
              System.out.println("Thread 3 start");
              t3.start();
       }
}