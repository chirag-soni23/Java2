public class ThreadState  extends Thread{
       @Override
       public void run(){
           try{
               Thread.sleep(4000);
               System.out.println("\nFrom inside run " + getState());
           }catch (InterruptedException e){
               throw new RuntimeException(e);
           }
       }
   }