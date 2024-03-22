package JavaLecture2.Accessmodifier.coder;

import JavaLecture2.Accessmodifier.coding.AccessCar;

public class Coder {
       public static void main(String[] args) {
              AccessCar myCar = new AccessCar("mercedes", "31ws", 10000, 180,
              "Abhishek");
              System.out.println(myCar.name);

              
              // error owner because it is default not public and private
              // Uncomment and check the error 👇
              // System.out.println(myCar.owner);
       }   
       
       
}
