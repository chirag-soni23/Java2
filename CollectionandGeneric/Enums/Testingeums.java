package CollectionandGeneric.Enums;

public class Testingeums{
       public static void main(String[] args) {
              @SuppressWarnings("unused")
              Trafficlight color = Trafficlight.RED;
              color = Trafficlight.GREEN;
              
              @SuppressWarnings("unused")
              Grade grade = Grade.A;
              grade = Grade.B;

              for (Trafficlight value : Trafficlight.values()) {
                     System.out.println(value); 
              }
       }
}