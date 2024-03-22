package JavaLecture2.Accessmodifier.coding;

public class AccessCar{
       public String name;
       public String model;
       private int price;
       private int max_speed;
       String owner;

       
       public AccessCar(String name, String model, int price, int max_speed,String owner) {
              this.name = name;
              this.model = model;
              this.price = price;
              this.max_speed = max_speed;
              this.owner = owner;
       }


       @Override
       public String toString() {
              return "AccessCar [name=" + name + ", model=" + model + ", price=" + price + ", max_speed=" + max_speed
                            + ", owner=" + owner + "]";
       }




      

}