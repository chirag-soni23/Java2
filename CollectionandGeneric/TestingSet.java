package CollectionandGeneric;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
       public static void main(String[] args) {
              Set<String> nameList = new HashSet<>();
              System.out.println(nameList.add("Chirag"));
              System.out.println(nameList.add("Abhishek"));
              System.out.println(nameList.add("Vikram"));
              System.out.println(nameList.add("Ajay"));
              nameList.remove("Ajay");
              System.out.println(nameList.add("Chirag"));
              System.out.println(nameList.contains("Chirag"));
              Utility.print(nameList);
       }
}
