package Multithreading;

public class ThirdTask extends Thread {
       @Override
       public void run() {
               // Third Task
               for (int i = 1; i <= 10; i++) {
                     System.out.printf("%d$ \n",i);                     
              }
              System.out.printf("%s :- Third Task is completed ",Thread.currentThread().getName()); 
              
       }
       
}
