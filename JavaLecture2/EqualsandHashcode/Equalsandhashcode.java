package JavaLecture2.EqualsandHashcode;

public class Equalsandhashcode {
       public static void main(String[] args) {
              Person person1 = new Person("Chirag", 19, "001");
              Person person2 = new Person("Chirag", 19, "001");

              if(person1.equals(person2)){
                     System.out.println("Equals");
              }
              else{
                     System.out.println("Not equals");
              }
       }   
}
