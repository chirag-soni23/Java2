import java.util.List;

public class PrintListname {
       public static void main(String[] args) {
              List<String> names = List.of("Chirag","Abhishek","Ravindra","Rakesh");
              names.stream().forEach(name -> System.out.println(name));
       }
}
