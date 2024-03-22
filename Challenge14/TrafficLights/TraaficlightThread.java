package TrafficLights;

public class TraaficlightThread extends Thread{

       private final TrafficColor color;

       public TraaficlightThread(TrafficColor color) {
              this.color = color;
       }

       public TrafficColor getColor() {
              return color;
       }

      @Override
      public void run() {
       System.out.printf("%s Active \n",color);
             try {
              Thread.sleep(color.getMiliSecondsNumber());
             } catch (InterruptedException e) {
              throw new RuntimeException();
              
             }
             System.out.printf("%s Inactive \n",color);
      }
       
}
