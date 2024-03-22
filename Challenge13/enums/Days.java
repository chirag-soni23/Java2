package enums;
public enum Days{
       MONDAY(true),
       TUESDAY(true),
       WEDNESDAY(true),
       THRUSDAY(true),
       FRIDAY(true),
       SATURDAY(false),
       SUNDAY(false);

       private final boolean isWeekday;

       private Days(boolean isWeekday) {
              this.isWeekday = isWeekday;
       }

       public String getTypes(){
              return isWeekday ? "Weekday" : "Weekend";
       }
       

}