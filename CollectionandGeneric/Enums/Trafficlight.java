package CollectionandGeneric.Enums;

public enum Trafficlight {
       RED("Stop"),GREEN("Go"),YELLOW("Ready");

       @SuppressWarnings("unused")
       private final String action;

       private Trafficlight(String action) {
              this.action = action;
       }
       
}
