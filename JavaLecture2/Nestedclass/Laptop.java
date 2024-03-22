package JavaLecture2.Nestedclass;

public class Laptop{
       @SuppressWarnings("unused")
       private String name;
       @SuppressWarnings("unused")
       public void repair(){
              Pendrive pendrive = new Pendrive();

       }
       public class Pendrive{
              @SuppressWarnings("unused")
              private int size;
              @SuppressWarnings("unused")
              private String name;
              public void name(){
                     name = "Lenovo";

              }

       }
}