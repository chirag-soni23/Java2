public class TestingState {
       public static void main(String[] args) throws InterruptedException {
              ThreadState t1 = new ThreadState();
              System.out.println("\n Create the thread " + t1.getState());
              t1.start();
              t1.join();
              System.out.println("\n Finish the thread " + t1.getState());
       }
       
}
