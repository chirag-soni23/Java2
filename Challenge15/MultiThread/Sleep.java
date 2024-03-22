package Challenge15.MultiThread;

public class Sleep implements Runnable{
       public Sleep(int i){
              
       }
       @Override
       public void run() {
              Thread current = Thread.currentThread();
              System.out.println("Create Thread " + current.getName());
              try {
                     Thread.sleep(getRandom() + 1000);
              } catch (InterruptedException e) {
                     throw new RuntimeException(e);
              }
              System.out.println("Create Thread " + current.getName());
       }

       private int  getRandom(){
              double random = Math.random() * 5 + 1;
              return (int) random;
       }


       
}
