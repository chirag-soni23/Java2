package CollectionandGeneric;
import java.util.ArrayList;
import java.util.List;

public class TestingList{
       public static void main(String[] args) {
              List<String> list = new ArrayList<>();
              System.out.println(list.add("Chirag"));
              System.out.println(list.add("Soni"));

              if(list.contains("Soni")){
                     System.out.println(list.indexOf("Soni"));
              }

              for (int i = 0; i < list.size(); i++) {
                     System.out.println(list.get(i)); 
              }

              // For each loop
             for (String lists : list) {
              System.out.println(lists);
             };
       }
       
}