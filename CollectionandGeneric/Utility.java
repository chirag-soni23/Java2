package CollectionandGeneric;
import java.util.Collection;

public class Utility {
       public static <E> void print(Collection<E> collection){
              System.out.println("Collection is:-");
              for (E colls : collection) {
                     System.out.println(colls.toString());                     
              }

       }
}
