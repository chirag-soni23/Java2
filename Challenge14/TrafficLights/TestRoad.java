package TrafficLights;

public class TestRoad {
       public static void main(String[] args)throws InterruptedException {
              TraaficlightThread red = new TraaficlightThread(TrafficColor.RED);
              TraaficlightThread yellow = new TraaficlightThread(TrafficColor.YELLOW);
              TraaficlightThread green = new TraaficlightThread(TrafficColor.GREEN);

              green.start();
              green.join();
              yellow.start();
              yellow.join();
              red.start();
       }       
}
