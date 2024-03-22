package Multithreading;

public class FirstTask extends Thread {
       @Override
       public void run() {
              // First Task
              for (int i = 1; i <= 10; i++) {
                     System.out.printf("%d* \n",i);                     
              }
              System.out.printf("%s :- First Task is completed ",Thread.currentThread().getName());              
       }
       
}
