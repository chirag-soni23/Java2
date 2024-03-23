import java.util.Optional;

public class OptionalString{
       public static void main(String[] args) {
              System.out.println(toOptional(null));
              System.out.println(toOptional(""));
              System.out.println(toOptional("Chirag"));
              
       }
       public static Optional<String> toOptional(String str){
              if(str == null || str.isEmpty()){
                     return Optional.empty();
              }
              return Optional.of(str.toUpperCase());

       }
       
       
}