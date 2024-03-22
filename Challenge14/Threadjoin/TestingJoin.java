package Threadjoin;

public class TestingJoin {
       public static void main(String[] args) throws InterruptedException {
              Join t1 = new Join(1);
              Join t2 = new Join(2);
              Join t3 = new Join(3);

              t1.start();
              t1.join();
              t2.start();
              t2.join();
              t3.start();
       }
}
