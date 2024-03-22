package GetterandSetter;
public class Cycle{
       private int noOfwheels;
       private int max_speed;
       private String color;

       

       public Cycle(int noOfwheels, int max_speed, String color) {
              this.noOfwheels = noOfwheels;
              this.max_speed = max_speed;
              this.color = color;
       }

       public int getNoOfwheels() {
              return noOfwheels;
       }

       public int getMax_speed() {
              return max_speed;
       }

       public String getColor() {
              return color;
       }

       public void setColor(String color) {
              if(color.equals("Yellow")){
                     System.out.println("You are mad");
              }
              else{
                     this.color = color;
              }
       }

}