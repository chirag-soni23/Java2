package Multithreading;

public class SecondTask extends Thread {
       @Override
       public void run() {
               // Second Task
               for (int i = 1; i <= 10; i++) {
                     System.out.printf("%d# \n",i);                     
              }
              System.out.printf("%s :- Second Task is completed ",Thread.currentThread().getName());              
       }
       
}
