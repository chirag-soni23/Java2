public class Driver {
      public static void main(String[] args) {
            // Car myCar = new Car();
            // myCar.addFuel(6);
            // myCar.drive();
            // myCar.drive();
            // myCar.drive();
            // myCar.addFuel(10);
            // myCar.drive();
            // System.out.println(myCar.getCurrentfuelIncar());


            ClassCar swift = new ClassCar("red");
            swift.addFuel(3);
            swift.start();
            swift.drive();
            swift.drive();
            System.out.println(swift.getCurrentfuelIncar());
            swift.start();
            // swift.drive();
            // swift.drive();
            // swift.start();


            System.out.println("Color of swift car is: " + swift.color);

            ClassCar thar = new ClassCar();
            System.out.println("Color of thar is: " + thar.color);

      }

}
