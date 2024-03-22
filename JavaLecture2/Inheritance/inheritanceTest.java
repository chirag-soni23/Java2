package JavaLecture2.Inheritance;

public class inheritanceTest {
       public static void main(String[] args) {
              Vehicle vehicle = new Vehicle();
              Twowheelers two = new Twowheelers();
              MotorCycle motor = new MotorCycle();
              vehicle.commute();
              System.out.println();
              two.commute();
              System.out.println();
              motor.balance();
              System.out.println();
              motor.start();

       }
}
