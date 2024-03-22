package Polymorphosim;

public class Testcar {
       public static void main(String[] args) {
              // Vehicle vehicle = new Vehicle();
              CarPoly car = new CarPoly();
              // Plane plane = new Plane();
              Vehicle vCar = new CarPoly();
              // castTest(plane);
              // castTest(vehicle);
              // castTest(car);
              // castTest(plane);
              castTest(car);
              castTest(vCar);
              
                     
       }
       private static void castTest(Vehicle veh){
              veh.start();
              // Car car = new Car();
              // car.start();
              CarPoly cVehicle = (CarPoly) veh;
              System.out.println(cVehicle.noOfDoors());

       }
       
}
