package TrafficLights;

public enum TrafficColor {
       RED(6000),
       YELLOW(2000),
       GREEN(3000);

       private final int miliSecondsNumber;

       private TrafficColor(int miliSecondsNumber) {
              this.miliSecondsNumber = miliSecondsNumber;
       }

       public int getMiliSecondsNumber() {
              return miliSecondsNumber;
       }
       

}
