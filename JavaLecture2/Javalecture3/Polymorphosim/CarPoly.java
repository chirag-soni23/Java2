package Polymorphosim;

public class CarPoly implements Vehicle{
     
       public int noOfDoors(){
              return 5;
       }
       @Override
       public void start() {
             System.out.println("Car is Starting......");
       }

}