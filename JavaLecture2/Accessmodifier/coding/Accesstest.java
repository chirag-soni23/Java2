package JavaLecture2.Accessmodifier.coding;

public class Accesstest {
       public static void main(String[] args) {
              AccessCar myCar = new AccessCar("Swift","s34rrd",5000,120,"Chirag");

              /**
               * price not show in suggestion because AccessCar.java file in price method are in private.
               */
              // System.out.println(myCar.price);
              System.out.println(myCar.name);
          }
       
}
