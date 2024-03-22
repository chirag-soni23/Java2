package CollectionandGeneric;
import java.util.HashMap;
import java.util.Map;

public class Testingmap {
       public static void main(String[] args) {
              Map<String,Integer> map = new HashMap<>();
              map.put("Chirag",20);
              map.put("Abhishek",10);
              map.put("Ravindra",30);
              System.out.println("Size of map: " + map.size());
              System.out.println(map.get("Chirag"));
              System.out.println(map.containsKey("Ravindra"));
              System.out.println(map.remove("Ravindra"));
              System.out.println("Size of map: " + map.size());

           for (String key : map.keySet()) {
              System.out.printf("%s : %s\n",key,map.get(key));
           };
       }
}
