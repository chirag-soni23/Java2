package Synchronized;

public class UpdateThread extends Thread {
       private final Counter counter;
       
       public UpdateThread(Counter counter) {
              this.counter = counter;
       }

    
       @Override
       public void run() {
              for (int i = 1; i <=10000; i++) {
                     counter.increment();                     
              }
              
       }

       
}
