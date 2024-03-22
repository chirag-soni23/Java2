package enums;
public class Testingday {
       public static void main(String[] args) {
              System.out.println("Printing all days");
              // System.out.println(Days.MONDAY);
              // System.out.println(Days.TUESDAY);
              // System.out.println(Days.WEDNESDAY);
              // System.out.println(Days.THRUSDAY);
              // System.out.println(Days.FRIDAY);
              // System.out.println(Days.SATURDAY);
              // System.out.println(Days.SUNDAY);

              // For-each method 👇
              for (Days days : Days.values()) {
                     System.out.printf("%s : %s\n",days,days.getTypes());
              }
              
       }
       
}
