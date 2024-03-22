public class Concat {
       public static void main(String[] args) {
              System.out.println(concate("Chirag"));
              System.out.println(concate("Chirag","Soni"));
              System.out.println(concate("Chirag","is","a","coder"));
       }
       public static String concate(String... strs){
              StringBuilder sb = new StringBuilder();
              for (String str : strs) {
                     sb.append(str).append(" ");
                     
              }
              return sb.toString();

       }
}
