package Synchronized;

public class TestingSync {
       public static void main(String[] args) {
              Counter counter = new Counter();
              UpdateThread t1 = new UpdateThread(counter);
              UpdateThread t2 = new UpdateThread(counter);

              try {
                     t1.start();
                     t2.start();
                     t1.join();
                     t2.join();
              } catch (Exception e) {
                     System.out.println(e.getMessage());
              }
              System.out.printf("Final count is %d",counter.getCount());
       }
       
}
