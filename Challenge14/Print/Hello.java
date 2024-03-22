public class Hello extends Thread{
       private final int threadNumber;

       public Hello(int threadNumber) {
              this.threadNumber = threadNumber;
       }

       @Override
       public void run() {
              for (int i = 1; i <=10; i++) {
                     System.out.printf("(%d) %s Hello from Thread %d\n",i,Thread.currentThread().getName(),threadNumber);
                     
              }
       }
       


}