package Threadjoin;

public  class Join extends Thread{
       private final int threadNumber;

       public Join(int threadNumber) {
              this.threadNumber = threadNumber;
       }

       @Override
       public void run() {
              for (int i = 1; i <=10; i++) {
                     System.out.printf("%s Thread start %d\n",Thread.currentThread().getName(),threadNumber);   
              }
              try {
                     Thread.sleep(3);
              } catch (InterruptedException e) {
                     throw new RuntimeException(e);
              }
       }

      
       
       
}
