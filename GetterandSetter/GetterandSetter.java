package GetterandSetter;

public class GetterandSetter {
       public static void main(String[] args) {
              Cycle myCycle = new Cycle(2, 30, "Red");
              myCycle.setColor("Blue");
       
              System.out.println(myCycle.getColor());
       }
}
