import java.util.List;

public class Stringconcatfilterreduce {
       public static void main(String[] args) {
              List<String> strs = List.of("Chirag soni","is","a","Best developer","in","Whole world.");
             String result = strs.stream().filter(str -> str.length()>10).reduce("",(a,b)-> a + " " + b);
             System.out.println(result);
       }
}
