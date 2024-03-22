package Abstraction;

public abstract class Vehicle implements Transport{
       @SuppressWarnings("unused")

       private int noOfWheels;

       public Vehicle(int noOfWheels) {
              this.noOfWheels = noOfWheels;
       }

       @Override
       public void getSetgo() {
              System.out.println("Get set go");
       }


       public void commute(){
              System.out.println("I am a vehicle");
       }

       


}