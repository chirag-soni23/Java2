package Multithreading;
public class NeedofMultithread{
       public static void main(String[] args) {
              long startTime = System.currentTimeMillis();
              // First Task
              for (int i = 1; i <= 10; i++) {
                     System.out.printf("%d* \n",i);                     
              }
              System.out.println("First Task is completed");

              // Second Task
              for (int i = 1; i <= 10; i++) {
                     System.out.printf("%d# \n",i);                     
              }
              System.out.println("Second Task is completed");

              // Third Task
              for (int i = 1; i <= 10; i++) {
                     System.out.printf("%d$ \n",i);                     
              }
              System.out.println("Third Task is completed");
              
              long endTime = System.currentTimeMillis();
              System.out.printf("Total Time taken:- %d",endTime-startTime);
       }
}